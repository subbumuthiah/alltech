package com.sku.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@ComponentScan({"com.sku.controller", "com.sku.service"})
@EntityScan("com.sku.entity")
@EnableJpaRepositories("com.sku.repository")
@EnableDiscoveryClient
public class SkuMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkuMicroApplication.class, args);
	}

}
