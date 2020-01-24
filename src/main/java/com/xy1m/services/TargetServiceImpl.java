package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.TargetEndpoint;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.targeting.BoostTarget;
import com.xy1m.model.targeting.WidgetTarget;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TargetServiceImpl implements TargetService {
    private final boolean performValidations;
    private final TargetEndpoint endpoint;

    public TargetServiceImpl(boolean performValidations, TargetEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultsData<BoostTarget> updateBoostTarget(Authentication auth, String boostId, BoostTarget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.updateBoostTarget(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<BoostTarget> listBoostTargets(Authentication auth, String boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.listBoostTargets(accessToken, boostId, filter);
    }

    @Override
    public ResultsData<WidgetTarget> updateWidgetTarget(Authentication auth, String boostId, WidgetTarget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        List<WidgetTarget> widgetTargets = new ArrayList<>();
        return updateWidgetTarget(auth, boostId, widgetTargets);
    }

    @Override
    public ResultsData<WidgetTarget> updateWidgetTarget(Authentication auth, String boostId, List<WidgetTarget> payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.updateWidgetTarget(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<WidgetTarget> listWidgetTargets(Authentication auth, String boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.listWidgetTargets(accessToken, boostId, filter);
    }
}
