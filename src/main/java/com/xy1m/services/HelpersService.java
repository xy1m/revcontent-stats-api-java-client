package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.DataResults;
import com.xy1m.model.Interest;
import com.xy1m.model.Resource;
import com.xy1m.model.auth.Authentication;


public interface HelpersService {
    DataResults<Resource> getBrandTargets(Authentication auth) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    DataResults<Resource> getTopicTargets(Authentication auth) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    DataResults<Resource> getCountries(Authentication auth) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    DataResults<Resource> getDevices(Authentication auth) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    DataResults<Resource> getLanguages(Authentication auth) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    DataResults<Interest> getInterests(Authentication auth) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    DataResults<Resource> getRegions(Authentication auth, String country) throws APIUnauthorizedException,
            APIServerException, APIClientException;

}
