package com.athmin.cafate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@ComponentScan({ "com.athmin.cafate.controller" })
public class CafateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CafateApplication.class, args);
	}
}
