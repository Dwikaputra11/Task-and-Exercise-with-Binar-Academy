package com.example.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.databinding.ActivityMainBinding
import com.example.chapter3.topic1.Topic1
import com.example.chapter3.topic2.Topic2

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTopicDua.setOnClickListener {
            val intent = Intent(this, Topic2::class.java)
            startActivity(intent)
        }
        binding.btnTopicSatu.setOnClickListener {
            val intent = Intent(this, Topic1::class.java)
            startActivity(intent)
        }
    }


}