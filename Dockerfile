FROM openjdk:8
ENV env_profile $env_profile
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=$env_profile"]