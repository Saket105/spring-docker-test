FROM openjdk
COPY target/FirstSpring-0.0.1-SNAPSHOT.jar FirstSpring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=9595"]
EXPOSE 9595