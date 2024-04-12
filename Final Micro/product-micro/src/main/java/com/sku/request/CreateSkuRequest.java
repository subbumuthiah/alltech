package com.sku.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;

public class CreateSkuRequest {
//	
//	private String product_name;
//	private String product_category;
//	private BigDecimal product_price;
//	private int stock_level;
//	private LocalDate stock_update_date;
//	public String getProduct_name() {
//		return product_name;
//	}
//	public void setProduct_name(String product_name) {
//		this.product_name = product_name;
//	}
//	public String getProduct_category() {
//		return product_category;
//	}
//	public void setProduct_category(String product_category) {
//		this.product_category = product_category;
//	}
//	public BigDecimal getProduct_price() {
//		return product_price;
//	}
//	public void setProduct_price(BigDecimal product_price) {
//		this.product_price = product_price;
//	}
//	public int getStock_level() {
//		return stock_level;
//	}
//	public void setStock_level(int stock_level) {
//		this.stock_level = stock_level;
//	}
//	public LocalDate getStock_update_date() {
//		return stock_update_date;
//	}
//	public void setStock_update_date(LocalDate stock_update_date) {
//		this.stock_update_date = stock_update_date;
//	}


  private String product_name;

  private String product_category;

  private BigDecimal product_price;

  private Integer stock_level;



public String getProduct_name() {
	return product_name;
}

public void setProduct_name(String product_name) {
	this.product_name = product_name;
}

public String getProduct_category() {
	return product_category;
}

public void setProduct_category(String product_category) {
	this.product_category = product_category;
}

public BigDecimal getProduct_price() {
	return product_price;
}

public void setProduct_price(BigDecimal product_price) {
	this.product_price = product_price;
}

public Integer getStock_level() {
	return stock_level;
}

public void setStock_level(Integer stock_level) {
	this.stock_level = stock_level;
}

public LocalDate getStock_update_date() {
	return stock_update_date;
}

public void setStock_update_date(LocalDate stock_update_date) {
	this.stock_update_date = stock_update_date;
}

private LocalDate stock_update_date;
	
}
