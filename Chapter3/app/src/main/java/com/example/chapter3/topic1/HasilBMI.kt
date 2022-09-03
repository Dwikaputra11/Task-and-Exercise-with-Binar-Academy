package com.example.chapter3.topic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.databinding.ActivityHasilBmiBinding

class HasilBMI : AppCompatActivity() {
    companion object{
        const val TINGGI:String = "tinggi"
        const val UMUR: String = "umur"
        const val BERAT_BADAN: String = "berat_badan"
        const val BMI: String = "bmi"
        const val KATEGORI: String = "kategori"
    }

    lateinit var binding: ActivityHasilBmiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBmiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getBundleData()
        getIntentData()
    }

    private fun getIntentData(){
        val intent = intent.extras
        binding.tvUmur.text = "Umur: ${intent?.getInt(UMUR).toString()}"
        binding.tvTinggi.text = "Tinggi Badan: ${intent?.getDouble(TINGGI).toString()}"
        binding.tvBeratBadan.text = "Berat Badan: ${intent?.getDouble(BERAT_BADAN).toString()}"
    }

    private fun getBundleData(){
        val intent = intent.extras
        binding.tvHasilBmi.text = "Hasil BMI: %.2f".format(intent?.getDouble(BMI))
        binding.tvKategori.text = "Kategori: ${intent?.getString(KATEGORI)}"
    }
}