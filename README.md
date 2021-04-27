# Spring Boot deployment using container based deployment (using Docker)

Shows how to deploy the Spring boot app in a container based deployment framework using Dcoker. Here added Docker file in the project file. After downloading run the below command using docker.

Build a Docker image
```sh
sudo docker build -f Dockerfile -t springboottag .
```

See Docker images 
```sh
sudo docker image ls
```

run the docker command and container will start

```sh
sudo docker run -p 8080:8080 springboottag
```

List out any running containers in the docker
```sh
sudo docker ps
```

List out all containers details
```sh
sudo docker ps -a
```
Login in dockerhub repository
```sh
sudo docker login
```
create a tag
```sh
sudo docker tag springbootdockertag <dockerId>/springboottag:latest
```

push the tag in to docker hub
```sh
docker push <dockerId>/springboottag:latest
```

Funally docker pull command
```sh
docker pull <dockerId>/springboottag
```
