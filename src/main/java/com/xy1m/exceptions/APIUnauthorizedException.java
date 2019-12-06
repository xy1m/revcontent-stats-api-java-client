package com.xy1m.exceptions;

public class APIUnauthorizedException extends APIException {

    public APIUnauthorizedException() {
        super("Unauthorized, expired token or invalid credentials");
    }
}
