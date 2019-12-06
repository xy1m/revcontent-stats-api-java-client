package com.xy1m.model.auth;

import java.util.Objects;

public class Authentication {

    private Token token;
    private AuthenticationDetails details;

    public Authentication(AuthenticationDetails details, Token token) {
        this.details = details;
        this.token = token;
    }

    public AuthenticationDetails getDetails() {
        return details;
    }

    public Token getToken() {
        return token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authentication that = (Authentication) o;
        return Objects.equals(details, that.details) &&
                Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(details, token);
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "details=" + details +
                ", token=" + token +
                '}';
    }
}
