package com.example.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitexample.adapter.CarAdapter
import com.example.retrofitexample.databinding.ActivityCarBinding
import com.example.retrofitexample.model.ResponseDataCarItem
import com.example.retrofitexample.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showDataCar()
    }
    fun showDataCar(){
        RetrofitClient.instance.getAllCar()
            .enqueue(object : Callback<List<ResponseDataCarItem>>{
                override fun onResponse(
                    call: Call<List<ResponseDataCarItem>>,
                    response: Response<List<ResponseDataCarItem>>
                ) {
                    if(response.isSuccessful){
                        binding.rvCar.layoutManager = LinearLayoutManager(this@CarActivity, LinearLayoutManager.VERTICAL, false)
                        binding.rvCar.adapter = response.body()?.let { CarAdapter(it) }
                    }else{
                        Toast.makeText(this@CarActivity, "Data Failed", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<List<ResponseDataCarItem>>, t: Throwable) {
                    Toast.makeText(this@CarActivity, "Something Wrong", Toast.LENGTH_SHORT).show()
                }


            })
    }
}