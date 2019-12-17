package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.boost.BoostAddRequest;
import com.xy1m.model.boost.BoostAddResponse;
import com.xy1m.model.boost.BoostGetAllResponse;
import com.xy1m.model.boost.BoostUpdateRequest;
import com.xy1m.model.boost.BoostUpdateResponse;
import com.xy1m.model.boost.BoostUpdateStatusRequest;
import com.xy1m.model.boost.BoostUpdateStatusResponse;
import com.xy1m.model.boost.ResultCampaign;


public interface BoostsService {
    ResultsData<BoostGetAllResponse> getAll(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultCampaign<BoostAddResponse> createCpc(Authentication auth, BoostAddRequest payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultCampaign<BoostAddResponse> createCpa(Authentication auth, BoostAddRequest payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    BoostUpdateResponse update(Authentication auth, Long boostId, BoostUpdateRequest payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    BoostUpdateStatusResponse updateStatus(Authentication auth, BoostUpdateStatusRequest payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;
}
