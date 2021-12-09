package com.shc.signage.FunctionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class FunctionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunctionDemoApplication.class, "--management.endpoints.web.exposure.include=functions");
	}

	@Bean
	public Function<String, String> reverseString() {
		return value -> new StringBuilder(value).reverse().toString();
	}
}
