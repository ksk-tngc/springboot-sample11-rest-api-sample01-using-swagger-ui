package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "タスクAPI", version = "1.0.0", description = "これはタスクアプリケーションに関するAPIです"))
@SpringBootApplication
public class SpringRest4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRest4Application.class, args);
	}

}
