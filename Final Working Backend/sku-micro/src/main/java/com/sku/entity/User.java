package com.sku.entity;

import jakarta.persistence.*;
//import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer user_id;

//    @Size(max = 45)
    @Column(name = "user_name", length = 45)
    private String user_name;

//    @Size(max = 45)
    @Column(name = "name", length = 45)
    private String name;

//    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;

//    @Size(max = 45)
    @Column(name = "address", length = 45)
    private String address;

    @Column(name = "ph_no")
    private Integer ph_no;

    @OneToMany(mappedBy = "user")
    private Set<Txn> txns = new LinkedHashSet<>();


    public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Integer getPh_no() {
		return ph_no;
	}

	public void setPh_no(Integer ph_no) {
		this.ph_no = ph_no;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Set<Txn> getTxns() {
        return txns;
    }

    public void setTxns(Set<Txn> txns) {
        this.txns = txns;
    }

}