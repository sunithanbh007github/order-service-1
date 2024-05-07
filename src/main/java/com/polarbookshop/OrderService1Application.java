package com.polarbookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class OrderService1Application {

	public static void main(String[] args) {
		SpringApplication.run(OrderService1Application.class, args);
	}

}
