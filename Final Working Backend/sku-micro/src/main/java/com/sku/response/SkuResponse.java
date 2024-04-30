package com.sku.response;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.sku.entity.Sku;

import jakarta.persistence.Column;

public class SkuResponse {

//	private int sl_no;
//
//	private String product_name;
//
//	private String product_category;
//
//	private BigDecimal product_price;
//
//	private int stock_level;
//
//	private LocalDate stock_update_date;
//	
//	public ProductResponse(Product product) {
//		this.sl_no = product.getSl_no();
//		this.product_category = product.getProduct_category();
//		this.product_name = product.getProduct_name();
//		this.product_price = product.getProduct_price();
//		this.stock_level = product.getStock_level();
//		this.stock_update_date = product.getStock_update_date();
//	}
//
//	public int getSl_no() {
//		return sl_no;
//	}
//
//	public void setSl_no(int sl_no) {
//		this.sl_no = sl_no;
//	}
//
//	public String getProduct_name() {
//		return product_name;
//	}
//
//	public void setProduct_name(String product_name) {
//		this.product_name = product_name;
//	}
//
//	public String getProduct_category() {
//		return product_category;
//	}
//
//	public void setProduct_category(String product_category) {
//		this.product_category = product_category;
//	}
//
//	public BigDecimal getProduct_price() {
//		return product_price;
//	}
//
//	public void setProduct_price(BigDecimal product_price) {
//		this.product_price = product_price;
//	}
//
//	public int getStock_level() {
//		return stock_level;
//	}
//
//	public void setStock_level(int stock_level) {
//		this.stock_level = stock_level;
//	}
//
//	public LocalDate getStock_update_date() {
//		return stock_update_date;
//	}
//
//	public void setStock_update_date(LocalDate stock_update_date) {
//		this.stock_update_date = stock_update_date;
//	}
	private Integer sku_no;

	  private String product_name;

	  private String product_category;

	  private BigDecimal product_price;

	  private Integer stock_level;

	  public SkuResponse (Sku sku) {
		  this.sku_no = sku.getSku_no();
		  this.product_name = sku.getProduct_name();
		  this.product_category = sku.getProduct_category();
		  this.product_price = sku.getProduct_price();
		  this.stock_level = sku.getStock_level();
	  }
	  
	  public Integer getSku_no() {
		return sku_no;
	}

	public void setSku_no(Integer sku_no) {
		this.sku_no = sku_no;
	}

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
