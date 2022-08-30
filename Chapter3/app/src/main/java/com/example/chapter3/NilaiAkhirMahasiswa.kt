package com.example.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.chapter3.databinding.ActivityNilaiAkhirMahasiswaBinding
import com.google.android.material.snackbar.Snackbar

class NilaiAkhirMahasiswa : AppCompatActivity() {

    private lateinit var binding: ActivityNilaiAkhirMahasiswaBinding
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

        binding.btnHitung.setOnClickListener {
            if(isValid()){
                nilaiUas = binding.etUas.text.toString().toInt()
                nilaiTugas = binding.etTugas.text.toString().toInt()
                nilaiUts = binding.etUts.text.toString().toInt()
                hitung()
                lihatHasil()
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

    fun lihatHasil(){
        binding.llHasil.visibility = View.VISIBLE
        binding.tvNama.text = "Nama Mahasiswa: ${binding.etNama.text.toString()}"
        binding.tvNim.text = "NIM: ${binding.etNim.text.toString()}"
        binding.tvUas.text = "UAS: ${binding.etUas.text.toString()}"
        binding.tvUts.text = "UTS: ${binding.etUts.text.toString()}"
        binding.tvTugas.text = "Tugas: ${binding.etTugas.text.toString()}"
        binding.tvTotalNilai.text = "Total Nilai: $total"
        binding.tvMean.text = "Rata-rata Nilai: $mean"
        binding.tvNilaiHuruf.text = "Nilai Huruf: $nilaiHuruf"
        binding.tvStatus.text = "Status: $status"
    }

    fun resetData(){
        binding.llHasil.visibility = View.GONE
        binding.tvNama.text = "Nama Mahasiswa: "
        binding.tvNim.text = "NIM: "
        binding.tvUas.text = "UAS: "
        binding.tvUts.text = "UTS: "
        binding.tvTugas.text = "Tugas: "
        binding.tvTotalNilai.text = "Total Nilai: "
        binding.tvMean.text = "Rata-rata Nilai: "
        binding.tvNilaiHuruf.text = "Nilai Huruf: "
        binding.tvStatus.text = "Status: "
        binding.etUts.text.clear()
        binding.etNama.text.clear()
        binding.etUas.text.clear()
        binding.etNim.text.clear()
        binding.etTugas.text.clear()
    }
}