FROM amazoncorretto:17-alpine-jdk
COPY target/examen2-0.0.1-SNAPSHOT.jar.original
ENTRYPOINT ["java","-jar","/app.jar"]