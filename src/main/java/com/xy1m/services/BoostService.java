package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultCampaign;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.boost.Boost;
import com.xy1m.model.boost.BoostStats;
import com.xy1m.model.boost.WidgetStats;

import java.util.Map;


public interface BoostService {
    ResultCampaign<Boost> addBoost(Authentication auth, Boost payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    Boost updateBoost(Authentication auth, String boostId, Boost payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    Boost updateBoostStatus(Authentication auth, Boost payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    Boost archiveBoost(Authentication auth, String boostId)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Boost> listBoosts(Authentication auth, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<BoostStats> getBoostStats(Authentication auth, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<WidgetStats> getWidgetStats(Authentication auth, String boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

}
