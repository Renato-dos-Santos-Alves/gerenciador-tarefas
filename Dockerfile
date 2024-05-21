ARG NAME=mymaven
FROM maven:3.9.6

ENV NAME=mymaven
RUN mkdir -p "/usr/src/${NAME}"
COPY . "/usr/src/${NAME}"

WORKDIR "/usr/src/${NAME}"

CMD ["./mvnw", "spring-boot:run"]
