FROM openjdk:8-jre-alpine

MAINTAINER Hari

ADD target/*.jar /boot-configserver.jar

CMD ["java","-Dspring.profiles.active=docker","-jar","/boot-configserver.jar"]

EXPOSE 8888


