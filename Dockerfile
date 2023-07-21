FROM openjdk:17-oracle
VOLUME tmp
ARG JAR_FILE
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
