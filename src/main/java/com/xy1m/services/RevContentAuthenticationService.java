package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.auth.Authentication;


public interface RevContentAuthenticationService {
    /**
     * @param clientId client id
     * @param clientSecret client secret
     * @return Authentication with token details and access token
     * @throws APIUnauthorizedException
     * @throws APIServerException
     * @throws APIClientException
     */
    Authentication clientCredentials(String clientId, String clientSecret)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    Authentication authenticate(String accessToken);
}
