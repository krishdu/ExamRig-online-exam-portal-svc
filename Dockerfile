#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
LABEL maintainer="krishnendu"
COPY --from=build /home/app/target/exam-rig-online-exam-system.jar /usr/local/lib/exam-rig-online-exam-system.jar
ENTRYPOINT ["java", "-jar", "/usr/local/lib/exam-rig-online-exam-system.jar"]
