# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from the host machine into the container
COPY target/discovery-server-0.0.1-SNAPSHOT.jar discovery-server.jar

# Make port 8761 available to the world outside this container
EXPOSE 8761

# Run the JAR file
ENTRYPOINT ["java", "-jar", "discovery-server.jar"]
