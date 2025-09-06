# Use an official OpenJDK base image
FROM openjdk:26-trixie


# Copy the JAR file into the container
ADD target/student-app.jar student-app.jar


# Run the JAR when the container starts
ENTRYPOINT ["java", "-jar", "/student-app.jar"]