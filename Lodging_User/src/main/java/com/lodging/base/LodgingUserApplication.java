package com.lodging.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lodging.*")
@EnableAutoConfiguration
public class LodgingUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(LodgingUserApplication.class, args);
	}

}
