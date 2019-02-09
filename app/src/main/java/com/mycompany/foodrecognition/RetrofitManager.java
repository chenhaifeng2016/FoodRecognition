package com.mycompany.foodrecognition;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.fastjson.FastJsonConverterFactory;

public class RetrofitManager {

    private static FoodRecognizeService foodRecognizeService;



    public static FoodRecognizeService getInstance() {
        if (foodRecognizeService == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                        @Override
                        public void log(String message) {
                            Log.d("TAG", message);
                        }
                    }).setLevel(HttpLoggingInterceptor.Level.BASIC))
                    .build();

            foodRecognizeService = new Retrofit.Builder()
                    .baseUrl("https://aip.baidubce.com")
                 //   .addConverterFactory(JacksonConverterFactory.create())
                    .addConverterFactory(FastJsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(okHttpClient)
                    .build()
                    .create(FoodRecognizeService.class);
        }

        return foodRecognizeService;
    }
}
