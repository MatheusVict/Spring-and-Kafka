# Spring with Apache kafka 

A Spring API using Kafka with producers and consumers 

### Used Technologies

* [Java](https://www.java.com/en/)
* [Docker](https://www.docker.com/)
* [Kafka](https://kafka.apache.org/)
* [Zookeeper](https://zookeeper.apache.org/)

## Necessaries Versions and Dependencies

* Docker - Version: 25.0.3
* Java - Version: 17 or higher

### Getting started

```shell
docker compose up -d
```

```shell
./mvnw clean package
```

After that run:

```shell
java -jar spring-messaging-with-kafka-0.0.1-SNAPSHOT.jar
```

It'll be able on [localhost:8080](http://localhost:8080)

## Routes

```http request
    GET /kafka/topic/{your message here}
```

after OK look at logs.

