package com.example.retrofitexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitexample.databinding.ActivityAddCarBinding
import com.example.retrofitexample.viewmodel.ViewModelCar

class AddCarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddCarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddCarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            addCar()
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun addCar(){
        var name = binding.etName.text.toString()
        var category = binding.etCategory.text.toString()
        var price = binding.etPrice.text.toString().toInt()
        var status = binding.etStatus.text.toString().toBoolean()
        var image = binding.etImage.text.toString()
        var viewModelCar = ViewModelProvider(this)[ViewModelCar::class.java]
        viewModelCar.callPostCar(name = name, category = category, price = price, status = status, image = image)
        viewModelCar.postLiveDataCar().observe(this, Observer {
            if(it != null){
                Toast.makeText(this, "Add car successfully", Toast.LENGTH_SHORT).show()
            }
        })
    }
}