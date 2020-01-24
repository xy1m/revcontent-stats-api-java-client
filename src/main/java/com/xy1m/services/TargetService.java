package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.targeting.BoostTarget;
import com.xy1m.model.targeting.WidgetTarget;

import java.util.List;
import java.util.Map;


public interface TargetService {

    ResultsData<BoostTarget> updateBoostTarget(Authentication auth, String boostId, BoostTarget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<BoostTarget> listBoostTargets(Authentication auth, String boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<WidgetTarget> updateWidgetTarget(Authentication auth, String boostId, WidgetTarget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<WidgetTarget> updateWidgetTarget(Authentication auth, String boostId, List<WidgetTarget> payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<WidgetTarget> listWidgetTargets(Authentication auth, String boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;
}
