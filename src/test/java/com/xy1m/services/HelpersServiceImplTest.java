package com.xy1m.services;

import com.xy1m.RevContent;
import com.xy1m.model.DataResults;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.resource.Interest;
import com.xy1m.model.resource.Resource;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class HelpersServiceImplTest {
    private static RevContent revContent;
    private static Authentication auth;

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        revContent = RevContent.builder().build();
        Token token = new Token();
        token.setAccessToken("cd095b785de2abe725726963248c8cf56a6d31ef");
        auth = new Authentication(null, token);
    }


    @Test
    @Ignore
    public void getBrandTargets() {
        DataResults<Resource> result = revContent.helpersService().getBrandTargets(auth);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getTopicTargets() {
        DataResults<Resource> result = revContent.helpersService().getTopicTargets(auth);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getCountries() {
        DataResults<Resource> result = revContent.helpersService().getCountries(auth);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getDevices() {
        DataResults<Resource> result = revContent.helpersService().getDevices(auth);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getLanguages() {
        DataResults<Resource> result = revContent.helpersService().getLanguages(auth);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getInterests() {
        DataResults<Interest> result = revContent.helpersService().getInterests(auth);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getRegions() {
        DataResults<Resource> result = revContent.helpersService().getRegions(auth, "US");
        System.out.println(result);
        Assert.assertNotNull(result);
    }
}