package com.apps.microservice.userconverterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserConverterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserConverterServiceApplication.class, args);
	}

}
