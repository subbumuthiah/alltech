package com.txn.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import com.transactions.entity.Transaction;
//import com.transactions.response.PurchaseResponse;
//import com.transactions.response.TxnLineItemResponse;
import com.txn.response.TxndetailResponse;

@FeignClient(url = "${purchases.service.url}", value = "purchases-feign-client", path = "/api/txnLineItem")
public interface TxnFeignClient {
	@GetMapping("/getById/{id}")
	public TxndetailResponse getById(@PathVariable int id);

	@GetMapping("/getByTransactionId/{id}")
	public List<TxndetailResponse> getByTransactionId(@PathVariable int id);

//	@Query(value = "select tli1_0.txn_line_item_id from txnlineitem tli1_0 where tli1_0.txn_id={id}")
//	List<Integer> findalllineitems(int id);
}
