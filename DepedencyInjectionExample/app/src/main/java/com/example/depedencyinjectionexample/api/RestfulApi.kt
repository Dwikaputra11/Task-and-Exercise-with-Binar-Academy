package com.example.depedencyinjectionexample.api

import com.example.depedencyinjectionexample.model.MakeUpDataResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface RestfulApi {
    @GET("products.json")
    fun getAllMakeUp(): Call<List<MakeUpDataResponseItem>>
}