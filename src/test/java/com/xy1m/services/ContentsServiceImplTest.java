package com.xy1m.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.RevContent;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.EnumContentType;
import com.xy1m.model.EnumEnabled;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.content.ContentAddOrUpdateResponse;
import com.xy1m.model.content.ContentAddRequest;
import com.xy1m.model.content.ContentGetAllResponse;
import com.xy1m.model.content.ContentGetResponse;
import com.xy1m.model.content.ContentUpdateRequest;
import com.xy1m.model.content.ResultCreative;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ContentsServiceImplTest {
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
    public void add() throws JsonProcessingException {
        ContentAddRequest payload = ContentAddRequest.APIRequestAddContentBuilder.builder()
                .targetUrl("https://www.referyourchasecard.com/6a/W6M88PKMRO")
                .image("https://www.referyourchasecard.com/R101-029/1010184/images/photo4.jpg")
                .headline("Chase Sapphired Prefered Credit Card")
                .brandName("Chase")
                .contentType(EnumContentType.article)
                .build();
        ResultCreative<ContentAddOrUpdateResponse> result = revContent.contentsService().add(auth, BOOST_ID, payload);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void update() throws JsonProcessingException {
        ContentUpdateRequest payload = ContentUpdateRequest.APIRequestUpdateContentBuilder.builder()
                .id(4155513L)
                .enabled(EnumEnabled.on)
                .build();
        ResultsData<ContentAddOrUpdateResponse> result = revContent.contentsService().update(auth, BOOST_ID, payload);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getAll() throws JsonProcessingException {
        ResultsData<ContentGetAllResponse> result = revContent.contentsService().getAll(auth);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getByBoostId() throws JsonProcessingException {
        ResultsData<ContentGetResponse> result = revContent.contentsService().getByBoostId(auth, BOOST_ID);
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result);
    }
}