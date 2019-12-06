package com.xy1m.model.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xy1m.model.EnumContentType;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentAddRequest {
    // 255
    private String targetUrl;
    // 8MB
    private String image;
    // 80
    private String headline;
    // 30
    private String brandName;
    private EnumContentType contentType;

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public EnumContentType getContentType() {
        return contentType;
    }

    public void setContentType(EnumContentType contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContentAddRequest)) return false;
        ContentAddRequest that = (ContentAddRequest) o;
        return Objects.equals(getTargetUrl(), that.getTargetUrl()) &&
                Objects.equals(getImage(), that.getImage()) &&
                Objects.equals(getHeadline(), that.getHeadline()) &&
                Objects.equals(getBrandName(), that.getBrandName()) &&
                getContentType() == that.getContentType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTargetUrl(), getImage(), getHeadline(), getBrandName(), getContentType());
    }

    @Override
    public String toString() {
        return "ContentAddRequest{" +
                "targetUrl='" + targetUrl + '\'' +
                ", image='" + image + '\'' +
                ", headline='" + headline + '\'' +
                ", brandName='" + brandName + '\'' +
                ", contentType=" + contentType +
                '}';
    }

    public static final class APIRequestAddContentBuilder {
        // 255
        private String targetUrl;
        // 8MB
        private String image;
        // 80
        private String headline;
        // 30
        private String brandName;
        private EnumContentType contentType;

        private APIRequestAddContentBuilder() {
        }

        public static APIRequestAddContentBuilder builder() {
            return new APIRequestAddContentBuilder();
        }

        public APIRequestAddContentBuilder targetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        public APIRequestAddContentBuilder image(String image) {
            this.image = image;
            return this;
        }

        public APIRequestAddContentBuilder headline(String headline) {
            this.headline = headline;
            return this;
        }

        public APIRequestAddContentBuilder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public APIRequestAddContentBuilder contentType(EnumContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        public ContentAddRequest build() {
            ContentAddRequest aPIRequestAddContentAddRequest = new ContentAddRequest();
            aPIRequestAddContentAddRequest.setTargetUrl(targetUrl);
            aPIRequestAddContentAddRequest.setImage(image);
            aPIRequestAddContentAddRequest.setHeadline(headline);
            aPIRequestAddContentAddRequest.setBrandName(brandName);
            aPIRequestAddContentAddRequest.setContentType(contentType);
            return aPIRequestAddContentAddRequest;
        }
    }
}
