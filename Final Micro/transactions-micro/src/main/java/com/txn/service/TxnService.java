package com.txn.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import com.txn.dto.TxndetailDto;
import com.txn.dto.UserDto;
import com.txn.entity.Txn;
import com.txn.entity.Txndetail;
import com.txn.feignclients.TxnFeignClient;
import com.txn.feignclients.UserFeignClient;
//import com.transactions.entity.Transaction;
//import com.transactions.feignclients.PurchaseFeignClient;
//import com.transactions.feignclients.UserFeignClient;
//import com.transactions.repository.TransactionRepository;
//import com.transactions.request.CreateTransactionRequest;
//import com.transactions.response.TxnLineItemResponse;
//import com.transactions.response.TransactionResponse;
//import com.transactions.response.UserResponse;
import com.txn.repository.TxnRepository;
import com.txn.response.TxnResponse;
import com.txn.response.UserResponse;
//import com.transactions.app.*;

@Service
public class TxnService {

	@Autowired
	TxnRepository txnRepository;
	
	@Autowired
	WebClient webClient;
	
	@Autowired
	TxnFeignClient txnFeignClient;
	
	@Autowired
	UserFeignClient userFeignClient;
	@Value("${purchases.service.url}")
	private String purchasesServiceUrl;
	@Value("${users.service.url}")
	private String usersServiceUrl;
	
	
//	public TxnResponse createTransaction(CreateTransactionRequest createTransactionRequest) {
//		Transaction t = new Transaction();
//		t.setTxn_id(createTransactionRequest.getTxn_id());
//		t.setUser_id(createTransactionRequest.getUser_id());
//		
//		t = transactionRepository.save(t);
//		
//		TransactionResponse transactionResponse = new TransactionResponse(t);
//		transactionResponse.setUserResponse(userFeignClient.getById(t.getUser_id()));
//		return transactionResponse;
//	}
	
//	public TxnResponse getById (int id) {
//		Txn t = txnRepository.findById(id).get();
//		TxnResponse transactionResponse = new TxnResponse(t);
//		transactionResponse.setUserResponse(userFeignClient.getById(t.getUser_id()));
////		List<PurchaseResponse> purchaseResponse = purchasesFeignClient.getById(t.getTxn_id());
////		List<Integer> purchaseResponse = purchasesFeignClient.findalllineitems(id);
//		TxnLineItemResponse txnLineItemResponse = purchasesFeignClient.getById(t.getTxn_id());
//		transactionResponse.setPurchaseResponse(txnLineItemResponse);
//		return transactionResponse;
//	}
//	
//	public TxnLineItemResponse getPurchaseById (int id) {
//		
//		String url = purchasesServiceUrl + "/getById/" + id;
//		Mono<TxnLineItemResponse> purchaseResponse = webClient.get().uri(url).retrieve().bodyToMono(TxnLineItemResponse.class);
////		Mono<PurchaseResponse> purchaseResponse = webClient.get().uri("/getById/" + id).retrieve().bodyToMono(PurchaseResponse.class);
//		return purchaseResponse.block();
//	}
//	
//	public UserResponse getUserById (int id) {
//		String url = usersServiceUrl + "/getById/" + id;
//		Mono<UserResponse> userResponse = webClient.get().uri(url).retrieve().bodyToMono(UserResponse.class);
//
////		Mono<UserResponse> userResponse = webClient.get().uri("/getById/" + id).retrieve().bodyToMono(UserResponse.class);
//		return userResponse.block();
//	}
	
//	public List<TxnLineItemResponse> returing_test(int id) {
//		return transactionRepository.
//	}
	
	public UserDto convertUserResponse (Integer id) {
		UserResponse u = userFeignClient.getById(id);
		return new UserDto(u.getUser_id(), u.getUser_name());
	}
	
	public TxnResponse convertToResponse(Txn t) {
		UserDto userDto = new UserDto(t.getUser().getUser_id(), t.getUser().getUser_name());
		List<TxndetailDto> txndetailDto = t.getTxndetails().stream().map(td -> new TxndetailDto(td.getTxn_details_id(), td.getSku_no().getSku_no(), td.getQuantity())).collect(Collectors.toList());
		return new TxnResponse(t.getTxn_id(), userDto, txndetailDto);
	}
	
	
	public List<TxndetailDto> convertToTxndetailDto(Set<Txndetail> t) {
		return t.stream().map(td -> new TxndetailDto(td.getTxn_details_id(), td.getSku_no().getSku_no(), td.getQuantity())).collect(Collectors.toList());
	}
	
	public TxnResponse getById(Integer id) {
		Txn t = txnRepository.findById(id).orElseThrow(() -> new RuntimeException("Transaction not found"));
//		UserDto userDto = userFeignClient.getById(t.getUser().getUser_id());
		UserDto userDto = convertUserResponse(t.getUser().getUser_id());
		List<TxndetailDto> txndetailDto = convertToTxndetailDto(t.getTxndetails());
		return new TxnResponse(t.getTxn_id(), userDto, txndetailDto);
		
	}
	
	
	
}
