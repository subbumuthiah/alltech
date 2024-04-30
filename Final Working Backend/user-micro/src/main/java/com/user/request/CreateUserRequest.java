package com.user.request;

import com.user.entity.User;

public class CreateUserRequest {

	private Integer user_id;

	  private String user_name;


	private String name;

	  private String email;

	  private String address;

	  private Integer ph_no;

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
