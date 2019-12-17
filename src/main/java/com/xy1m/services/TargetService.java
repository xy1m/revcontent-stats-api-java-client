package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.targeting.BoostTarget;
import com.xy1m.model.targeting.WidgetTarget;

import java.util.Map;


public interface TargetService {

    ResultsData<BoostTarget> updateBoostTarget(Authentication auth, Long boostId, BoostTarget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<BoostTarget> listBoostTargets(Authentication auth, Long boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<WidgetTarget> updateWidgetTarget(Authentication auth, Long boostId, WidgetTarget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<WidgetTarget> listWidgetTargets(Authentication auth, Long boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;
}
