package com.sku.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sku.entity.Sku;
import com.sku.repository.SkuRepository;
import com.sku.request.CreateSkuRequest;
import com.sku.response.SkuResponse;

import java.util.List;
import java.util.stream.Collectors;

//import com.sku.*;
@Service
public class SkuService {

	Logger logger = LoggerFactory.getLogger(SkuService.class);
	
	@Autowired
	SkuRepository skuRepository;
	
	public SkuResponse createSku(CreateSkuRequest createSkuRequest) {
		Sku sku = new Sku();
//		product.setProduct_category(createProductRequest.getProduct_category());
//		product.setProduct_name(createProductRequest.getProduct_name());
//		product.setProduct_price(createProductRequest.getProduct_price());
//		product.setStock_level(createProductRequest.getStock_level());
//		product.setStock_update_date(createProductRequest.getStock_update_date());
		sku.setProduct_category(createSkuRequest.getProduct_category());
		sku.setProduct_name(createSkuRequest.getProduct_name());
		sku.setProduct_price(createSkuRequest.getProduct_price());
		sku.setStock_level(createSkuRequest.getStock_level());
		sku.setStock_update_date(createSkuRequest.getStock_update_date());

//		productRepository.save(product);
		skuRepository.save(sku);
		
//		return new ProductResponse(product);
		
		return new SkuResponse(sku);
		
	}
	
	public SkuResponse getById (int id) {
		logger.info("Inside getById " + id);
		Sku sku = skuRepository.findById(id).get();
		return new SkuResponse(sku);
	}

	public List<SkuResponse> getAll(){
		return skuRepository.findAll().stream().map(SkuResponse::new).collect(Collectors.toList());
	}
}
