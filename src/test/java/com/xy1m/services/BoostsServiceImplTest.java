package com.xy1m.services;

import com.xy1m.model.Boost;
import com.xy1m.model.CampaignResult;
import com.xy1m.model.DataResults;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.UUID;

public class BoostsServiceImplTest {
    private static Authentication auth;

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        Token token = new Token();
        token.setAccessToken("cd095b785de2abe725726963248c8cf56a6d31ef");
        auth = new Authentication(null, token);
    }

    @Test
    @Ignore
    public void getAll() {
        DataResults<Boost> boosts = Boost.getAll(auth);
        Assert.assertNotNull(boosts.getData());
    }

    @Test
    @Ignore
    public void createCpc() {
        CampaignResult<Boost> campaign = Boost.BoostBuilder.builder()
                .name("cpc campaign from sdk-" + UUID.randomUUID())
                .optimize("cpc")
                .build()
                .createCpc(auth);
        Assert.assertNotNull(campaign.getCampaign().getId());
    }

    @Test
    @Ignore
    public void createCpa() {
        CampaignResult<Boost> campaign = Boost.BoostBuilder.builder()
                .name("cpa campaign from sdk-" + UUID.randomUUID())
                .optimize("cpa")
                .build()
                .createCpa(auth);
        Assert.assertNotNull(campaign.getCampaign().getId());
    }

    @Test
    @Ignore
    public void update() {
        Boost campaign = Boost.BoostBuilder.builder()
                .name("george rocks-" + UUID.randomUUID())
                .build()
                .update(auth, "636673");
        Assert.assertNotNull(campaign.getId());
    }

    @Test
    @Ignore
    public void updateStatus() {
        Boost campaign = Boost.BoostBuilder.builder()
                .id("636673")
                .enabled("on")
                .build()
                .updateStatus(auth);
        Assert.assertNotNull(campaign.getId());
        Assert.assertNotNull(campaign.getEnabled());
        Assert.assertNotNull(campaign.getStatus());
    }
}