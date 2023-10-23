FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
COPY target/*.jar ApiRest_Dos.jar
ENTRYPOINT ["java","-jar","/ApiRest_Dos.jar"]
EXPOSE 8080
