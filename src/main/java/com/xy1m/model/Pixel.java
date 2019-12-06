package com.xy1m.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "amount",
        "pixel"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pixel {
    private String id;
    private String name;
    private String amount;
    private String pixel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPixel() {
        return pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pixel)) return false;
        Pixel pixel1 = (Pixel) o;
        return Objects.equals(getId(), pixel1.getId()) &&
                Objects.equals(getName(), pixel1.getName()) &&
                Objects.equals(getAmount(), pixel1.getAmount()) &&
                Objects.equals(getPixel(), pixel1.getPixel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAmount(), getPixel());
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", pixel='" + pixel + '\'' +
                '}';
    }
}
