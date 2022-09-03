package com.example.chapter3.topic2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.R
import com.example.chapter3.databinding.ActivityCobaBundle1Binding

class CobaBundle1 : AppCompatActivity() {
    lateinit var binding: ActivityCobaBundle1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCobaBundle1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val bun = intent.extras
        binding.tvNamaDepan.text = bun?.getString("nama_depan")
        binding.tvNamaBelakang.text = bun?.getString("nama_belakang")
    }
}