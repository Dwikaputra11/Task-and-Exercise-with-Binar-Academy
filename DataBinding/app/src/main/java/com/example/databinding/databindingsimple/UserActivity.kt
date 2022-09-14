package com.example.databinding.databindingsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.R
import com.example.databinding.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)


//        binding.tvFirstName.text = "Dwika"
//        binding.tvLastName.text = "Putra"

        // use data in xml
        binding.userdata = User(firstName = "Dwika", lastName = "Putra")
    }
}