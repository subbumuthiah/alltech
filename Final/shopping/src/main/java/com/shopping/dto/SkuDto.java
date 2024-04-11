package com.shopping.dto;

import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * DTO for {@link com.shopping.entity.Sku}
 */
public class SkuDto implements Serializable {
    private final Integer id;
    @Size(max = 45)
    private final String productName;
    @Size(max = 45)
    private final String productCategory;
    private final BigDecimal productPrice;
    private final Integer stockLevel;
    private final LocalDate stockUpdateDate;

    public SkuDto(Integer id, String productName, String productCategory, BigDecimal productPrice, Integer stockLevel, LocalDate stockUpdateDate) {
        this.id = id;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.stockLevel = stockLevel;
        this.stockUpdateDate = stockUpdateDate;
    }

    public Integer getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public Integer getStockLevel() {
        return stockLevel;
    }

    public LocalDate getStockUpdateDate() {
        return stockUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkuDto entity = (SkuDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.productName, entity.productName) &&
                Objects.equals(this.productCategory, entity.productCategory) &&
                Objects.equals(this.productPrice, entity.productPrice) &&
                Objects.equals(this.stockLevel, entity.stockLevel) &&
                Objects.equals(this.stockUpdateDate, entity.stockUpdateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, productCategory, productPrice, stockLevel, stockUpdateDate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "productName = " + productName + ", " +
                "productCategory = " + productCategory + ", " +
                "productPrice = " + productPrice + ", " +
                "stockLevel = " + stockLevel + ", " +
                "stockUpdateDate = " + stockUpdateDate + ")";
    }
}