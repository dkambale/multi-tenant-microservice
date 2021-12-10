package com.codingworld.multitenant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.codingworld.multitenant.*")
public class MultiTenantApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiTenantApplication.class, args);
	}

}
