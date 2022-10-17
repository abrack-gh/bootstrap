package com.udacity.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootstrapApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(BootstrapApplication.class, args);
		} catch(Exception e) {
			e.printStackTrace();
		}
		}


}
