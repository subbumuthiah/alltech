package com.user.entity;

import jakarta.persistence.*;
//import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "sku")
public class Sku {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sku_no", nullable = false)
    private Integer sku_no;

//    @Size(max = 45)
    @Column(name = "product_name", length = 45)
    private String product_name;

//    @Size(max = 45)
    @Column(name = "product_category", length = 45)
    private String product_category;

    @Column(name = "product_price", precision = 4, scale = 2)
    private BigDecimal product_price;

    @Column(name = "stock_level")
    private Integer stock_level;

    @Column(name = "stock_update_date")
    private LocalDate stock_update_date;

    @OneToMany(mappedBy = "sku_no")
    private Set<Txndetail> txndetails = new LinkedHashSet<>();

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

	public Set<Txndetail> getTxndetails() {
        return txndetails;
    }

    public void setTxndetails(Set<Txndetail> txndetails) {
        this.txndetails = txndetails;
    }

}