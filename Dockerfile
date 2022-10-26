FROM openjdk:8
LABEL maintainer="krishnendu"
ADD target/OnlineExamSystem-0.0.1-SNAPSHOT.jar examrig-online-exam-system.jar
ENTRYPOINT ["java", "-jar", "examrig-online-exam-system.jar"]
