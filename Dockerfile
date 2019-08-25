FROM openjdk:8

WORKDIR /application
COPY target/docker-text.jar /application/app.jar
COPY docker-compose.yml /application/docker-compose.yml

CMD ["/bin/sh", "-c", "java -jar /application/app.jar"]