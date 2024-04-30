package com.txndetail.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "txndetails")
public class Txndetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txn_details_id", nullable = false)
    private Integer txn_details_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "txn_id")
    private Txn txn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sku_no")
    private Sku sku_no;

    @Column(name = "quantity")
    private Integer quantity;



    public Txn getTxn() {
        return txn;
    }

    public void setTxn(Txn txn) {
        this.txn = txn;
    }



    public Integer getTxn_details_id() {
		return txn_details_id;
	}

	public void setTxn_details_id(Integer txn_details_id) {
		this.txn_details_id = txn_details_id;
	}

	public Sku getSku_no() {
		return sku_no;
	}

	public void setSku_no(Sku sku_no) {
		this.sku_no = sku_no;
	}

	public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}