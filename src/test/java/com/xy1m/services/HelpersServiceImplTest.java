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

public class HelpersServiceImplTest {
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
        token.setAccessToken("cd095b785de2abe725726963248c8cf56a6d31ef");
        auth = new Authentication(null, token);
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }


    @Test
    @Ignore
    public void getBrandTargets() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helpersService().getBrandTargets(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getTopicTargets() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helpersService().getTopicTargets(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getCountries() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helpersService().getCountries(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getDevices() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helpersService().getDevices(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getLanguages() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helpersService().getLanguages(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getInterests() throws JsonProcessingException {
        ResultsData<Interest> result = revContent.helpersService().getInterests(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getRegions() throws JsonProcessingException {
        ResultsData<Resource> result = revContent.helpersService().getRegions(auth, "US");
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }
}