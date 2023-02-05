## microservices-spring-cloud

A simple Rest Microservices built with Spring Cloud, Spring Boot and other Tech Stacks for the demo.

## Project Architecture - 

![architecture](https://user-images.githubusercontent.com/8009104/215452205-6524145c-032e-4510-b41a-17bf450b6744.png)

## Tools and Technologies

- Java 11
- Spring Boot
- Spring Web MVC
- Spring Cloud - Open Feign
- Spring Cloud - Netflix Eureka Server
- Spring Cloud Config Server
- Fault Tolerant with resilence4J (circuit breaker pattern)
- Spring Cloud API Gateway
- Maven


## Docker command to pull images and run the containers

docker run -p 8761:8761 tendawa123/eureka-name-server:0.0.1-SNAPSHOT

docker run -p 8888:8888 tendawa123/spring-cloud-config-server:0.0.1-SNAPSHOT

docker run -p 8000:8000 tendawa123/fetch-user-service:0.0.1-SNAPSHOT

docker run -p 8001:8001 tendawa123/user-converter-service:0.0.1-SNAPSHOT

docker run -p 8765:8765 tendawa123/api-gateway:0.0.1-SNAPSHOT

