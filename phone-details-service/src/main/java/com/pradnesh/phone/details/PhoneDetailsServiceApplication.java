package com.pradnesh.phone.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PhoneDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneDetailsServiceApplication.class, args);
	}

}
