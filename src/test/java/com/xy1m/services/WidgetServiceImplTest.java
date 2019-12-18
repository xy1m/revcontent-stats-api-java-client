package com.xy1m.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.RevContent;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.widget.optimizer.Widget;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class WidgetServiceImplTest {

    private static RevContent revContent;
    private static Authentication auth;
    private static ObjectMapper objectMapper;
    private static String BOOST_ID = "636673";

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
    public void listBlacklist() throws JsonProcessingException {
        ResultsData<Widget> result = revContent.widgetService().listBlacklist(auth, BOOST_ID);
        System.out.println(objectMapper.writeValueAsString(result));
    }

    @Test
    @Ignore
    public void addBlacklist() throws JsonProcessingException {
        Widget payload = new Widget();
        payload.setId("100,101,102");
        ResultsData<Widget> result = revContent.widgetService().addBlacklist(auth, BOOST_ID, payload);
        System.out.println(objectMapper.writeValueAsString(result));
    }

    @Test
    @Ignore
    public void deleteBlacklist() throws JsonProcessingException {
        Widget payload = new Widget();
        payload.setId("100,101");
        ResultsData<Widget> result = revContent.widgetService().removeBlacklist(auth, BOOST_ID, payload);
        System.out.println(objectMapper.writeValueAsString(result));
    }
}