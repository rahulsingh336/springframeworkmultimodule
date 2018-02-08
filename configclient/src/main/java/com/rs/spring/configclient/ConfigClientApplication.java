package com.rs.spring.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ConfigClientApplication {

	@Value("${key:default}")
	private String value;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}


	@PostConstruct
	void init(){
		System.out.println("Testing Config server");
		System.out.println(value);
	}

}
