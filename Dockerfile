FROM openjdk:8-jdk-alpine
EXPOSE 8090
ADD target target
ENTRYPOINT ["java","-jar","target/timesheet.war"]
