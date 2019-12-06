package com.xy1m.services;

import com.xy1m.RevContent;
import com.xy1m.model.DataResults;
import com.xy1m.model.EnumContentType;
import com.xy1m.model.EnumOnOff;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.content.ContentAddRequest;
import com.xy1m.model.content.ContentGetAllResponse;
import com.xy1m.model.content.ContentGetResponse;
import com.xy1m.model.content.ContentResponse;
import com.xy1m.model.content.ContentUpdateRequest;
import com.xy1m.model.content.CreativeResult;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ContentsServiceImplTest {
    private static RevContent revContent;
    private static Authentication auth;
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
    }

    @Test
    @Ignore
    public void add() {
        ContentAddRequest payload = ContentAddRequest.APIRequestAddContentBuilder.builder()
                .targetUrl("https://www.referyourchasecard.com/6a/W6M88PKMRO")
                .image("https://www.referyourchasecard.com/R101-029/1010184/images/photo4.jpg")
                .headline("Chase Sapphired Prefered Credit Card")
                .brandName("Chase")
                .contentType(EnumContentType.article)
                .build();
        CreativeResult<ContentResponse> result = revContent.contentsService().add(auth, BOOST_ID, payload);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void update() {
        ContentUpdateRequest payload = ContentUpdateRequest.APIRequestUpdateContentBuilder.builder()
                .id(4155513L)
                .enabled(EnumOnOff.on)
                .build();
        DataResults<ContentResponse> result = revContent.contentsService().update(auth, BOOST_ID, payload);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getAll() {
        DataResults<ContentGetAllResponse> result = revContent.contentsService().getAll(auth);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void getByBoostId() {
        DataResults<ContentGetResponse> result = revContent.contentsService().getByBoostId(auth, BOOST_ID);
        System.out.println(result);
        Assert.assertNotNull(result);
    }
}