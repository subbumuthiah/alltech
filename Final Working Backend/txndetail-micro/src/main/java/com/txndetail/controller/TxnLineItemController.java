package com.txndetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.TxnLineItem.request.CreateTxnLineItemRequest;
//import com.TxnLineItem.response.TxnLineItemResponse;
//import com.TxnLineItem.service.TxnLineItemService;
import com.txndetail.response.TxndetailResponse;
import com.txndetail.service.TxndetailService;
//import com.TxnLineItem.*;
@RestController
@RequestMapping("/api/txndetail")
public class TxnLineItemController {

	@Autowired
	TxndetailService txndetailService;
	
//	@PostMapping("/create")
//	public TxndetailResponse createTxndetail(@RequestBody CreateTxnLineItemRequest createTxnLineItemRequest) {
//		return txnLineItemService.createTxnLineItem(createTxnLineItemRequest);
//	}
	@GetMapping("getById/{id}")
	public TxndetailResponse getById(@PathVariable int id) {
		return txndetailService.getById(id);
	}
	
//	@GetMapping("/getByTransactionId/{id}")
//	public ResponseEntity<List<TxnLineItemResponse>> getByTransactionId(@PathVariable int id){
//		List<TxnLineItemResponse> txnliR = txnLineItemService.getTransactionById(id);
//		return ResponseEntity.ok(txnliR);
//		//		return txnLineItemService.get
//	}
//	
//	
//	@Query(value = "select tli1_0.txn_line_item_id from txnlineitem tli1_0 where tli1_0.txn_id={id}")
//	@GetMapping("/test")
//	List<Integer> findalllineitems(@PathVariable int id){
//		return null;
//		
//	}
	
}

