package com.xy1m.internal;

import com.xy1m.annotations.Final;
import com.xy1m.annotations.ReadOnly;
import com.xy1m.annotations.Required;
import com.xy1m.exceptions.APIClientException;
import com.xy1m.internal.functional.BiFunction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FieldsValidator {

    private static final Logger logger = LogManager.getLogger(FieldsValidator.class);
    private static final BiFunction<Object, Field, Boolean, IllegalAccessException> FAIL_ON_NULL_FUNC = (object, field) -> field.get(object) == null;
    private static final BiFunction<Object, Field, Boolean, IllegalAccessException> FAIL_ON_NOT_NULL_FUNC = (object, field) -> field.get(object) != null;

    private static final Map<Class<?>, BiFunction<Object, Field, Boolean, IllegalAccessException>> FAIL_ON_CREATION;
    private static final Map<Class<?>, BiFunction<Object, Field, Boolean, IllegalAccessException>> FAIL_ON_UPDATE;

    static {
        FAIL_ON_CREATION = new HashMap<>();
        FAIL_ON_CREATION.put(Required.class, FAIL_ON_NULL_FUNC);
        FAIL_ON_CREATION.put(Final.class, FAIL_ON_NULL_FUNC);
        FAIL_ON_CREATION.put(ReadOnly.class, FAIL_ON_NOT_NULL_FUNC);

        FAIL_ON_UPDATE = new HashMap<>();
        FAIL_ON_UPDATE.put(ReadOnly.class, FAIL_ON_NOT_NULL_FUNC);
        FAIL_ON_UPDATE.put(Final.class, FAIL_ON_NOT_NULL_FUNC);
    }

    public static void validateCreateOperation(Object obj) {
        validate(obj, FAIL_ON_CREATION);
    }

    public static void validateUpdateOperation(Object obj) {
        validate(obj, FAIL_ON_UPDATE);
    }

    private static void validate(Object obj, Map<Class<?>, BiFunction<Object, Field, Boolean, IllegalAccessException>> failOn) {
        List<Field> declaredFields = getAllFields(obj.getClass());
        for (Field field : declaredFields) {
            for (Annotation fieldAnnotation : field.getDeclaredAnnotations()) {
                Class<?> annotation = fieldAnnotation.annotationType();
                BiFunction<Object, Field, Boolean, IllegalAccessException> func = failOn.get(annotation);
                if (func != null) {
                    field.setAccessible(true);
                    try {
                        if (func.apply(obj, field)) {
                            throw new APIClientException("Field '%s' is '%s'", field.getName(), annotation.getSimpleName());
                        }

                    }
                    catch (IllegalAccessException e) {
                        logger.error("Failed to pull field data from field [{}] for annotation [{}]", field.getName(), annotation.toString());
                    }
                }
            }
        }
    }

    private static List<Field> getAllFields(Class<?> type) {
        List<Field> fields = new LinkedList<>();
        for (Class<?> c = type; c != null; c = c.getSuperclass()) {
            fields.addAll(Arrays.asList(c.getDeclaredFields()));
        }
        return fields;
    }
}
