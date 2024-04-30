package com.txn.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "txn")
public class Txn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txn_id", nullable = false)
    private Integer txn_id;

//    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "txn")
    private Set<Txndetail> txndetails = new LinkedHashSet<>();



    public Integer getTxn_id() {
		return txn_id;
	}

	public void setTxn_id(Integer txn_id) {
		this.txn_id = txn_id;
	}

	public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Txndetail> getTxndetails() {
        return txndetails;
    }

    public void setTxndetails(Set<Txndetail> txndetails) {
        this.txndetails = txndetails;
    }

}