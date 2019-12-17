package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xy1m.model.EnumEnabled;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoostUpdateStatusRequest {
    private Long id;
    private EnumEnabled enabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumEnabled getEnabled() {
        return enabled;
    }

    public void setEnabled(EnumEnabled enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoostUpdateStatusRequest)) return false;
        BoostUpdateStatusRequest that = (BoostUpdateStatusRequest) o;
        return Objects.equals(getId(), that.getId()) &&
                getEnabled() == that.getEnabled();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEnabled());
    }

    @Override
    public String toString() {
        return "BoostUpdateStatusRequest{" +
                "id='" + id + '\'' +
                ", enabled=" + enabled +
                '}';
    }


    public static final class BoostUpdateStatusRequestBuilder {
        private Long id;
        private EnumEnabled enabled;

        private BoostUpdateStatusRequestBuilder() {
        }

        public static BoostUpdateStatusRequestBuilder builder() {
            return new BoostUpdateStatusRequestBuilder();
        }

        public BoostUpdateStatusRequestBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public BoostUpdateStatusRequestBuilder enabled(EnumEnabled enabled) {
            this.enabled = enabled;
            return this;
        }

        public BoostUpdateStatusRequest build() {
            BoostUpdateStatusRequest boostUpdateStatusRequest = new BoostUpdateStatusRequest();
            boostUpdateStatusRequest.setId(id);
            boostUpdateStatusRequest.setEnabled(enabled);
            return boostUpdateStatusRequest;
        }
    }
}
