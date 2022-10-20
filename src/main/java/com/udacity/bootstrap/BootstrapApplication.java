package com.udacity.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class BootstrapApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(BootstrapApplication.class, args);
		} catch(Exception e) {
			e.printStackTrace();
		}
		}


}
