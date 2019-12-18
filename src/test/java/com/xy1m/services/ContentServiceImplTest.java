package com.xy1m.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.xy1m.RevContent;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.EnumContentType;
import com.xy1m.model.EnumEnabled;
import com.xy1m.model.ResultCreative;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.content.Content;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ContentServiceImplTest {
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
    public void addContent() throws JsonProcessingException {
        Content payload = Content.APIRequestAddBuilder.builder()
                .targetUrl("https://www.referyourchasecard.com/6a/W6M88PKMRO")
                .image("https://www.referyourchasecard.com/R101-029/1010184/images/photo4.jpg")
                .headline("Chase Sapphired Prefered Credit Card")
                .brandName("Chase")
                .contentType(EnumContentType.article)
                .build();
        ResultCreative<Content> result = revContent.contentsService().addContent(auth, BOOST_ID, payload);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void updateContent() throws JsonProcessingException {
        Content payload = Content.APIRequestUpdateBuilder.builder()
                .id("4155513")
                .enabled(EnumEnabled.on)
                .build();
        ResultsData<Content> result = revContent.contentsService().updateContent(auth, BOOST_ID, payload);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void listContents() throws JsonProcessingException {
        ResultsData<Content> result = revContent.contentsService().listContent(auth, Maps.newHashMap());
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getContent() throws JsonProcessingException {
        ResultsData<Content> result = revContent.contentsService().getContent(auth, BOOST_ID, Maps.newHashMap());
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }
}