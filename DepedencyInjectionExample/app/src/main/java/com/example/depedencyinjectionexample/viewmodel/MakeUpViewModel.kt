package com.example.depedencyinjectionexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.depedencyinjectionexample.api.RestfulApi
import com.example.depedencyinjectionexample.model.MakeUpDataResponseItem
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MakeUpViewModel @Inject constructor(var api: RestfulApi): ViewModel() {

    private val allMakeUpData: MutableLiveData<List<MakeUpDataResponseItem>> = MutableLiveData()

    fun getAllMakeupData(): MutableLiveData<List<MakeUpDataResponseItem>> = allMakeUpData

    fun callMakeupApi(){
        api.getAllMakeUp()
            .enqueue(object : Callback<List<MakeUpDataResponseItem>>{
                override fun onResponse(
                    call: Call<List<MakeUpDataResponseItem>>,
                    response: Response<List<MakeUpDataResponseItem>>
                ) {
                    if(response.isSuccessful){
                        allMakeUpData.postValue(response.body())
                    }else{
                        allMakeUpData.postValue(null)
                    }
                }

                override fun onFailure(call: Call<List<MakeUpDataResponseItem>>, t: Throwable) {
                    allMakeUpData.postValue(null)
                }

            })
    }

}