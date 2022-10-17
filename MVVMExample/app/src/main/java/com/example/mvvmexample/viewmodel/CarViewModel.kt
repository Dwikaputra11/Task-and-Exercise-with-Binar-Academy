package com.example.mvvmexample.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.mvvmexample.api.ApiClient
import com.example.mvvmexample.model.CarResponseItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private const val TAG = "CarViewModel"

class CarViewModel(application: Application): AndroidViewModel(application) {
    val allCar: MutableLiveData<List<CarResponseItem>> = MutableLiveData()

    fun getAllCar(){
        ApiClient.instace.getAllCar()
            .enqueue(object : Callback<List<CarResponseItem>> {
                override fun onResponse(
                    call: Call<List<CarResponseItem>>,
                    response: Response<List<CarResponseItem>>
                ) {
                    if(response.isSuccessful){
                        allCar.postValue(response.body())
                    }
                }

                override fun onFailure(call: Call<List<CarResponseItem>>, t: Throwable) {
                    Log.d(TAG, "onFailure: Error")
                }

            })
    }

}