package com.example.retrofitexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitexample.adapter.CarAdapter
import com.example.retrofitexample.databinding.ActivityMainBinding
import com.example.retrofitexample.viewmodel.ViewModelCar


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showDataCar()
        binding.addButton.setOnClickListener {
            startActivity(Intent(this, AddCarActivity::class.java))
        }
    }

    private fun showDataCar(){
        val viewModel = ViewModelProvider(this)[ViewModelCar::class.java]
        viewModel.callApiCar()
        viewModel.getLiveDataCar().observe(this, Observer {
            if(it != null){
                binding.rvCar.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvCar.adapter = CarAdapter(it)
            }
        })
    }
}