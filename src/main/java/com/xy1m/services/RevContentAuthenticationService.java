package com.xy1m.services;

import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.auth.Authentication;


public interface RevContentAuthenticationService {
    Authentication clientCredentials(String clientId, String clientSecret) throws APIUnauthorizedException, APIServerException, APIClientException;

    Authentication authenticate(String accessToken);
}
