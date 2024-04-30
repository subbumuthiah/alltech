package com.txn.response;

import com.txn.entity.User;

import jakarta.persistence.Column;

public class UserResponse {
	private Integer user_id;

  private String user_name;


private String name;

  private String email;

  private String address;

  private Integer ph_no;
	public UserResponse () {
		
	}
  public UserResponse (User user) {
	  this.address = user.getAddress();
	  this.user_id = user.getUser_id();
	  this.user_name = user.getUser_name();
	  this.name = user.getName();
	  this.email = user.getEmail();
	  this.ph_no = user.getPh_no();
  }
  
  public Integer getUser_id() {
	return user_id;
}

public void setUser_id(Integer user_id) {
	this.user_id = user_id;
}

public String getUser_name() {
	return user_name;
}

public void setUser_name(String user_name) {
	this.user_name = user_name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Integer getPh_no() {
	return ph_no;
}

public void setPh_no(Integer ph_no) {
	this.ph_no = ph_no;
}
}
