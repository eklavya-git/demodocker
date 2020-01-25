FROM openjdk:latest

ADD target/demo-docker.jar

ENTRYPOINT ["java","-jar","demo-docker.jar"]

EXPOSE 8080