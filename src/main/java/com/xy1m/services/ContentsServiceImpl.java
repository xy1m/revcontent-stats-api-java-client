package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.ContentEndpoint;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.content.ContentAddOrUpdateResponse;
import com.xy1m.model.content.ContentAddRequest;
import com.xy1m.model.content.ContentGetAllResponse;
import com.xy1m.model.content.ContentGetResponse;
import com.xy1m.model.content.ContentUpdateRequest;
import com.xy1m.model.content.ResultCreative;

public class ContentsServiceImpl implements ContentsService {
    private final Boolean performValidations;
    private final ContentEndpoint endpoint;

    public ContentsServiceImpl(Boolean performValidations, ContentEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultCreative<ContentAddOrUpdateResponse> add(Authentication auth, Long boostId, ContentAddRequest payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.add(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<ContentAddOrUpdateResponse> update(Authentication auth, Long boostId, ContentUpdateRequest payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.update(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<ContentGetAllResponse> getAll(Authentication auth)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getAllContents(accessToken);
    }

    @Override
    public ResultsData<ContentGetResponse> getByBoostId(Authentication auth, Long boostId)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getContentByBoostId(accessToken, boostId);
    }
}
