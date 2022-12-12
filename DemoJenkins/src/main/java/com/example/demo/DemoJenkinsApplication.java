package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoJenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(DemoJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application started");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApplication.class, args);
		logger.info("Application executing");
		System.out.println("Application running");
	}

}
