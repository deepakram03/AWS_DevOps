FROM openjdk:latest

ADD target/AWSDemo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 1210