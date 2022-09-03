package com.example.chapter3.topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.data.PersonParcelable
import com.example.chapter3.data.PersonSerializable
import com.example.chapter3.databinding.ActivitySerialParcelBinding

class SerialParcel : AppCompatActivity() {
    lateinit var binding: ActivitySerialParcelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySerialParcelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val id = intent.extras?.get("id")
        if(id == "parcel"){
            getParcelableData()
        }else{
            getSerializableData()
        }
    }

    private fun getParcelableData(){
        var dataPerson = intent.getParcelableExtra<PersonParcelable>("data_person") as PersonParcelable
        binding.tvNamaParcel.text = dataPerson.name
        binding.tvAgeParcel.text = dataPerson.age.toString()
        binding.tvCityParcel.text = dataPerson.city
    }

    private fun getSerializableData(){
        var dataPerson = intent.getSerializableExtra("data_person") as PersonSerializable
        binding.tvNamaParcel.text = dataPerson.name
        binding.tvAgeParcel.text = dataPerson.age.toString()
        binding.tvCityParcel.text = dataPerson.city
    }
}