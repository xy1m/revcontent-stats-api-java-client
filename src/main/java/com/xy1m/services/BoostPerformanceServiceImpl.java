package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.BoostPerformanceEndpoint;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.boost.BoostPerformance;

import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;

public class BoostPerformanceServiceImpl implements BoostPerformanceService {

    private final Boolean performValidations;
    private final BoostPerformanceEndpoint endpoint;

    public BoostPerformanceServiceImpl(Boolean performValidations, BoostPerformanceEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultsData<BoostPerformance> getBoostPerformance(Authentication auth, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        if (performValidations) {
            checkArgument(filter.containsKey("boost_id"), "missing boost_id");
            checkArgument(filter.containsKey("date_from"), "missing date_from, format yyyy-MM-dd");
            checkArgument(filter.containsKey("date_to"), "missing date_to, format yyyy-MM-dd");
        }
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getBoostPerformance(accessToken, filter);
    }
}
