package com.shopping.info;

/**
 * Projection for {@link com.shopping.entity.User}
 */
public interface UserInfo {
    Integer getId();

    String getUserName();

    String getName();

    String getEmail();

    String getAddress();

    Integer getPhNo();
}