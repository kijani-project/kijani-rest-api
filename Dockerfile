FROM openjdk:17-jdk
ARG JAR_FILE=./target/rest-api-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
CMD ["java", "-jar", "app.jar"]
