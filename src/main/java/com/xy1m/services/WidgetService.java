package com.xy1m.services;

import com.xy1m.exceptions.APIClientException;
import com.xy1m.exceptions.APIServerException;
import com.xy1m.exceptions.APIUnauthorizedException;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.widget.optimizer.Widget;


public interface WidgetService {

    /**
     * @param auth Authorization token
     * @param boostId Boost id
     * @param payload Widget id listContents divided by commas
     * @return succeed response { "success": true }
     * @throws APIUnauthorizedException
     * @throws APIServerException
     * @throws APIClientException
     */
    ResultsData<Widget> addBlacklist(Authentication auth, String boostId, Widget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    /**
     * @param auth Authorization token
     * @param boostId Boost id
     * @param payload Widget id listContents divided by commas
     * @return succeed response { "success": true }
     * @throws APIUnauthorizedException
     * @throws APIServerException
     * @throws APIClientException
     */
    ResultsData<Widget> deleteBlacklist(Authentication auth, String boostId, Widget payload)
            throws APIUnauthorizedException, APIServerException, APIClientException;

    /**
     * @param auth Authorization token
     * @param boostId Boost id
     * @return blacklisted widget ids, example: { "data":[{"id":"100"},{"id":"200"}]}
     * @throws APIUnauthorizedException
     * @throws APIServerException
     * @throws APIClientException
     */
    ResultsData<Widget> listBlacklists(Authentication auth, String boostId)
            throws APIUnauthorizedException, APIServerException, APIClientException;

}
