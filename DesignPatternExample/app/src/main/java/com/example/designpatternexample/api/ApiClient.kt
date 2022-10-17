package com.example.designpatternexample.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiClient {

    private const val BASE_URL = "https://rent-cars-api.herokuapp.com/"
    val interceptor = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }
    val instace: ApiResponse by lazy {
        val client = OkHttpClient.Builder().apply {
            this.addInterceptor(interceptor)
                .connectTimeout(30, TimeUnit.SECONDS)
        }.build()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiResponse::class.java)
    }
}