package com.shopping.response;

import com.shopping.entity.Sku;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SkuResponse {
    private int skuNo;


    private String productName;


    private String productCategory;


    private BigDecimal productPrice;


    private int stockLevel;

    public SkuResponse (Sku s) {
        this.productCategory = s.getProductCategory();
        this.productName = s.getProductName();
        this.productPrice = s.getProductPrice();
        this.skuNo = s.getId();
        this.stockLevel = s.getStockLevel();
        this.stockUpdateDate = s.getStockUpdateDate();
    }
    public int getSkuNo() {
        return skuNo;
    }


    public void setSkuNo(int skuNo) {
        this.skuNo = skuNo;
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


    public int getStockLevel() {
        return stockLevel;
    }


    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }


    public LocalDate getStockUpdateDate() {
        return stockUpdateDate;
    }


    public void setStockUpdateDate(LocalDate stockUpdateDate) {
        this.stockUpdateDate = stockUpdateDate;
    }


    private LocalDate stockUpdateDate;
}
