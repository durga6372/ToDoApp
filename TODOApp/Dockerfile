# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the local code to the container
COPY target/ToDoApp.jar /app/ToDoApp.jar

# Run the application
CMD ["java", "-jar", "ToDoApp.jar"]
