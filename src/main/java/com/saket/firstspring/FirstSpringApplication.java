package com.saket.firstspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		log.info("Spring application is starting....");
		SpringApplication.run(FirstSpringApplication.class, args);
	}

}
