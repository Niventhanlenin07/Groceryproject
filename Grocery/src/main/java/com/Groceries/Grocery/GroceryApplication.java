package com.Groceries.Grocery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.Groceries.Grocery")
public class GroceryApplication {
	public static void main(String[] args) {
		SpringApplication.run(GroceryApplication.class, args);
		System.out.println("Run successfully...");
	}
}
