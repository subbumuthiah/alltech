package com.shopping.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "txndetails")
public class Txndetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txnDetailsId", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "txnId")
    private Txn txn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skuNo")
    private Sku skuNo;

    @Column(name = "quantity")
    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Txn getTxn() {
        return txn;
    }

    public void setTxn(Txn txn) {
        this.txn = txn;
    }

    public Sku getSkuNo() {
        return skuNo;
    }

    public void setSkuNo(Sku skuNo) {
        this.skuNo = skuNo;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}