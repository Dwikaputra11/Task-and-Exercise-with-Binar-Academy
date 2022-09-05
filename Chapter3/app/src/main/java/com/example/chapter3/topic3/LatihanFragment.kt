package com.example.chapter3.topic3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.databinding.ActivityLatihanFragmentBinding

class LatihanFragment : AppCompatActivity() {

    lateinit var binding: ActivityLatihanFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatihanFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().apply {
            replace(binding.frFragmentContainer.id, FragmentSatu())
            commit()
        }

        binding.btnFragmentSatu.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.frFragmentContainer.id, FragmentSatu())
                commit()
            }
        }
        binding.btnFragmentDua.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.frFragmentContainer.id, FragmentDua())
                commit()
            }
        }
    }
}