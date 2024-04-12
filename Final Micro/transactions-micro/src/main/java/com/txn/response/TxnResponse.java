package com.txn.response;

import java.util.List;

//import com.transactions.entity.Transaction;
import com.txn.dto.TxndetailDto;
import com.txn.dto.UserDto;
//import com.transactions.feignclients.TxnLineItemResponse;

public class TxnResponse {
	private int txn_id;
	private UserDto user;
	private List<TxndetailDto> txndetails;
	
	public TxnResponse(int t, UserDto u, List<TxndetailDto> txn_details) {
		this.txn_id = t;
		this.user = u;
		this.txndetails = txn_details;
	}

	public int getTxn_id() {
		return txn_id;
	}

	public void setTxn_id(int txn_id) {
		this.txn_id = txn_id;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public List<TxndetailDto> getTxndetails() {
		return txndetails;
	}

	public void setTxndetails(List<TxndetailDto> txndetails) {
		this.txndetails = txndetails;
	}
	
	
}
