package com.niks.chardead;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ChardeadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChardeadApplication.class, args);
	}

}
