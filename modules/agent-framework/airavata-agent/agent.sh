#!/bin/bash -x

# #####################################################################
# Airavata Agent Bootstrapper
# #####################################################################
#
# ----------------------------------------------------------------------
# CONTRIBUTORS
# ----------------------------------------------------------------------
# * Dimuthu Wannipurage
# * Lahiru Jayathilake
# * Yasith Jayawardana
# ######################################################################

#-----------------------------------------------------------------------
# STEP 1 - PARSE COMMAND LINE ARGS
#-----------------------------------------------------------------------

# Default values
CS_HOME=$HOME/cybershuttle
WORKDIR=$CS_HOME/workspace
AGENT=""
SERVER=""
CONTAINER=""
BIND_OPTS=()

PARSED_OPTIONS=$(getopt -o '' --long server:,agent:,container:,bind: -n "$0" -- "$@")
if [ $? -ne 0 ]; then
    echo "Usage: $0 --server SERVER --agent AGENT --container CONTAINER [--bind BIND] ..."
    exit 1
fi
eval set -- "$PARSED_OPTIONS"

while true; do
    case "$1" in
        --server)    SERVER="$2";  shift 2 ;;
        --agent)     AGENT="$2";   shift 2 ;;
        --container) CONTAINER="$2"; shift 2 ;;
        --bind)      BIND_OPTS+=("--bind $2:ro"); shift 2 ;;
        --)          shift; break ;;
        *) echo "Unexpected option: $1"; exit 1 ;;
    esac
done

# Final values
echo "CS_HOME=$CS_HOME"
echo "WORKDIR=$WORKDIR"
echo "AGENT=$AGENT"
echo "SERVER=$SERVER"
echo "CONTAINER=$CONTAINER"
echo "BIND_OPTS=$BIND_OPTS"

# ----------------------------------------------------------------------
# STEP 2 - RUN AGENT
# ----------------------------------------------------------------------
KERNEL_SOCK=$(mktemp) singularity exec \
  --fakeroot \
  --bind $WORKDIR:/scratch:ro ${BIND_OPTS[@]} \
  $CS_HOME/container/$CONTAINER /opt/airavata-agent $SERVER:19900 $AGENT $@
