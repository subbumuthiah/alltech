package com.user.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.user.controller", "com.user.service"})
@EntityScan("com.user.entity")
@EnableJpaRepositories("com.user.repository")
@EnableDiscoveryClient
public class UserMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMicroApplication.class, args);
	}

}
