package com.shopping.info;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Projection for {@link com.shopping.entity.Sku}
 */
public interface SkuInfo {
    Integer getId();

    String getProductName();

    String getProductCategory();

    BigDecimal getProductPrice();

    Integer getStockLevel();

    LocalDate getStockUpdateDate();
}