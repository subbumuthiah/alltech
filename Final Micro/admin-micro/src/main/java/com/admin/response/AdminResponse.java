package com.admin.response;

import com.admin.entity.Admin;

import jakarta.persistence.Column;

public class AdminResponse {
	private int adminId;
	
	private String userName;
	
	private String name;
	
	private String email;
	
	public AdminResponse (Admin admin) {
		this.adminId = admin.getAdminId();
		this.email = admin.getEmail();
		this.name = admin.getName();
		this.userName = admin.getUserName();
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdmin_id(int id) {
		this.adminId = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
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
}
