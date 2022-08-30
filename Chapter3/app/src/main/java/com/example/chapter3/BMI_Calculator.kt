package com.example.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class BMI_Calculator : AppCompatActivity() {
    lateinit var etUmur:EditText
    lateinit var etTinggiBadan: EditText
    lateinit var etBeratBadan: EditText
    lateinit var btnHitung:Button
    lateinit var btnResetBMI: Button
    lateinit var llHasil: LinearLayout
    lateinit var tvUmur: TextView
    lateinit var tvTinggi: TextView
    lateinit var tvBeratBadan: TextView
    lateinit var tvHasilBmi: TextView
    lateinit var tvKategori: TextView
    lateinit var btnNextPage: Button

    private var hasilBmi: Double = 0.0
    var kategori: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        config()
        btnHitung.setOnClickListener {
            calculate()
        }
        btnResetBMI.setOnClickListener {
            resetData()
        }
        btnNextPage.setOnClickListener {
            var intent = Intent(this, NilaiAkhirMahasiswa::class.java)
            startActivity(intent)
        }
    }

    fun config(){
        etUmur = findViewById(R.id.et_nama)
        etBeratBadan = findViewById(R.id.et_tugas)
        etTinggiBadan = findViewById(R.id.et_nim)
        btnHitung = findViewById(R.id.btn_hitung)
        btnResetBMI = findViewById(R.id.btn_reset_nilai)
        llHasil = findViewById(R.id.ll_hasil)
        tvUmur = findViewById(R.id.tv_umur)
        tvTinggi = findViewById(R.id.tv_tinggi)
        tvBeratBadan = findViewById(R.id.tv_berat_badan)
        tvHasilBmi = findViewById(R.id.tv_hasil_bmi)
        tvKategori = findViewById(R.id.tv_kategori)
        btnNextPage = findViewById(R.id.btn_next_page)
    }

    fun calculate(){
        var tinggiBadan:Double = etTinggiBadan.text.toString().toDouble()/100
        var beratBadan:Double = etBeratBadan.text.toString().toDouble()
        var umur:Int = etUmur.text.toString().toInt()
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
        setHasil()
    }

    fun setHasil(){
        llHasil.visibility = View.VISIBLE
        tvUmur.text = "Umur Anda: ${etUmur.text} tahun"
        tvTinggi.text = "Tinggi Badan: ${etTinggiBadan.text} cm"
        tvBeratBadan.text = "Berat Badan: ${etBeratBadan.text} kg"
        tvHasilBmi.text = "Hasil BMI Anda: %.2f".format(hasilBmi)
        tvKategori.text = "Kategori $kategori"
    }

    fun resetData(){
        llHasil.visibility = View.GONE
        tvUmur.text = "Umur: "
        tvTinggi.text = "Tinggi Badan: "
        tvBeratBadan.text = "Berat Badan: "
        tvHasilBmi.text = "Hasil BMI Anda: "
        tvKategori.text = "Kategori "
        etBeratBadan.text.clear()
        etTinggiBadan.text.clear()
        etUmur.text.clear()
    }

}