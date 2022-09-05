package com.example.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.databinding.ActivityMainBinding
import com.example.chapter3.topic1.Topic1
import com.example.chapter3.topic2.Topic2
import com.example.chapter3.topic3.Topic3
import com.example.chapter3.topic4.NavigationActivity
import com.example.chapter3.topic4.latihan.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*

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
        binding.btnTopicTiga.setOnClickListener {
            val intent = Intent(this, Topic3::class.java)
            startActivity(intent)
        }
        btnTopic4.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }


}