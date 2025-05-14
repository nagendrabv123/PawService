package com.example.PawServiceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PawServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PawServiceRegistryApplication.class, args);
	}

}
