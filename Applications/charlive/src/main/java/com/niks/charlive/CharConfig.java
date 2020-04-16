package com.niks.charlive;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CharConfig {

	
	@Bean @LoadBalanced
	RestTemplate res() {
		return new RestTemplate();
	}
	
}
