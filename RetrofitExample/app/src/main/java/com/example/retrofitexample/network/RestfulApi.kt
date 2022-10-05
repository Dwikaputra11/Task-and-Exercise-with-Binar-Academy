package com.example.retrofitexample.network

import com.example.retrofitexample.Car
import com.example.retrofitexample.model.PostResponseCar
import com.example.retrofitexample.model.ResponseDataCarItem
import retrofit2.Call
import retrofit2.http.*

interface RestfulApi {

    @GET("admin/car")
    fun getAllCar() : Call<List<ResponseDataCarItem>>

    @POST("admin/car")
    fun postCar(@Body carItem: Car): Call<PostResponseCar>

    @PUT("admin/car/{id}")
    fun updateCar(@Path("id") id : Int, @Body request: Car): Call<ResponseDataCarItem>
}