package com.example.mvvmexample.api

import com.example.mvvmexample.model.CarResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiResponse {

    @GET("admin/car")
    fun getAllCar(): Call<List<CarResponseItem>>

}