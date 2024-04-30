package com.txn.response;

import com.txn.dto.TxnDto;
//import com.TxnLineItem.entity.TxnLineItem;
import com.txn.entity.Sku;
import com.txn.entity.Txn;
import com.txn.entity.Txndetail;


public class TxndetailResponse {
	
	private Integer txn_details_id;

//    private Txn txn;
	private TxnDto txn;

//    private Sku sku_no;
//    private int sku_no;
    private SkuResponse sku_no;

    private Integer quantity;

    public TxndetailResponse (Integer txn_details_id, TxnDto t, SkuResponse s, Integer quantity) {
    	this.txn_details_id = txn_details_id;
    	this.txn = t;
    	this.sku_no = s;
//    	this.sku_no = t.getSku_no();
//    	this.sku_no = t.getSku_no();
    	this.quantity = quantity;
    }
    
	public Integer getTxn_details_id() {
		return txn_details_id;
	}

	public void setTxn_details_id(Integer txn_details_id) {
		this.txn_details_id = txn_details_id;
	}

//	public Txn getTxn() {
//		return txn;
//	}
//
//	public void setTxn(Txn txn) {
//		this.txn = txn;
//	}

//	public Sku getSku_no() {
//		return sku_no;
//	}
//
//	public void setSku_no(Sku sku_no) {
//		this.sku_no = sku_no;
//	}
	
	

	public Integer getQuantity() {
		return quantity;
	}

	public TxnDto getTxn() {
		return txn;
	}

	public void setTxn(TxnDto txn) {
		this.txn = txn;
	}

	public SkuResponse getSku_no() {
		return sku_no;
	}

	public void setSku_no(SkuResponse sku_no) {
		this.sku_no = sku_no;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
