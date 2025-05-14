package com.pawUser.PawUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PawUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PawUserApplication.class, args);
	}

}
