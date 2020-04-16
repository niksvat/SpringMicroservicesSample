package com.niks.charlive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CharliveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharliveApplication.class, args);
	}

}
