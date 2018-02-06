package com.rs.springframework.demotracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class DemotracingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemotracingApplication.class, args);
	}
}
