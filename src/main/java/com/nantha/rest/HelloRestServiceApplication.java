package com.nantha.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.nantha.rest")
@SpringBootApplication
public class HelloRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRestServiceApplication.class, args);
	}

}
