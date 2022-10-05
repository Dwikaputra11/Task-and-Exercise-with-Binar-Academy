package com.example.retrofitexample.viewmodel

import android.media.Image
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.retrofitexample.Car
import com.example.retrofitexample.model.PostResponseCar
import com.example.retrofitexample.model.ResponseDataCarItem
import com.example.retrofitexample.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ViewModelCar: ViewModel() {
    private var liveDataCar: MutableLiveData<List<ResponseDataCarItem>> = MutableLiveData()
    private var postDataCar: MutableLiveData<PostResponseCar> = MutableLiveData()
    private var putDataCar: MutableLiveData<ResponseDataCarItem> = MutableLiveData()

    fun postLiveDataCar(): MutableLiveData<PostResponseCar>{
        return postDataCar
    }

    fun putLiveDataCar(): MutableLiveData<ResponseDataCarItem> = putDataCar

    fun callUpdateApiCar(id: Int, name:String, category: String, price:Int, status:Boolean, image: String){
        RetrofitClient.instance.updateCar(id, Car(name, category, status, price, image))
            .enqueue(object :Callback<ResponseDataCarItem>{
                override fun onResponse(
                    call: Call<ResponseDataCarItem>,
                    response: Response<ResponseDataCarItem>
                ) {
                    if(response.isSuccessful){
                        putDataCar.postValue(response.body())
                        Log.d("TAG", "onResponse: Add car success")
                    }else{
                        putDataCar.postValue(null)
                        Log.d("TAG", "onResponse: Add car failed")
                    }
                }

                override fun onFailure(call: Call<ResponseDataCarItem>, t: Throwable) {
                    putDataCar.postValue(null)
                    Log.d("TAG", "onFailure: Something wrong")
                }

            })
    }

    fun callPostCar(name:String, category: String, price:Int, status:Boolean, image: String){
        RetrofitClient.instance.postCar(Car(name, category, status, price, image))
            .enqueue(object : Callback<PostResponseCar>{
                override fun onResponse(
                    call: Call<PostResponseCar>,
                    response: Response<PostResponseCar>
                ) {
                    if (response.isSuccessful){
                        postDataCar.postValue(response.body())
                        Log.d("TAG", "onResponse: Add car success")
                    }else{
                        Log.d("TAG", "onResponse: Add car failed")
//                        Toast.makeText(this@ViewModelCar, "Add car failed", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<PostResponseCar>, t: Throwable) {
                    Log.d("TAG", "onFailure: Something wrong")
                }

            })
    }

    @JvmName("getLiveDataCar1")
    fun getLiveDataCar():MutableLiveData<List<ResponseDataCarItem>>{
        return liveDataCar
    }

    fun callApiCar(){
        RetrofitClient.instance.getAllCar()
            .enqueue(object : Callback<List<ResponseDataCarItem>>{
                override fun onResponse(
                    call: Call<List<ResponseDataCarItem>>,
                    response: Response<List<ResponseDataCarItem>>
                ) {
                    if(response.isSuccessful){
                        liveDataCar.postValue(response.body())
                    }else{
                        liveDataCar.postValue(null)
                    }
                }

                override fun onFailure(call: Call<List<ResponseDataCarItem>>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
    }
}