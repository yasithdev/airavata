cd ../../../../../
env GOOS=linux GOARCH=amd64 go build
cp airavata-agent jupyter/deployments/cerebrum/v1l4/agent/airavata-agent-linux
cd jupyter/deployments/cerebrum/v1l4/agent
docker build --platform linux/x86_64 -t lahiruj/airavata-cerebrum-agent .
docker push lahiruj/airavata-cerebrum-agent