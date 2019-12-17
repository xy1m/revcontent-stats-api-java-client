package com.xy1m.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.RevContent;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.EnumEnabled;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.targeting.BoostTarget;
import com.xy1m.model.targeting.WidgetTarget;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;

public class TargetServiceImplTest {
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
        token.setAccessToken("29c2e2d3d57bcd8225675dc28b85c70fe45eb491");
        auth = new Authentication(null, token);
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }

    @Test
    @Ignore
    public void updateBoostTarget() throws JsonProcessingException {
        BoostTarget payload = new BoostTarget();
        payload.setTagId("74");
        payload.setEnabled(EnumEnabled.on);
        payload.setBid("0.1");
        ResultsData<BoostTarget> result = revContent.targetService().updateBoostTarget(auth, BOOST_ID, payload);
        System.out.println(objectMapper.writeValueAsString(result));
    }

    @Test
    @Ignore
    public void listBoostTargets() throws JsonProcessingException {
        ResultsData<BoostTarget> result = revContent.targetService().listBoostTargets(auth, BOOST_ID, new HashMap<>());
        System.out.println(objectMapper.writeValueAsString(result));
    }

    @Test
    @Ignore
    public void updateWidgetTarget() throws JsonProcessingException {
        WidgetTarget payload = new WidgetTarget();
        payload.setId("74");
        payload.setBid("0.6");
        payload.setEnabled(EnumEnabled.on);
        ResultsData<WidgetTarget> result = revContent.targetService().updateWidgetTarget(auth, BOOST_ID, payload);
        System.out.println(objectMapper.writeValueAsString(result));
    }

    @Test
    @Ignore
    public void listWidgetTargets() throws JsonProcessingException {
        ResultsData<WidgetTarget> result = revContent.targetService().listWidgetTargets(auth, BOOST_ID, new HashMap<>());
        System.out.println(objectMapper.writeValueAsString(result));
    }
}