package ru.kata.spring.boot_security.demo.security;

import org.springframework.security.core.GrantedAuthority;

public class GrantedAuthorityImpl implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return null;
    }
}
