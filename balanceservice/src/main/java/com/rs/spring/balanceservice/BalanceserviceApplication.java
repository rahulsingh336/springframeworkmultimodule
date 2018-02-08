package com.rs.spring.balanceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BalanceserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalanceserviceApplication.class, args);
	}
}
