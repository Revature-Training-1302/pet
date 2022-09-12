package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("prod.properties")
public class PetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetApplication.class, args);
	}

}
