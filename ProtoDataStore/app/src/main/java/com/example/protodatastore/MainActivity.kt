package com.example.protodatastore

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import androidx.lifecycle.ViewModelProvider
import com.example.protodatastore.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userVM: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userVM = ViewModelProvider(this)[UserViewModel::class.java]
        binding.saveBtn.setOnClickListener {
            val name = binding.etName.text.toString()
            val pass = binding.etPass.text.toString()
            userVM.editData(name,pass)
        }

        binding.clearBtn.setOnClickListener {
            userVM.deleteData()
        }

        userVM.dataUser.observe(this){
            Log.d(TAG, "onCreate: ${it.name}")
            Log.d(TAG, "onCreate: ${it.password}")
            binding.resultName.text = it.name
            binding.resultPass.text = it.password
        }
    }
}