package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.BoostEndpoint;
import com.xy1m.model.Boost;
import com.xy1m.model.CampaignResult;
import com.xy1m.model.DataResults;
import com.xy1m.model.auth.Authentication;

public class BoostsServiceImpl implements BoostsService {

    private final Boolean performValidations;
    private final BoostEndpoint endpoint;

    public BoostsServiceImpl(Boolean performValidations, BoostEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public DataResults<Boost> getAll(Authentication auth) throws APIUnauthorizedException,
            APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getAllBoosts(accessToken);
    }

    @Override
    public CampaignResult<Boost> createCpc(Authentication auth, Boost boost) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.createCpc(accessToken, boost);
    }

    @Override
    public CampaignResult<Boost> createCpa(Authentication auth, Boost boost) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.createCpa(accessToken, boost);
    }

    @Override
    public Boost update(Authentication auth, String boostId, Boost boost) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.update(accessToken, boostId, boost);
    }

    @Override
    public Boost updateStatus(Authentication auth, Boost boost) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.updateStatus(accessToken, boost);
    }
}
