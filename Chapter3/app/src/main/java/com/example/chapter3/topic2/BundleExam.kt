package com.example.chapter3.topic2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.databinding.ActivityBundleExamBinding

class BundleExam : AppCompatActivity() {
    lateinit var binding: ActivityBundleExamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundleExamBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnKirim.setOnClickListener {
            val intent = Intent(this, CobaBundle1::class.java)
            val bundle = Bundle()
            bundle.putString("nama_depan", binding.etNamaDepan.text.toString())
            bundle.putString("nama_belakang", binding.etNamaBelakang.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}