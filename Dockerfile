FROM openjdk:8
EXPOSE 8081
ADD target/jsondb.jar jsondb.jar
ENTRYPOINT ["java", "jar", "jsondb.jar"]
