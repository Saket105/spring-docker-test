FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/FirstSpring-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9595
ENTRYPOINT ["java", "-jar", "app.jar"]