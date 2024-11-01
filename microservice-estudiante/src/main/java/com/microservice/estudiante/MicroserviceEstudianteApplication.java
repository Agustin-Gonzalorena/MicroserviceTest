package com.microservice.estudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceEstudianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEstudianteApplication.class, args);
	}

}
