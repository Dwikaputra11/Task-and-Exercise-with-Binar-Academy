package com.example.depedencyinjectionexample.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitClient {
    private const val BASE_URL = "http://makeup-api.herokuapp.com/api/v1/"

    private val interceptor: HttpLoggingInterceptor
    get(){
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        return httpLoggingInterceptor.apply {
            httpLoggingInterceptor.level  = HttpLoggingInterceptor.Level.BODY
        }
    }

    private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

    @Singleton
    @Provides
    fun providesNewsApi(retrofit: Retrofit): RestfulApi =
        retrofit.create(RestfulApi::class.java)
}