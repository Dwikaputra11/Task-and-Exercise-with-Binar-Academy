package com.example.permissionexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.permissionexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNormalPer.setOnClickListener {
            startActivity(Intent(this, NormalPermission::class.java))
        }

        binding.btnDangerousPer.setOnClickListener {
            startActivity(Intent(this, DangerousPermission::class.java))
        }
    }
}