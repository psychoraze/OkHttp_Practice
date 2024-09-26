package com.example.okhttp_practice.KoinModule;

import org.koin.core.module.Module;

import java.util.function.Function;

import kotlin.jvm.functions.Function0;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class KoinModule {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

            private Retrofit retrofit;
    public Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
