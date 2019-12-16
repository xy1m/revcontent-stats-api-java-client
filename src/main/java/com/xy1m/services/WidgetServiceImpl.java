package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.WidgetEndpoint;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.widget.optimizer.Widget;

public class WidgetServiceImpl implements WidgetService {

    private final boolean performValidations;
    private final WidgetEndpoint endpoint;

    public WidgetServiceImpl(Boolean performValidations, WidgetEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultsData<Widget> listBlacklist(Authentication auth, Long boostId) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.listBlacklist(accessToken, boostId);
    }

    @Override
    public ResultsData<Widget> addBlacklist(Authentication auth, Long boostId, Widget widget) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.addBlacklist(accessToken, boostId, widget);
    }

    @Override
    public ResultsData<Widget> removeBlacklist(Authentication auth, Long boostId, Widget widget) throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.removeBlacklist(accessToken, boostId, widget);
    }
}
