package com.shopping.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "txn")
public class Txn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txnId", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "txn")
    private Set<Txndetail> txndetails = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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