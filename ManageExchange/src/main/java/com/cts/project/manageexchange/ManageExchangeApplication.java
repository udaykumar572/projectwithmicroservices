package com.cts.project.manageexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ManageExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageExchangeApplication.class, args);
	}

}
