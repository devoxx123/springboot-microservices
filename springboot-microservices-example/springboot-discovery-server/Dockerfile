FROM openjdk:8-jre-alpine

MAINTAINER Hari

ADD target/*.jar /boot-discovery-server.jar

CMD ["java","-Dspring.profiles.active=docker","-jar","/boot-discovery-server.jar"]

EXPOSE 8761


