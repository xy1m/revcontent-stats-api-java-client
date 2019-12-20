package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.ContentEndpoint;
import com.xy1m.model.ResultCreative;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.content.Content;

import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.logging.log4j.util.Strings.isNotBlank;

public class ContentServiceImpl implements ContentService {
    private static long MAX_LENGTH_TARGET_URL = 255;
    private static long MAX_LENGTH_HEADLINE = 80;
    private static long MAX_LENGTH_BRAND_NAME = 30;
    private final Boolean performValidations;
    private final ContentEndpoint endpoint;

    public ContentServiceImpl(Boolean performValidations, ContentEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultCreative<Content> addContent(Authentication auth, String boostId, Content payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        if (performValidations) {
            String targetUrl = payload.getTargetUrl();
            String image = payload.getImage();
            String headLine = payload.getHeadline();
            String brandName = payload.getBrandName();

            checkArgument(isNotBlank(targetUrl), "TargetUrl is required");
            checkArgument(isNotBlank(image), "Image is required");
            checkArgument(isNotBlank(headLine), "Headline is required");
            checkArgument(isNotBlank(brandName), "BrandName is required");

            checkArgument(targetUrl.length() <= MAX_LENGTH_TARGET_URL,
                    "Target url must be less than " + MAX_LENGTH_TARGET_URL);
            checkArgument(headLine.length() <= MAX_LENGTH_HEADLINE,
                    "Headline must be less than " + MAX_LENGTH_HEADLINE);
            checkArgument(brandName.length() <= MAX_LENGTH_BRAND_NAME,
                    "Brand name must be less than " + MAX_LENGTH_BRAND_NAME);
        }
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.addContent(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<Content> updateContent(Authentication auth, String boostId, Content payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        if (performValidations) {
            checkArgument(isNotBlank(payload.getId()), "ID is required");
        }
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.updateContent(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<Content> listContents(Authentication auth, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.listContents(accessToken, filter);
    }

    @Override
    public ResultsData<Content> getContent(Authentication auth, String boostId, Map<String, String> filter)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.getContent(accessToken, boostId, filter);
    }
}
