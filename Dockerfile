FROM openjdk:8

WORKDIR /application
COPY target/docker-text.jar /application/app.jar

CMD ["/bin/sh", "-c", "java -jar /application/app.jar"]