FROM adoptopenjdk/maven-openjdk11

COPY target/brs-eureka-server-1.0.0.jar app.jar

EXPOSE 8070:8070

RUN apt-get update
RUN apt-get install -y gcc
RUN apt-get install -y curl

ENTRYPOINT ["java","-jar","app.jar"]