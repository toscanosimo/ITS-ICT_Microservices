FROM maven:3.6.3-jdk-8-slim as builder
ARG MVN_ARGS
ADD ./src/ /app/src/
ADD ./pom.xml /app/pom.xml
WORKDIR /app
RUN mvn --batch-mode package ${MVN_ARGS}

FROM openjdk:11
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8103
ENTRYPOINT ["java","-jar","app.jar"]