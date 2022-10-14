package com.example.datastoreexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.asLiveData
import com.example.datastoreexample.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userPrefs: UserPrefs
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userPrefs = UserPrefs(this)

//        binding.resultName.text = userPrefs.userName.toString()
//        binding.resultAge.text = userPrefs.userAge.toString()

        binding.btnSave.setOnClickListener {
            val name = binding.tvName.text.toString()
            val age =  binding.tvAge.text.toString().toInt()

            GlobalScope.launch {
                userPrefs.saveData(name,age)
            }

            Log.d(TAG, "onCreate: Age ${userPrefs.userAge}")
            Log.d(TAG, "onCreate: Name ${userPrefs.userName}")
        }

        userPrefs.userName.asLiveData().observe(this) {
            binding.resultName.text = it
        }
        userPrefs.userAge.asLiveData().observe(this){
            binding.resultAge.text = it.toString()
        }

        binding.btnClear.setOnClickListener {
            GlobalScope.launch {
                userPrefs.deleteData()
            }
        }



    }
}