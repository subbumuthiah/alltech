package com.shopping.dto;

import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.shopping.entity.User}
 */
public class UserDto implements Serializable {
    private final Integer id;
    @Size(max = 45)
    private final String userName;
    @Size(max = 45)
    private final String name;
    @Size(max = 45)
    private final String email;
    @Size(max = 45)
    private final String address;
    private final Integer phNo;

    public UserDto(Integer id, String userName, String name, String email, String address, Integer phNo) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phNo = phNo;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPhNo() {
        return phNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto entity = (UserDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.userName, entity.userName) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.address, entity.address) &&
                Objects.equals(this.phNo, entity.phNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, name, email, address, phNo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "userName = " + userName + ", " +
                "name = " + name + ", " +
                "email = " + email + ", " +
                "address = " + address + ", " +
                "phNo = " + phNo + ")";
    }
}