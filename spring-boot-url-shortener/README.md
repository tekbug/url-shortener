# Spring Boot URL Shortener

URL Shortener is a service that shortens a long URL into a short URL which is easier to share.

## Prerequisites
* Java 21
* Docker

## Tech Stack
* Spring Boot
* Spring Security
* Spring Data JPA
* PostgreSQL
* FlywayDb Migrations
* Thymeleaf
* Bootstrap CSS

```shell
# To build Docker image
$  ./mvnw spring-boot:build-image

# To build Docker image with custom name
$  ./mvnw spring-boot:build-image -DdockerImageName=your_image_name/spring-boot-url-shortener
```
