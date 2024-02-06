FROM openjdk:21
RUN ls
ADD cricket/cricket/target/cricket-elastic.jar cricket-elastic.jar
ENTRYPOINT ["java", "-jar", "/cricket-elastic.jar"]