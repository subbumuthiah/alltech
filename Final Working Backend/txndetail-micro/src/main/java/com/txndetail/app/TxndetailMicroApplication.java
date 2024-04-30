package com.txndetail.app;

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
@ComponentScan({"com.txndetail.controller", "com.txndetail.service"})
@EntityScan("com.txndetail.entity")
@EnableJpaRepositories("com.txndetail.repository")
@EnableFeignClients("com.txndetail.feignclients")
@EnableDiscoveryClient
public class TxndetailMicroApplication {

	@Value("${sku.service.url}")
	private String skuServiceUrl;
	
	public static void main(String[] args) {
		SpringApplication.run(TxndetailMicroApplication.class, args);
	}
	
	@Bean
	public WebClient webClient() {
		WebClient webClient = WebClient.builder().baseUrl(skuServiceUrl).build();
		return webClient;
	}

}
