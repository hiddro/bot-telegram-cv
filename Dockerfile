FROM eclipse-temurin:17-jdk-focal
EXPOSE 8080
ADD target/telegram-bot-cv.jar telegram-bot-cv.jar
ENTRYPOINT ["java", "-jar", "/telegram-bot-cv.jar"]