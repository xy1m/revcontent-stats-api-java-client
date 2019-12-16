package com.xy1m.model.widget.optimizer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Widget {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Widget)) return false;
        Widget widget = (Widget) o;
        return Objects.equals(getId(), widget.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Widget{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
