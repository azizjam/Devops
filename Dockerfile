FROM maven:3.8.2-jdk-8
COPY  target/DEVOPS_AAO.jar eventProject-1.0.jar
EXPOSE 8089

ENTRYPOINT ["java", "-jar", "eventProject-1.0.jar"]
