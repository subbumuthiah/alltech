package com.shopping.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.shopping.entity.Txndetail}
 */
public class TxndetailDto implements Serializable {
    private final Integer id;
    private final Integer quantity;

    public TxndetailDto(Integer id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TxndetailDto entity = (TxndetailDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.quantity, entity.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "quantity = " + quantity + ")";
    }
}