package com.example.chapter3.topic2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.example.chapter3.databinding.ActivityIntentExamBinding

class IntentExam() : AppCompatActivity() {
    lateinit var binding: ActivityIntentExamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentExamBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCamera.setOnClickListener {
            val move = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(move)
        }
    }
}