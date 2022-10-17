package com.example.mvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmexample.adapter.CarAdapter
import com.example.mvvmexample.databinding.ActivityMainBinding
import com.example.mvvmexample.viewmodel.CarViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var carVM: CarViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvCar.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        carVM = ViewModelProvider(this)[CarViewModel::class.java]

        carVM.getAllCar()
        carVM.allCar.observe(this){
            if(it != null){
                val adapter = CarAdapter()
                adapter.setCarList(it)
                binding.rvCar.adapter = adapter
            }
        }

    }
}