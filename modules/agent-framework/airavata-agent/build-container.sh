env GOOS=linux GOARCH=amd64 go build
cp airavata-agent airavata-agent-linux
docker build --platform linux/x86_64 -t yasithmilinda/airavata-agent .
docker push yasithmilinda/airavata-agent 