FROM openjdk:17-alpine
EXPOSE 9094
ADD target/poc-backend-test-devops.jar poc-backend-test-devops.jar
ENTRYPOINT ["java","-jar","/poc-backend-test-devops.jar"]