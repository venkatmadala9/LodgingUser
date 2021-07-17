package com.lodging.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lodging.domain"})
public class LodgingUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(LodgingUserApplication.class, args);
	}

}
