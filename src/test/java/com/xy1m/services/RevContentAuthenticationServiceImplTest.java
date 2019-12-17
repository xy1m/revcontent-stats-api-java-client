package com.xy1m.services;

import com.xy1m.RevContent;
import com.xy1m.model.auth.Authentication;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class RevContentAuthenticationServiceImplTest {

    private static RevContent revContent;

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        revContent = RevContent.builder().build();
    }

    @Test
    @Ignore
    public void clientCredentials() {
        String clientId = "***";
        String clientSecret = "***";
        Authentication authentication = revContent.authenticationService().clientCredentials(clientId, clientSecret);
        System.out.println(authentication);
        Assert.assertNotNull(authentication);
    }

    @Test
    @Ignore
    public void authenticate() {
        String token = "***";
        Authentication authentication = revContent.authenticationService().authenticate(token);
        Assert.assertEquals(token, authentication.getToken().getAccessToken());
    }
}