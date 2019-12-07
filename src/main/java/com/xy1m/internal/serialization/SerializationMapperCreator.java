package com.xy1m.internal.serialization;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.xy1m.internal.config.SerializationConfig;

public class SerializationMapperCreator {
    public static ObjectMapper createObjectMapper(SerializationConfig serializationConfig) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        serializationConfig.getMixins().forEach(objectMapper::addMixIn);

        if (serializationConfig.shouldIgnoreAnySetterAnnotation()) {
            objectMapper.setAnnotationIntrospector(new IgnoreAnySetterSerializationIntrospector());
        }

        return objectMapper;
    }
}
