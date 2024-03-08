package com.q1.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class Json_main {

	
	private int page;
	private int per_page,total, total_pages;
	private Device [] data;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public Device[] getData() {
		return data;
	}
	public void setData(Device[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Json_main [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
				+ total_pages + ", data=" + Arrays.toString(data) + "]";
	}
	public Json_main(int page, int per_page, int total, int total_pages, Device[] data) {
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
	}
	public Json_main() {
	}
	
}
