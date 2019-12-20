package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.internal.WidgetEndpoint;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.widget.optimizer.Widget;
import org.apache.logging.log4j.util.Strings;

import static com.google.common.base.Preconditions.checkArgument;

public class WidgetServiceImpl implements WidgetService {

    private final boolean performValidations;
    private final WidgetEndpoint endpoint;

    public WidgetServiceImpl(Boolean performValidations, WidgetEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultsData<Widget> addBlacklist(Authentication auth, String boostId, Widget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        if (performValidations) {
            checkArgument(Strings.isNotBlank(payload.getId()), "Widget ID is required");
        }
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.addWidget(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<Widget> deleteBlacklist(Authentication auth, String boostId, Widget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        if (performValidations) {
            checkArgument(Strings.isNotBlank(payload.getId()), "Widget ID is required");
        }
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.deleteWidget(accessToken, boostId, payload);
    }

    @Override
    public ResultsData<Widget> listBlacklists(Authentication auth, String boostId)
            throws APIUnauthorizedException, APIServerException, APIClientException {
        String accessToken = auth.getToken().getAccessTokenForHeader();
        return endpoint.listWidgets(accessToken, boostId);
    }
}
