package com.shopping.dto_new;

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

    public UserDto(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto entity = (UserDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.userName, entity.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "userName = " + userName + ")";
    }
}