package com.xy1m.services;

import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.AuthenticationEndpoint;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.ClientCredentialAuthenticationDetails;
import com.xy1m.model.auth.Token;

import java.util.Objects;

public class RevContentAuthenticationServiceImpl implements RevContentAuthenticationService {

    private final AuthenticationEndpoint endpoint;

    public RevContentAuthenticationServiceImpl(AuthenticationEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public Authentication clientCredentials(String clientId, String clientSecret) throws APIUnauthorizedException, APIServerException, APIClientException {
        ClientCredentialAuthenticationDetails details = new ClientCredentialAuthenticationDetails(clientId, clientSecret);
        return new Authentication(details, endpoint.getAuthToken(clientId, clientSecret, details.getGrantType().getValue()));
    }

    @Override
    public Authentication authenticate(String accessToken) {
        Objects.requireNonNull(accessToken, "accessToken");
        Token token = new Token();
        token.setAccessToken(accessToken);
        return new Authentication(null, token);
    }
}
