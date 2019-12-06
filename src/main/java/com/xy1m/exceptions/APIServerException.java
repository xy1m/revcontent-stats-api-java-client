package com.xy1m.exceptions;

public class APIServerException extends APIException {

    public APIServerException() {
        super("Failed to perform API call, might be due to internet connectivity issues");
    }

    public APIServerException(int responseCode) {
        super("Failed to perform API call with response code [%d], might be due to internet connectivity issues", responseCode);
    }
}
