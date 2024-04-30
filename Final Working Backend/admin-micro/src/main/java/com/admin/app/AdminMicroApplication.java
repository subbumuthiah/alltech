package com.admin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.admin.controller", "com.admin.service"})
@EntityScan("com.admin.entity")
@EnableJpaRepositories("com.admin.repository")
@EnableDiscoveryClient
public class AdminMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminMicroApplication.class, args);
	}

}
