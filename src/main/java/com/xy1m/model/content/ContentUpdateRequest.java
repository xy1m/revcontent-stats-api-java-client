package com.xy1m.model.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xy1m.model.EnumContentType;
import com.xy1m.model.EnumOnOff;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentUpdateRequest {
    private Long id;
    // 255
    private String targetUrl;
    // 8MB
    private String image;
    // 80
    private String headline;
    // 30
    private String brandName;
    private EnumContentType contentType;
    private EnumOnOff enabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public EnumOnOff getEnabled() {
        return enabled;
    }

    public void setEnabled(EnumOnOff enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContentUpdateRequest)) return false;
        ContentUpdateRequest that = (ContentUpdateRequest) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getTargetUrl(), that.getTargetUrl()) &&
                Objects.equals(getImage(), that.getImage()) &&
                Objects.equals(getHeadline(), that.getHeadline()) &&
                Objects.equals(getBrandName(), that.getBrandName()) &&
                getContentType() == that.getContentType() &&
                getEnabled() == that.getEnabled();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTargetUrl(), getImage(), getHeadline(), getBrandName(), getContentType(), getEnabled());
    }

    @Override
    public String toString() {
        return "ContentUpdateRequest{" +
                "id=" + id +
                ", targetUrl='" + targetUrl + '\'' +
                ", image='" + image + '\'' +
                ", headline='" + headline + '\'' +
                ", brandName='" + brandName + '\'' +
                ", contentType=" + contentType +
                ", enabled=" + enabled +
                '}';
    }

    public static final class APIRequestUpdateContentBuilder {
        private Long id;
        // 255
        private String targetUrl;
        // 8MB
        private String image;
        // 80
        private String headline;
        // 30
        private String brandName;
        private EnumContentType contentType;
        private EnumOnOff enabled;

        private APIRequestUpdateContentBuilder() {
        }

        public static APIRequestUpdateContentBuilder builder() {
            return new APIRequestUpdateContentBuilder();
        }

        public APIRequestUpdateContentBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public APIRequestUpdateContentBuilder targetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        public APIRequestUpdateContentBuilder image(String image) {
            this.image = image;
            return this;
        }

        public APIRequestUpdateContentBuilder headline(String headline) {
            this.headline = headline;
            return this;
        }

        public APIRequestUpdateContentBuilder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public APIRequestUpdateContentBuilder contentType(EnumContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        public APIRequestUpdateContentBuilder enabled(EnumOnOff enabled) {
            this.enabled = enabled;
            return this;
        }

        public ContentUpdateRequest build() {
            ContentUpdateRequest aPIRequestUpdateContentUpdateRequest = new ContentUpdateRequest();
            aPIRequestUpdateContentUpdateRequest.setId(id);
            aPIRequestUpdateContentUpdateRequest.setTargetUrl(targetUrl);
            aPIRequestUpdateContentUpdateRequest.setImage(image);
            aPIRequestUpdateContentUpdateRequest.setHeadline(headline);
            aPIRequestUpdateContentUpdateRequest.setBrandName(brandName);
            aPIRequestUpdateContentUpdateRequest.setContentType(contentType);
            aPIRequestUpdateContentUpdateRequest.setEnabled(enabled);
            return aPIRequestUpdateContentUpdateRequest;
        }
    }
}
