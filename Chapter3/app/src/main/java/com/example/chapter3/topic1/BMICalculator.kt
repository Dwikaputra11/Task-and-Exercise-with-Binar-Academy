package com.example.chapter3.topic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.chapter3.R

class BMICalculator : AppCompatActivity() {
    // TODO: MENGGUNAKAN INTENT DAN BUNDLE
    lateinit var etUmur:EditText
    lateinit var etTinggiBadan: EditText
    lateinit var etBeratBadan: EditText
    lateinit var btnHitung:Button
    lateinit var btnResetBMI: Button
    lateinit var btnNextPage: Button
    private var umur = 0
    private var tinggiBadan = 0.0
    private var beratBadan = 0.0
    private var hasilBmi: Double = 0.0
    private var kategori: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        config()
        val intent = Intent(this, HasilBMI::class.java)
        btnHitung.setOnClickListener {
            calculate()
            setIntentData(intent)
            setBundleData(intent)
            startActivity(intent)
        }
        btnResetBMI.setOnClickListener {
            resetData()
        }
        btnNextPage.setOnClickListener {
            val move = Intent(this, NilaiAkhirMahasiswa::class.java)
            startActivity(move)
        }
    }

    private fun config(){
        etUmur = findViewById(R.id.et_umur)
        etBeratBadan = findViewById(R.id.et_berat_badan)
        etTinggiBadan = findViewById(R.id.et_tinggi_badan)
        btnHitung = findViewById(R.id.btn_hitung_bmi)
        btnResetBMI = findViewById(R.id.btn_reset_bmi)
        btnNextPage = findViewById(R.id.btn_next_page)
    }

    private fun calculate(){
        tinggiBadan = etTinggiBadan.text.toString().toDouble()/100
        beratBadan = etBeratBadan.text.toString().toDouble()
        umur = etUmur.text.toString().toInt()
        hasilBmi = beratBadan/(tinggiBadan*tinggiBadan)
        kategori = (if(hasilBmi < 16){
            "Telalu Kurus"
        }else if(hasilBmi >= 16 && hasilBmi < 17){
            "Cukup Kurus"
        }else if(hasilBmi >= 17 && hasilBmi < 18.5){
            "Sedikit Kurus"
        }else if(hasilBmi >= 18.5 && hasilBmi < 25){
            "Normal"
        }else if(hasilBmi >= 25 && hasilBmi < 30){
            "Gemuk"
        }else if(hasilBmi >= 30 && hasilBmi < 33){
            "Obesitas Kelas I"
        }else if( hasilBmi >= 33 && hasilBmi < 40){
            "Obesitas Kelas II"
        }else{
            "Obesitas Kelas III"
        }).toString()
    }

    private fun setIntentData(intent: Intent){
        intent.putExtra(HasilBMI.UMUR, umur)
        intent.putExtra(HasilBMI.TINGGI,tinggiBadan)
        intent.putExtra(HasilBMI.BERAT_BADAN, beratBadan)
    }

    private fun setBundleData(intent: Intent){
        val bundle = Bundle()
        bundle.putDouble(HasilBMI.BMI, hasilBmi)
        bundle.putString(HasilBMI.KATEGORI, kategori)
        intent.putExtras(bundle)
    }

    private fun resetData(){
        etBeratBadan.text.clear()
        etTinggiBadan.text.clear()
        etUmur.text.clear()
    }

}