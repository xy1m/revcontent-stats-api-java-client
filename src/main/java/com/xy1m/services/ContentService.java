package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultCreative;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.content.Content;

import java.util.Map;


public interface ContentService {
    ResultCreative<Content> addContent(Authentication auth, String boostId, Content payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Content> updateContent(Authentication auth, String boostId, Content payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Content> listContent(Authentication auth, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    ResultsData<Content> getContent(Authentication auth, String boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException;
}
