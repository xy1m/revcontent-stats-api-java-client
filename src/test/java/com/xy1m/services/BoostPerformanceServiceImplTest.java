package com.xy1m.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.RevContent;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.boost.BoostPerformance;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BoostPerformanceServiceImplTest {

    private static RevContent revContent;
    private static Authentication auth;
    private static ObjectMapper objectMapper;
    private static long BOOST_ID = 89122L;

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        revContent = RevContent.builder().build();
        Token token = new Token();
        token.setAccessToken("c21676bb59a32436dbabaea6b9bcd64f6df620f0");
        auth = new Authentication(null, token);
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }

    @Test
    @Ignore
    public void getBoostPerformance() throws JsonProcessingException {
        Map<String, String> filter = new HashMap<>();
        filter.put("boost_id", "" + BOOST_ID);
        filter.put("date_from", "2016-06-01");
        filter.put("date_to", "2016-06-30");
        ResultsData<BoostPerformance> result = revContent.boostPerformanceService().getBoostPerformance(auth, filter);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getData());
    }
}