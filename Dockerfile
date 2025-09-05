FROM openjdk
COPY target/FirstSpring-0.0.1-SNAPSHOT.jar FirstSpring-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","FirstSpring-0.0.1-SNAPSHOT.jar"]
EXPOSE 9595