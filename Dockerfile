# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/API-workflow-0.0.1-SNAPSHOT.jar  /app/app.jar

# Expose the port the application runs on
EXPOSE 8081

# Command to run the application
CMD ["java", "-jar", "/app/app.jar"]
