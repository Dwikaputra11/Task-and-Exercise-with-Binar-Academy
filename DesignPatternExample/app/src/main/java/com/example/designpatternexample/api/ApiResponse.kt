package com.example.designpatternexample.api

import com.example.designpatternexample.model.CarResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiResponse {

    @GET("admin/car")
    fun getAllCar(): Call<List<CarResponseItem>>

}