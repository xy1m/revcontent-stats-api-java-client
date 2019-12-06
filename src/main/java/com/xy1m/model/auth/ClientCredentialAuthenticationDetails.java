package com.xy1m.model.auth;

import java.util.Objects;

public class ClientCredentialAuthenticationDetails extends AuthenticationDetails {

    private final String clientId;
    private final String clientSecret;

    public ClientCredentialAuthenticationDetails(String clientId, String clientSecret) {
        super(GrantType.CLIENT_CREDENTIALS);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClientCredentialAuthenticationDetails that = (ClientCredentialAuthenticationDetails) o;
        return Objects.equals(clientId, that.clientId) &&
                Objects.equals(clientSecret, that.clientSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clientId, clientSecret);
    }

    @Override
    public String toString() {
        return "ClientCredentialAuthenticationDetails{" +
                super.toString() +
                ", clientId='" + clientId + '\'' +
                ", clientSecret='" + clientSecret + '\'' +
                '}';
    }
}
