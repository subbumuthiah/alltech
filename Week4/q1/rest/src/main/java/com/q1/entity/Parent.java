package com.q1.entity;

public class Parent {
	public int id;
	private String alias;
	@Override
	public String toString() {
		return "Asset [id=" + id + ", alias=" + alias + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Parent() {
	}
	public Parent(int id, String alias) {
		this.id = id;
		this.alias = alias;
	}
}
