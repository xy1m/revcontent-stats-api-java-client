package com.xy1m.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.xy1m.RevContent;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.EnumEnabled;
import com.xy1m.model.EnumOptimize;
import com.xy1m.model.ResultCampaign;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.boost.Boost;
import com.xy1m.model.boost.BoostStats;
import com.xy1m.model.boost.WidgetStats;
import com.xy1m.model.conversion.Conversion;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BoostServiceImplTest {
    private static RevContent revContent;
    private static Authentication auth;
    private static ObjectMapper objectMapper;
    private static String BOOST_ID = "88517";

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        revContent = RevContent.builder().build();
        Token token = new Token();
        token.setAccessToken("fd2fbd63435b7f80fb1d7d5f1b1841c16fe70d2c");
        auth = new Authentication(null, token);
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }

    @Test
    @Ignore
    public void listBoosts() throws JsonProcessingException {
        ResultsData<Boost> result = revContent.boostService().listBoosts(auth, Maps.newHashMap());
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getData());
    }

    @Test
    @Ignore
    public void addBoost() throws JsonProcessingException {
        Conversion conversion = new Conversion();
        conversion.setId("4900");
        ResultCampaign<Boost> result = revContent.boostService().addBoost(auth,
                Boost.APIRequestAddBuilder.builder()
                        .name("cpa campaign with conversion from sdk-" + UUID.randomUUID())
                        .optimize(EnumOptimize.cpa)
                        .conversion(Arrays.asList(conversion))
                        .build()
        );
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getCampaign().getId());
    }

    @Test
    @Ignore
    public void updateBoost() throws JsonProcessingException {
        Boost result = revContent.boostService().updateBoost(auth, BOOST_ID,
                Boost.APIRequestUpdateBuilder.builder()
                        .name("rename from updateContent-" + UUID.randomUUID())
                        .build()
        );
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getId());
    }

    @Test
    @Ignore
    public void updateBoostStatus() throws JsonProcessingException {
        Boost result = revContent.boostService().updateBoostStatus(auth,
                Boost.APIRequestUpdateBuilder.builder()
                        .id(BOOST_ID)
                        .enabled(EnumEnabled.on)
                        .build());
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getId());
    }

    @Test
    @Ignore
    public void getBoostPerformance() throws JsonProcessingException {
        Map<String, String> filter = new HashMap<>();
        filter.put("boost_id", BOOST_ID);
        filter.put("date_from", "2016-06-01");
        filter.put("date_to", "2016-06-30");
        ResultsData<BoostStats> result = revContent.boostService().getBoostStats(auth, filter);
        System.out.println(objectMapper.writeValueAsString(result));
    }

    @Test
    @Ignore
    public void getWidgetStats() throws JsonProcessingException {
        Map<String, String> filter = new HashMap<>();
        filter.put("date_from", "2016-06-01");
        filter.put("date_to", "2016-06-30");
        ResultsData<WidgetStats> result = revContent.boostService().getWidgetStats(auth, BOOST_ID, filter);
        System.out.println(objectMapper.writeValueAsString(result));
    }
}