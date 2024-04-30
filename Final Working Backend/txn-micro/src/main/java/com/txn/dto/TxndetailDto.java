package com.txn.dto;

public class TxndetailDto {

	private int txn_details_id;
	private int sku_no;
	private int quantity;
	
	public TxndetailDto (int t, int s, int q) {
		this.txn_details_id = t;
		this.sku_no = s;
		this.quantity = q;
	}

	public int getTxn_details_id() {
		return txn_details_id;
	}

	public void setTxn_details_id(int txn_details_id) {
		this.txn_details_id = txn_details_id;
	}

	public int getSku_no() {
		return sku_no;
	}

	public void setSku_no(int sku_no) {
		this.sku_no = sku_no;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
