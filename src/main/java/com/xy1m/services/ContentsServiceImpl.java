package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.ContentEndpoint;
import com.xy1m.model.DataResults;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.content.ContentAddRequest;
import com.xy1m.model.content.ContentGetAllResponse;
import com.xy1m.model.content.ContentUpdateRequest;
import com.xy1m.model.content.ContentResponse;
import com.xy1m.model.content.ContentGetResponse;
import com.xy1m.model.content.CreativeResult;

public class ContentsServiceImpl implements ContentsService {
    private final Boolean performValidations;
    private final ContentEndpoint endpoint;

    public ContentsServiceImpl(Boolean performValidations, ContentEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public CreativeResult<ContentResponse> add(Authentication auth, Long boostId, ContentAddRequest payload) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.add(accessToken, boostId, payload);
    }

    @Override
    public DataResults<ContentResponse> update(Authentication auth, Long boostId, ContentUpdateRequest payload) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.update(accessToken, boostId, payload);
    }

    @Override
    public DataResults<ContentGetAllResponse> getAll(Authentication auth) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getAllContents(accessToken);
    }

    @Override
    public DataResults<ContentGetResponse> getByBoostId(Authentication auth, Long boostId) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getContentByBoostId(accessToken, boostId);
    }
}
