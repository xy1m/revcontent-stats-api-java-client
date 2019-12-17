package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.TargetEndpoint;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.targeting.BoostTarget;
import com.xy1m.model.targeting.WidgetTarget;

import java.util.Map;

public class TargetServiceImpl implements TargetService {
    private final boolean performValidations;
    private final TargetEndpoint endpoint;

    public TargetServiceImpl(boolean performValidations, TargetEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultsData<BoostTarget> updateBoostTarget(Authentication auth, Long boostId, BoostTarget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.updateBoostTarget(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<BoostTarget> listBoostTargets(Authentication auth, Long boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.listBoostTargets(accessToken, boostId, filter);
    }

    @Override
    public ResultsData<WidgetTarget> updateWidgetTarget(Authentication auth, Long boostId, WidgetTarget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.updateWidgetTarget(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<WidgetTarget> listWidgetTargets(Authentication auth, Long boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.listWidgetTargets(accessToken, boostId, filter);
    }
}
