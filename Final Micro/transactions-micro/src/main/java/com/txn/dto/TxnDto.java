package com.txn.dto;

public class TxnDto {

	private Integer txn_id;
	private UserDto user;
	public TxnDto() {

	}
	public TxnDto(Integer txn_id, UserDto user) {
		this.txn_id = txn_id;
		this.user = user;
	}
	public Integer getTxn_id() {
		return txn_id;
	}
	public void setTxn_id(Integer txn_id) {
		this.txn_id = txn_id;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
}
