FROM openjdk:11

EXPOSE 8084

COPY target/*.jar /

ENTRYPOINT ["java","-jar","jwt-auth-service-0.0.1-SNAPSHOT.jar"]