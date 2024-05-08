package com.sku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sku.request.CreateSkuRequest;
import com.sku.response.SkuResponse;
import com.sku.service.SkuService;

import java.util.List;

@RestController
@RequestMapping("/api/sku")
@CrossOrigin(origins = "*")
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

	@GetMapping("/getAll")
	public List<SkuResponse> getAll(){
		return skuService.getAll();
	}

//	public SkuResponse
}
