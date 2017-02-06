package com.herokuapp.springboot.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by viktorburcev on 06.02.17.
 */
public enum Role implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
