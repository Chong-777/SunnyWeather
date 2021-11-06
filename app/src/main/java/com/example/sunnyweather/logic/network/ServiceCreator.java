package com.example.sunnyweather.logic.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceCreator {

    private static final String BASE_URL = "https://api.caiyunapp.com";

    public static ServiceCreator INSTANCE;

    private ServiceCreator(){}

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public <T> T create(Class<T> serviceClass) {
        return retrofit.create(serviceClass);
    }

    public Object create() {
        return this.create(Object.class);
    }

    public static ServiceCreator getUniqueInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ServiceCreator();
        }

        return INSTANCE;
    }

}
