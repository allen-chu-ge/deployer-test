FROM openjdk:8-jdk-alpine
MAINTAINER Predix Analytics
VOLUME /tmp/deployer
EXPOSE 8080
ARG JAR_FILE=target/deployer-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} deployer.jar
ENTRYPOINT ["java","-jar","/deployer.jar"]