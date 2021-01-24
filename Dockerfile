FROM openjdk:latest

VOLUME /tmp
WORKDIR /AWSDemo

RUN apt-get update  
RUN apt-get install -y maven

ADD pom.xml /AWSDemo/pom.xml  
RUN ["mvn", "dependency:resolve"]  
RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
ADD src /AWSDemo/src  
RUN ["mvn", "package"]

ADD target/AWSDemo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 1210