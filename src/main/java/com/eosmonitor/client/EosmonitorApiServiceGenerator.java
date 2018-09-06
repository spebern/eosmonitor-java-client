package com.eosmonitor.client;

import com.google.gson.*;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EosmonitorApiServiceGenerator {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDateTime.class, new JsonDeserializer<LocalDateTime>() {
                @Override
                public LocalDateTime deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    return LocalDateTime.parse(json.getAsJsonPrimitive().getAsString(), formatter);
                }
            })
            .create();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .client((httpClient.build()))
                    .addConverterFactory(GsonConverterFactory.create(gson));

    private static Retrofit retrofit;

    public static <S> S createService(Class<S> serviceClass, String baseUrl) {
        builder.baseUrl(baseUrl);
        retrofit = builder.build();
        return retrofit.create(serviceClass);
    }

    public static EosmonitorApiService createService(String baseUrl) {
        builder.baseUrl(baseUrl);
        retrofit = builder.build();
        return retrofit.create(EosmonitorApiService.class);
    }
}
