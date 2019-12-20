package com.xy1m.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.RevContent;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.resource.Interest;
import com.xy1m.model.resource.Resource;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class HelperServiceImplTest {
    private static RevContent revContent;
    private static Authentication auth;
    private static ObjectMapper objectMapper;

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        revContent = RevContent.builder().build();
        Token token = new Token();
        token.setAccessToken("29c2e2d3d57bcd8225675dc28b85c70fe45eb491");
        auth = new Authentication(null, token);
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }


    @Test
    @Ignore
    public void getBrandTargets() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helperService().getBrandTargets(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getTopicTargets() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helperService().getTopicTargets(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getCountries() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helperService().getCountries(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getDevices() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helperService().getDevices(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getLanguages() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helperService().getLanguages(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getInterests() throws JsonProcessingException {
        ResultsData<Interest> result = revContent.helperService().getInterests(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getRegions() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helperService().getRegions(auth, "US");
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }
}