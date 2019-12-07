package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xy1m.model.EnumActiveInactive;
import com.xy1m.model.EnumStatus;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoostUpdateStatusResponse {
    private Long id;
    private EnumActiveInactive enabled;
    private EnumStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumActiveInactive getEnabled() {
        return enabled;
    }

    public void setEnabled(EnumActiveInactive enabled) {
        this.enabled = enabled;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoostUpdateStatusResponse)) return false;
        BoostUpdateStatusResponse that = (BoostUpdateStatusResponse) o;
        return Objects.equals(getId(), that.getId()) &&
                getEnabled() == that.getEnabled() &&
                getStatus() == that.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEnabled(), getStatus());
    }

    @Override
    public String toString() {
        return "BoostUpdateStatusResponse{" +
                "id=" + id +
                ", enabled=" + enabled +
                ", status=" + status +
                '}';
    }

}
