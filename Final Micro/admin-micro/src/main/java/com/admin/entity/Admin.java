package com.admin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.Size;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id", nullable = false)
    private Integer adminId;

//    @Size(max = 45)
    @Column(name = "user_name", length = 45)
    private String userName;

//    @Size(max = 45)
    @Column(name = "name", length = 45)
    private String name;

//    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;

    public Integer getAdminId() {
        return adminId;
    }

    public void setId(Integer id) {
        this.adminId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

}
