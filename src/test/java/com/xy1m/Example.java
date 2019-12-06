package com.xy1m;

import com.xy1m.model.auth.Authentication;

public class Example {
    public static void main(String[] args) {
        // replace with your own client_id and client_secret
        String clientId = "***";
        String clientSecret = "***";

        RevContent revContent = RevContent.builder().build();
        Authentication authentication = revContent.authenticationService().clientCredentials(clientId, clientSecret);
        System.out.println(authentication);
    }
}
