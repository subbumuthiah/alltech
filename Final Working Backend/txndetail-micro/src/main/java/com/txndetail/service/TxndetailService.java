package com.txndetail.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

//import com.txnLineItem.entity.Product;

import reactor.core.publisher.Mono;
//import com.txndetail.*;
import com.txndetail.app.*;
import com.txndetail.controller.*;
import com.txndetail.dto.TxnDto;
import com.txndetail.dto.UserDto;
import com.txndetail.entity.*;
import com.txndetail.feignclients.*;
import com.txndetail.repository.*;
import com.txndetail.request.*;
import com.txndetail.response.*;
import com.txndetail.service.*;
import com.txndetail.entity.Txndetail;
import com.txndetail.feignclients.SkuFeignClient;
import com.txndetail.repository.TxndetailRepository;
import com.txndetail.request.CreateTxndetailRequest;
import com.txndetail.response.TxndetailResponse;
@Service
public class TxndetailService {

	@Autowired
	TxndetailRepository txndetailRepository;
	
	@Autowired
	WebClient webClient;
	
	@Autowired
	SkuFeignClient skuFeignClient;
	
//	public TxndetailService createTxnLineItem(CreateTxndetailRequest createTxndetailRequest) {
//		Txndetail txndetail = new Txndetail();
////		txnLineItem.setProduct_id(createTxnLineItemRequest.getProduct_id());
////		txnLineItem.setTxnLineItem_id(createTxnLineItemRequest.getTxnLineItem_id());
////		txnLineItem.setQuantity(createTxnLineItemRequest.getQuantity());
////		txnLineItem.setTxn_id(createTxnLineItemRequest.getTxn_id());
//		txndetail.setQuantity(createTxndetailRequest.getQuantity());
////		txndetail.setTxn_details_id(createTxndetailRequest.get);
//
//		txndetail = txndetailRepository.save(txndetail);
//		
//		TxndetailResponse txndetailResponse =  new TxndetailResponse(txndetail);
//		txndetailResponse.setSku_no(skuFeignClient.getById(txndetail.getSku_no()));
//		return txndetailResponse;
//	}
	
	public TxndetailResponse getById (int id) {
//		Txndetail txndetail = txndetailRepository.findById(id).get();
//		TxndetailResponse txndetailResponse = new TxndetailResponse(txndetail);
////		txnLineItemResponse.setSku_no(skuFeignClient.getById(txnLineItem.getSku_no()));
//		txndetail.setSku_no(skuFeignClient.getById(txnLineItem.getSku_no()));
//		return txnLineItemResponse;
		return txndetailRepository.findById(id).map(txndetail -> {
			SkuResponse s = skuFeignClient.getById(txndetail.getSku_no().getSku_no());
			TxnDto txnDto = convertToTxnDto(txndetail.getTxn());
			return new TxndetailResponse(txndetail.getTxn_details_id(),txnDto, s, txndetail.getQuantity());
		}).orElseThrow(() -> new RuntimeException("err"));
	}
	private TxnDto convertToTxnDto(Txn txn) {
		UserDto u = null;
		u = new UserDto(txn.getUser().getUser_id(), txn.getUser().getUser_name());
		return new TxnDto(txn.getTxn_id(), u);
	}
//	public ProductResponse getProductById (int id) {
//		Mono<ProductResponse> productResponse = webClient.get().uri("/getById/" + id).retrieve().bodyToMono(ProductResponse.class);
//		return productResponse.block();
//	}
//	
//	public List<TxnLineItemResponse> getTransactionById(int id) {
//		List<TxnLineItem> tliList = txnLineItemRepository.findByTxnId(id);
//		List<TxnLineItemResponse> tliRList = new ArrayList<>();
//		
//		for(TxnLineItem tli : tliList) {
//			TxnLineItemResponse tlir = new TxnLineItemResponse(tli);
//			tlir.setProductResponse(productFeignClient.getById(tli.getProduct_id()));
//			tliRList.add(tlir);
//		}
//		return tliRList;
//		
//	}

}
