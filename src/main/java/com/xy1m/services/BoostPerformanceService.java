package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.boost.BoostPerformance;

import java.util.Map;


public interface BoostPerformanceService {
    ResultsData<BoostPerformance> getBoostPerformance(Authentication auth, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;
}
