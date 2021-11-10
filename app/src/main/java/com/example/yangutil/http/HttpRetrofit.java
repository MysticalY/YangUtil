package com.example.yangutil.http;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Date:2021/11/10
 * Time:19:48
 * author:yanghaoyang
 */
public class HttpRetrofit {
    private static volatile HttpRetrofit httpRetrofit = null;

    public static HttpRetrofit getInstance() {
        if (httpRetrofit == null) {
            synchronized (HttpRetrofit.class) {
                if (httpRetrofit == null) {
                    httpRetrofit = new HttpRetrofit();
                }
            }
        }
        return httpRetrofit;
    }

    private Retrofit retrofit;

    public Retrofit getRetrofit(String uri) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .client(new OkHttpClient.Builder()
                            .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                            .readTimeout(2, TimeUnit.MINUTES)
                            .writeTimeout(2, TimeUnit.MINUTES)
                            .build())
                    .baseUrl(uri)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
