package com.txn.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan({"com.txn.controller", "com.txn.service"})
@EntityScan("com.txn.entity")
@EnableJpaRepositories("com.txn.repository")
@EnableFeignClients("com.txn.feignclients")
@EnableDiscoveryClient
public class TxnMicroApplication {

	@Value("${purchases.service.url}")
	private String purchasesServiceUrl;
	
	@Value("${users.service.url}")
	private String usersServiceUrl;
	
	public static void main(String[] args) {
		SpringApplication.run(TxnMicroApplication.class, args);
	}
	@Bean
	public WebClient webClient() {
//		WebClient webClient = WebClient.builder().baseUrl(usersServiceUrl).build();
		WebClient webClient = WebClient.builder().build();
		return webClient;
	}

}
