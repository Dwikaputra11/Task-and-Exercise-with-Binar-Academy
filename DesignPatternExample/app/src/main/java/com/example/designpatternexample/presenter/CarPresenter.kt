package com.example.designpatternexample.presenter

import androidx.lifecycle.MutableLiveData
import com.example.designpatternexample.api.ApiClient
import com.example.designpatternexample.model.CarResponseItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarPresenter(private val views: NewsView) {

    val allCar: MutableLiveData<List<CarResponseItem>> = MutableLiveData()

    fun getAllCar(){
        ApiClient.instace.getAllCar()
            .enqueue(object : Callback<List<CarResponseItem>>{
                override fun onResponse(
                    call: Call<List<CarResponseItem>>,
                    response: Response<List<CarResponseItem>>
                ) {
                    if(response.isSuccessful){
                        views.onSuccess("Sukses", response.body()!!)
                        allCar.postValue(response.body())
                    }
                }

                override fun onFailure(call: Call<List<CarResponseItem>>, t: Throwable) {
                    views.onError("Error")
                }

            })
    }



}