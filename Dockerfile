ARG NAME=mymaven
FROM maven:3.9.6

ENV NAME=mymaven
RUN mkdir -p "/usr/src/${NAME}"
COPY . "/usr/src/${NAME}"

WORKDIR "/usr/src/${NAME}"
COPY ./src/main/resources/application-docker.properties ./src/main/resources/application.properties

# CMD ["mvn", "clean", "install", "&&", "java", "-jar", "./target/gerenciador-tarefas-0.0.1-SNAPSHOT.jar"]
CMD ["mvn", "spring-boot:run"]
