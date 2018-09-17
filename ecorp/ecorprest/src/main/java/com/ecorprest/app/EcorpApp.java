package com.ecorprest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.ecorprest.app", "com.ecorprest.controller", "com.ecorprest.service" })
public class EcorpApp {

	public static void main(String[] args) {
		SpringApplication.run(EcorpApp.class, args);
	}

}
