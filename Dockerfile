FROM openjdk:20
LABEL authors="george"
COPY target/postgrestestconnection-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-jar", "/app.jar"]