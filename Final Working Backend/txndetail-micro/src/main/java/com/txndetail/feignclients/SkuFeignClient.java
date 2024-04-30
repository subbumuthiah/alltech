package com.txndetail.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.txndetail.response.SkuResponse;

@FeignClient(url = "${sku.service.url}", value = "sku-feign-client", path = "/api/sku")
public interface SkuFeignClient {
	
//	@GetMapping("/getById/{id}")
//	public SkuResponse getById(@PathVariable int id);
	
	@GetMapping("/getById/{id}")
	public SkuResponse getById(@PathVariable int id);
}
