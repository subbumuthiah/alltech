package com.sku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sku.request.CreateSkuRequest;
import com.sku.response.SkuResponse;
import com.sku.service.SkuService;

@RestController
@RequestMapping("/api/sku")
public class SkuController {

	@Autowired
	SkuService skuService;
	
	@PostMapping("/create")
	public SkuResponse createSku (@RequestBody CreateSkuRequest createSkuRequest) {
		return skuService.createSku(createSkuRequest);
	}
	
	@GetMapping("/getById/{id}")
	public SkuResponse getById(@PathVariable int id) {
		return skuService.getById(id);
	}
}
