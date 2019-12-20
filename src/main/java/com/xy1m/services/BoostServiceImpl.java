package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.BoostEndpoint;
import com.xy1m.model.ResultCampaign;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.boost.Boost;
import com.xy1m.model.boost.BoostStats;
import com.xy1m.model.boost.WidgetStats;

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
        if (performValidations) {
            checkArgument(isNotBlank(payload.getId()), "ID is required");
        }
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

    @Override
    public ResultsData<BoostStats> getBoostStats(Authentication auth, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        if (performValidations) {
            checkArgument(filter.containsKey("boost_id"), "missing boost_id");
            checkArgument(filter.containsKey("date_from"), "missing date_from, format yyyy-MM-dd");
            checkArgument(filter.containsKey("date_to"), "missing date_to, format yyyy-MM-dd");
        }
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getBoostPerformance(accessToken, filter);
    }

    @Override
    public ResultsData<WidgetStats> getWidgetStats(Authentication auth, String boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        if (performValidations) {
            checkArgument(filter.containsKey("date_from"), "missing date_from, format yyyy-MM-dd");
            checkArgument(filter.containsKey("date_to"), "missing date_to, format yyyy-MM-dd");
        }
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getWidgetStats(accessToken, boostId, filter);
    }
}
