package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.HelperEndpoint;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.Interest;
import com.xy1m.model.resource.Resource;

public class HelpersServiceImpl implements HelpersService {

    private final Boolean performValidations;
    private final HelperEndpoint endpoint;

    public HelpersServiceImpl(Boolean performValidations, HelperEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultsData<Resource> getBrandTargets(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getBrandTargets(accessToken);
    }

    @Override
    public ResultsData<Resource> getTopicTargets(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getTopicargets(accessToken);
    }

    @Override
    public ResultsData<Resource> getCountries(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getCountries(accessToken);
    }

    @Override
    public ResultsData<Resource> getDevices(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getDevices(accessToken);
    }

    @Override
    public ResultsData<Resource> getLanguages(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getLanguages(accessToken);
    }

    @Override
    public ResultsData<Interest> getInterests(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getInterests(accessToken);
    }

    @Override
    public ResultsData<Resource> getRegions(Authentication auth, String country)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getRegions(accessToken, country);
    }
}
