package com.example.prak_up_4.models;

import org.springframework.security.core.GrantedAuthority;
public enum RoleEnum implements GrantedAuthority {
    USER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
