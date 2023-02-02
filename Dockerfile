FROM openjdk:17-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} openshift-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/openshift-0.0.1-SNAPSHOT.jar"]