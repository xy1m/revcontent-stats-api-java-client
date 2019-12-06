package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.BoostEndpoint;
import com.xy1m.model.DataResults;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.boost.BoostAddRequest;
import com.xy1m.model.boost.BoostAddResponse;
import com.xy1m.model.boost.BoostGetAllResponse;
import com.xy1m.model.boost.BoostUpdateRequest;
import com.xy1m.model.boost.BoostUpdateResponse;
import com.xy1m.model.boost.BoostUpdateStatusRequest;
import com.xy1m.model.boost.BoostUpdateStatusResponse;
import com.xy1m.model.boost.CampaignResult;

public class BoostsServiceImpl implements BoostsService {

    private final Boolean performValidations;
    private final BoostEndpoint endpoint;

    public BoostsServiceImpl(Boolean performValidations, BoostEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public DataResults<BoostGetAllResponse> getAll(Authentication auth) throws APIUnauthorizedException,
            APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getAllBoosts(accessToken);
    }

    @Override
    public CampaignResult<BoostAddResponse> createCpc(Authentication auth, BoostAddRequest payload) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.createCpc(accessToken, payload);
    }

    @Override
    public CampaignResult<BoostAddResponse> createCpa(Authentication auth, BoostAddRequest payload) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.createCpa(accessToken, payload);
    }

    @Override
    public BoostUpdateResponse update(Authentication auth, Long boostId, BoostUpdateRequest boost) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.update(accessToken, boostId, boost);
    }

    @Override
    public BoostUpdateStatusResponse updateStatus(Authentication auth, BoostUpdateStatusRequest boost) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.updateStatus(accessToken, boost);
    }
}
