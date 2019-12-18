package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.Interest;
import com.xy1m.model.resource.Resource;


public interface HelperService {
    ResultsData<Resource> getBrandTargets(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Resource> getTopicTargets(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Resource> getCountries(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Resource> getDevices(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Resource> getLanguages(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Interest> getInterests(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Resource> getRegions(Authentication auth, String country)
            throws APIUnauthorizedException, APIServerException, APIClientException;
}
