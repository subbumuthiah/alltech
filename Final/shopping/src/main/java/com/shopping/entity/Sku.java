package com.shopping.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "sku")
public class Sku {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skuNo", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "productName", length = 45)
    private String productName;

    @Size(max = 45)
    @Column(name = "productCategory", length = 45)
    private String productCategory;

    @Column(name = "productPrice", precision = 4, scale = 2)
    private BigDecimal productPrice;

    @Column(name = "stockLevel")
    private Integer stockLevel;

    @Column(name = "stockUpdateDate")
    private LocalDate stockUpdateDate;

    @OneToMany(mappedBy = "skuNo")
    private Set<Txndetail> txndetails = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Integer stockLevel) {
        this.stockLevel = stockLevel;
    }

    public LocalDate getStockUpdateDate() {
        return stockUpdateDate;
    }

    public void setStockUpdateDate(LocalDate stockUpdateDate) {
        this.stockUpdateDate = stockUpdateDate;
    }

    public Set<Txndetail> getTxndetails() {
        return txndetails;
    }

    public void setTxndetails(Set<Txndetail> txndetails) {
        this.txndetails = txndetails;
    }

}