package com.usman.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.usman.readYmlClass")
@SpringBootApplication
public class ReadYmlFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadYmlFileApplication.class, args);
	}

}
