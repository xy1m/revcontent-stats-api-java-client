package com.xy1m.model.auth;

public enum GrantType {
    CLIENT_CREDENTIALS("client_credentials");
    //    PASSWORD_AUTHENTICATION("password"),
    //    IMPLICIT_GRANT,
    //    AUTHORIZATION_CODE

    private final String value;

    GrantType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
