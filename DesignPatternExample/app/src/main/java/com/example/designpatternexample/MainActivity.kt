package com.example.designpatternexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.designpatternexample.databinding.ActivityMainBinding
import com.example.designpatternexample.model.CarResponseItem
import com.example.designpatternexample.presenter.CarAdapter
import com.example.designpatternexample.presenter.CarPresenter
import com.example.designpatternexample.presenter.NewsView
import java.util.function.IntBinaryOperator

class MainActivity : AppCompatActivity(), NewsView {
    private lateinit var carPresenter: CarPresenter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        carPresenter  = CarPresenter(this)
        carPresenter.getAllCar()
    }

    override fun onSuccess(pesan: String, list: List<CarResponseItem>) {
        binding.rvCar.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = CarAdapter()
        carPresenter.allCar.observe(this){
            if(it != null) adapter.setCarList(it)
        }
        binding.rvCar.adapter = adapter
    }

    override fun onError(pesan: String) {

    }
}