package com.letsEat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.letsEat"})
@SpringBootApplication
public class LetsEatApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetsEatApplication.class, args);
	}

}
