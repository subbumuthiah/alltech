package com.shopping.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.shopping.entity.Txn}
 */
public class TxnDto implements Serializable {
    private final Integer id;

    public TxnDto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TxnDto entity = (TxnDto) o;
        return Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }
}