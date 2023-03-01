package com.crud.providers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectMapperProvider {

    private static final ObjectMapperProvider INSTANCE = new ObjectMapperProvider();
    private static Gson GSON;
    private static Gson GSON_SNAKE_CASE;

    private ObjectMapperProvider() {}
    public static ObjectMapperProvider getInstance() {
        return INSTANCE;
    }

    public static void init() {
        GSON = new Gson();
        GSON_SNAKE_CASE = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    }
    public Gson getGson() {
        return GSON;
    }

    public Gson getGsonSnakeCase() {
        return GSON_SNAKE_CASE;
    }

}
