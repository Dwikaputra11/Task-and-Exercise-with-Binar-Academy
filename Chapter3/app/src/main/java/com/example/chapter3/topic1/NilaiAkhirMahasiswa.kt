package com.example.chapter3.topic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.View
import com.example.chapter3.data.MahasiswaParcel
import com.example.chapter3.data.MahasiswaSerial
import com.example.chapter3.databinding.ActivityNilaiAkhirMahasiswaBinding
import com.google.android.material.snackbar.Snackbar

class NilaiAkhirMahasiswa : AppCompatActivity() {

    private lateinit var binding: ActivityNilaiAkhirMahasiswaBinding
    private var nama: String = ""
    private var nim: String = ""
    private var total = 0
    private var mean = 0
    private var nilaiHuruf = ""
    private var status = ""
    private var nilaiUas = 0
    private var nilaiUts = 0
    private var nilaiTugas = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNilaiAkhirMahasiswaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = Intent(this, HasilNilai::class.java)
        binding.btnHitungNilai.setOnClickListener {
            if(isValid()){
                nilaiUas = binding.etUas.text.toString().toInt()
                nilaiTugas = binding.etTugas.text.toString().toInt()
                nilaiUts = binding.etUts.text.toString().toInt()
                nama = binding.etNama.text.toString()
                nim = binding.etNim.text.toString()
                hitung()
                setParcelData(intent)
                setSerialData(intent)
                startActivity(intent)
            }else{
                Snackbar.make(binding.root,"Input Tidak Valid",Snackbar.LENGTH_SHORT).show()
            }
        }
        binding.btnResetNilai.setOnClickListener {
            resetData()
        }
    }

    fun isValid(): Boolean{
        if(
            binding.etNama.text.toString().isNotEmpty() &&
            binding.etNim.text.toString().isNotEmpty() &&
            binding.etTugas.text.toString().isNotEmpty() &&
            binding.etUts.text.toString().isNotEmpty() &&
            binding.etUas.text.toString().isNotEmpty() &&
            binding.etTugas.text.toString().toInt() in 1..100 &&
            binding.etUts.text.toString().toInt() in 1..100 &&
            binding.etUas.text.toString().toInt() in 1..100
        ) return true

        return false
    }

    fun hitung(){
        Log.d("hitung()", "hitung: Called")
        total = nilaiUas + nilaiUts + nilaiTugas
        mean = total/3
        nilaiHuruf = when(mean){
            in 0..60 -> "E"
            in 61..70 -> "D"
            in 71..80 -> "C"
            in 81..90 -> "B"
            in 91..100 -> "A"
            else -> "Tidak Valid"
        }.toString()
        status = (if(nilaiHuruf.equals("E") || nilaiHuruf.equals("D")){
            "Tidak Lulus"
        }else{
            "Lulus"
        }).toString()
    }

    fun setParcelData(intent: Intent){
        val dataMahasiswa = MahasiswaParcel(nama = nama, nim = nim, uas = nilaiUas, uts = nilaiUts, tugas = nilaiTugas)
        intent.putExtra(HasilNilai.DATA_PARCEL, dataMahasiswa)
    }

    fun setSerialData(intent: Intent){
        val dataMahasiswa = MahasiswaSerial(total = total, nilaiHuruf = nilaiHuruf, rataRata = mean, status = status)
        intent.putExtra(HasilNilai.DATA_SERIAL,dataMahasiswa)
    }

    fun resetData(){
        binding.etUts.text.clear()
        binding.etNama.text.clear()
        binding.etUas.text.clear()
        binding.etNim.text.clear()
        binding.etTugas.text.clear()
    }
}