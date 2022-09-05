package com.example.chapter3.topic3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.bottomnav.GojekActivity
import com.example.chapter3.databinding.ActivityTopic3Binding

class Topic3 : AppCompatActivity() {
    lateinit var binding: ActivityTopic3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopic3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLatihanFragment.setOnClickListener {
            val intent = Intent(this, GojekActivity::class.java)
            startActivity(intent)
        }
    }
}