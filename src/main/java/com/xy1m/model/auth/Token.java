package com.xy1m.model.auth;

import java.util.Objects;

public class Token {

    private static final int MILLISECONDS_IN_SINGLE_SECOND = 1000;

    private String accessToken;
    private Integer expiresIn; //seconds
    private String tokenType;
    private String scope;
    private final Long creationTimestamp;

    public Token() {
        this.creationTimestamp = System.currentTimeMillis();
    }

    public String getAccessTokenForHeader() {
        return "Bearer " + getAccessToken();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Long getCreationTimestamp() {
        return creationTimestamp;
    }

    public boolean isExpired() {
        Objects.requireNonNull(expiresIn, "Expires in is null");
        return System.currentTimeMillis() >= (creationTimestamp + (expiresIn * MILLISECONDS_IN_SINGLE_SECOND));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Token)) return false;
        Token token = (Token) o;
        return Objects.equals(getAccessToken(), token.getAccessToken()) &&
                Objects.equals(getExpiresIn(), token.getExpiresIn()) &&
                Objects.equals(tokenType, token.tokenType) &&
                Objects.equals(scope, token.scope) &&
                Objects.equals(creationTimestamp, token.creationTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccessToken(), getExpiresIn(), tokenType, scope, creationTimestamp);
    }

    @Override
    public String toString() {
        return "Token{" +
                "accessToken='" + accessToken + '\'' +
                ", expiresIn=" + expiresIn +
                ", tokenType='" + tokenType + '\'' +
                ", scope='" + scope + '\'' +
                ", creationTimestamp=" + creationTimestamp +
                '}';
    }
}
