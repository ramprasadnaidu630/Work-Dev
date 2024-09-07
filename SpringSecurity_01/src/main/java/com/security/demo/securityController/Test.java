package com.security.demo.securityController;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Test {

	@GetMapping("/")
	public String get(HttpServletRequest request) {
		return "Welcome to mhy WebSite " + request.getSession().getId();
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
