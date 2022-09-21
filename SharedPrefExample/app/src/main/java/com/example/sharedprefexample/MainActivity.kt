package com.example.sharedprefexample

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sharedprefexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPref: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPref = getSharedPreferences("STUDENT", Context.MODE_PRIVATE)

        binding.btnSave.setOnClickListener {
            saveData()
            Toast.makeText(this@MainActivity, "Data Berhasil Disimpan!", Toast.LENGTH_SHORT).show()
        }
        binding.btnView.setOnClickListener {
            viewData()
        }
        binding.btnClear.setOnClickListener {
            clearData()
        }

    }

    private fun saveData(){
        val getName = binding.etName.text.toString()
        val getNIM = binding.etNIM.text.toString()

        // init the SharedPreferences.edit()
        val addData = sharedPref.edit()
        addData.putString("nim", getNIM)
        addData.putString("name", getName)
        // execute addData to save in local
        addData.apply()
    }

    private fun viewData(){
        val name = sharedPref.getString("name", "")
        val nim = sharedPref.getString("nim", "")

        binding.tvNIM.text = nim
        binding.tvName.text = name
    }

    private fun clearData(){
        val editData = sharedPref.edit()
        editData.clear()
        binding.tvName.text = ""
        binding.tvNIM.text = ""
        editData.apply()
    }

}