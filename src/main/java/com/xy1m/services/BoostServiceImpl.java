package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.BoostEndpoint;
import com.xy1m.model.ResultCampaign;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.boost.Boost;

import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.logging.log4j.util.Strings.isNotBlank;

public class BoostServiceImpl implements BoostService {

    private final Boolean performValidations;
    private final BoostEndpoint endpoint;

    public BoostServiceImpl(Boolean performValidations, BoostEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultCampaign<Boost> addBoost(Authentication auth, Boost payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        if (performValidations) {
            checkArgument(isNotBlank(payload.getName()), "Name is required");
        }
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.addBoost(accessToken, payload);
    }

    @Override
    public Boost updateBoost(Authentication auth, String boostId, Boost payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.updateBoost(accessToken, boostId, payload);
    }

    @Override
    public Boost updateBoostStatus(Authentication auth, Boost payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        if (performValidations) {
            checkArgument(isNotBlank(payload.getId()), "ID is required");
            checkArgument(payload.getEnabled() != null, "Enabled is required");
        }
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.updateBoostStatus(accessToken, payload);
    }

    @Override
    public ResultsData<Boost> listBoosts(Authentication auth, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.listBoosts(accessToken, filter);
    }
}
