FROM maven:3.9-eclipse-temurin-21 AS builder
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
ADD . /usr/src/app
RUN mvn package

FROM eclipse-temurin:21-jdk-alpine
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY --from=builder /usr/src/app/target/GarageRetention-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]