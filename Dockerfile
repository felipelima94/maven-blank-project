FROM openjdk:14 as build

WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw package

FROM openjdk:14


COPY --from=build /workspace/app/target/blank-procject-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Xms400m","-Xmx400m","/app.jar"]
