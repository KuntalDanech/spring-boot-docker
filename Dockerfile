FROM openjdk:8
VOLUME /temp
EXPOSE 8080
ADD target/SpringBoot2RestProject-0.0.1-SNAPSHOT.jar SpringBoot2RestProject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringBoot2RestProject-0.0.1-SNAPSHOT.jar"]