package com.example.viewmodelexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnUsingViewModel.setOnClickListener {
            startActivity(Intent(this@MainActivity, UsingViewModel::class.java))
        }
        btnRecyclerUsingViewModel.setOnClickListener {
            startActivity(Intent(this@MainActivity, RecyclerStudent::class.java))
        }
    }
}