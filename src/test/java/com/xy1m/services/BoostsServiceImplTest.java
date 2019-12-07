package com.xy1m.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.RevContent;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.EnumOnOff;
import com.xy1m.model.EnumOptimize;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.boost.BoostAddRequest;
import com.xy1m.model.boost.BoostAddResponse;
import com.xy1m.model.boost.BoostGetAllResponse;
import com.xy1m.model.boost.BoostUpdateRequest;
import com.xy1m.model.boost.BoostUpdateResponse;
import com.xy1m.model.boost.BoostUpdateStatusRequest;
import com.xy1m.model.boost.BoostUpdateStatusResponse;
import com.xy1m.model.boost.ResultCampaign;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.UUID;

public class BoostsServiceImplTest {
    private static RevContent revContent;
    private static Authentication auth;
    private static ObjectMapper objectMapper;
    private static long BOOST_ID = 636673L;

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        revContent = RevContent.builder().build();
        Token token = new Token();
        token.setAccessToken("cd095b785de2abe725726963248c8cf56a6d31ef");
        auth = new Authentication(null, token);
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }

    @Test
    @Ignore
    public void getAll() throws JsonProcessingException {
        ResultsData<BoostGetAllResponse> result = revContent.campaignsService().getAll(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getData());
    }

    @Test
    @Ignore
    public void createCpc() throws JsonProcessingException {
        ResultCampaign<BoostAddResponse> result = revContent.campaignsService().createCpc(auth,
                BoostAddRequest.BoostAddRequestBuilder.builder()
                        .name("cpc campaign from sdk-" + UUID.randomUUID())
                        .optimize(EnumOptimize.cpc)
                        .build()
        );
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getCampaign().getId());
    }

    @Test
    @Ignore
    public void createCpa() throws JsonProcessingException {
        ResultCampaign<BoostAddResponse> result = revContent.campaignsService().createCpa(auth,
                BoostAddRequest.BoostAddRequestBuilder.builder()
                        .name("cpa campaign from sdk-" + UUID.randomUUID())
                        .optimize(EnumOptimize.cpa)
                        .build()
        );
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getCampaign().getId());
    }

    @Test
    @Ignore
    public void update() throws JsonProcessingException {
        BoostUpdateResponse result = revContent.campaignsService().update(auth, BOOST_ID,
                BoostUpdateRequest.BoostUpdateRequestBuilder.builder()
                        .name("rename from update-" + UUID.randomUUID())
                        .build()
        );
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getId());
    }

    @Test
    @Ignore
    public void updateStatus() throws JsonProcessingException {
        BoostUpdateStatusResponse result = revContent.campaignsService().updateStatus(auth,
                BoostUpdateStatusRequest.BoostUpdateStatusRequestBuilder.builder()
                        .id(BOOST_ID)
                        .enabled(EnumOnOff.on)
                        .build());
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getId());
    }
}