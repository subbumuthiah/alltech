package com.txn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
//import com.transactions.entity.Transaction;
//import com.transactions.request.CreateTransactionRequest;
//import com.transactions.response.TransactionResponse;
//import com.transactions.service.TransactionService;
import com.txn.response.TxnResponse;
import com.txn.service.TxnService;

@RestController
@RequestMapping("/api/txn")
public class TxnController {

	@Autowired
	TxnService txnService;
	
//	@PostMapping("/create")
//	public TxnResponse createTransactions (@RequestBody CreateTransactionRequest createTransactionRequest) {
//		return txnService.createTransaction(createTransactionRequest);
//	}
	
	@GetMapping("/getById/{id}")
	public TxnResponse getById(@PathVariable int id) {
		return txnService.getById(id);
	}
}
