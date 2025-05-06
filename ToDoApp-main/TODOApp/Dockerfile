# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17-slim AS builder
WORKDIR /app
COPY . .
WORKDIR /app/TODOApp
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/TODOApp/target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
