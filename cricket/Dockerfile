FROM openjdk:21
RUN echo "$PWD"
ADD cricket/target/cricket-elastic.jar cricket-elastic.jar
ENTRYPOINT ["java", "-jar", "/cricket-elastic.jar"]