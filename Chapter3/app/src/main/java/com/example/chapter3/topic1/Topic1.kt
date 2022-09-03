package com.example.chapter3.topic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.databinding.ActivityTopic1Binding

class Topic1 : AppCompatActivity() {
    lateinit var binding: ActivityTopic1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopic1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var intent: Intent
        binding.btnCalculator.setOnClickListener {
            intent = Intent(this, Calculator::class.java)
            startActivity(intent)
        }
        binding.btnBmiCalculator.setOnClickListener {
            intent = Intent(this, BMICalculator::class.java)
            startActivity(intent)
        }
        binding.btnFinalGrade.setOnClickListener {
            intent = Intent(this, NilaiAkhirMahasiswa::class.java)
            startActivity(intent)
        }


    }


}