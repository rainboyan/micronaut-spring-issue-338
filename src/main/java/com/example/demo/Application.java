package com.example.demo;

import io.micronaut.spring.context.MicronautApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder();
		MicronautApplicationContext context = new MicronautApplicationContext();
		context.start();
		builder.parent(context);
		builder.sources(Application.class);
		builder.build().run();
	}

}
