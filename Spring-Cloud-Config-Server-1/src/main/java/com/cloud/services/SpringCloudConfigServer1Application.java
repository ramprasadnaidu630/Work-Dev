package com.cloud.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServer1Application {
// RAMPRASAD
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServer1Application.class, args);
	}

}
