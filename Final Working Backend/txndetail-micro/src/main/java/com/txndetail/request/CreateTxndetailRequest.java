package com.txndetail.request;

import com.txndetail.entity.Sku;
import com.txndetail.entity.Txn;

public class CreateTxndetailRequest {
	private Txn txn;

    private Sku sku_no;
//	
//	private int sku_no;

    private Integer quantity;

	public Txn getTxn() {
		return txn;
	}

	public void setTxn(Txn txn) {
		this.txn = txn;
	}

	public Sku getSku_no() {
		return sku_no;
	}

	public void setSku_no(Sku sku_no) {
		this.sku_no = sku_no;
	}
	
	

	public Integer getQuantity() {
		return quantity;
	}

//	public int getSku_no() {
//		return sku_no;
//	}
//
//	public void setSku_no(int sku_no) {
//		this.sku_no = sku_no;
//	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

	
}
