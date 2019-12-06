package com.xy1m.model.auth;

import java.util.Objects;

public abstract class AuthenticationDetails {

    private final GrantType grantType;

    public AuthenticationDetails(GrantType grantType) {
        this.grantType = grantType;
    }

    public GrantType getGrantType() {
        return grantType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthenticationDetails that = (AuthenticationDetails) o;
        return grantType == that.grantType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantType);
    }

    @Override
    public String toString() {
        return "AuthenticationDetails{" +
                "grantType=" + grantType +
                '}';
    }
}
