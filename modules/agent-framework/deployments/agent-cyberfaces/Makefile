IMAGE_NAME=cybershuttle/remote-agent-cyberfaces
AGENT_SVC_URL=api.gateway.cybershuttle.org:19900
AGENT_ID=test

build-container:
	docker build --platform linux/amd64 -t $(IMAGE_NAME) . && \
	docker push $(IMAGE_NAME)

run-container:
	docker run -it $(IMAGE_NAME) /opt/airavata-agent $(AGENT_SVC_URL) $(AGENT_ID)

deploy-anvil:
	ssh x-waterhub@anvil.rcac.purdue.edu srun -p shared --mem 6G -t 40 singularity pull \
	--disable-cache \
	--force \
	cybershuttle/container/remote-agent-cyberfaces.sif \
	docker://$(IMAGE_NAME)
