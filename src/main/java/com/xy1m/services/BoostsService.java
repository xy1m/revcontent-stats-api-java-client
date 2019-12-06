package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.Boost;
import com.xy1m.model.DataResults;
import com.xy1m.model.CampaignResult;
import com.xy1m.model.auth.Authentication;


public interface BoostsService {
    DataResults<Boost> getAll(Authentication auth) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    CampaignResult<Boost> createCpc(Authentication auth, Boost boost) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    CampaignResult<Boost> createCpa(Authentication auth, Boost boost) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    Boost update(Authentication auth, String boostId, Boost boost) throws APIUnauthorizedException,
            APIServerException, APIClientException;

    Boost updateStatus(Authentication auth, Boost boost) throws APIUnauthorizedException,
            APIServerException, APIClientException;
}
