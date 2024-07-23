# Use a base image with JDK
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY target/task-management-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which the application will run
EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
