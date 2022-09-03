package com.example.chapter3.topic1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.chapter3.data.MahasiswaParcel
import com.example.chapter3.data.MahasiswaSerial
import com.example.chapter3.databinding.ActivityHasilNilaiBinding

class HasilNilai : AppCompatActivity() {
    companion object{
        const val DATA_PARCEL: String = "data_parcel"
        const val DATA_SERIAL:String = "data_serial"
    }
    lateinit var binding: ActivityHasilNilaiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilNilaiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getParcelData()
        getSerialData()
    }

    fun getParcelData(){
        val parcelData = intent.getParcelableExtra<MahasiswaParcel>(DATA_PARCEL) as MahasiswaParcel
        binding.tvNama.text = "Nama Mahasiswa: ${parcelData.nama}"
        binding.tvNim.text = "NIM: ${parcelData.nim}"
        binding.tvUas.text = "UAS: ${parcelData.uas}"
        binding.tvUts.text = "UTS: ${parcelData.uts}"
        binding.tvTugas.text = "Tugas: ${parcelData.tugas}"
    }
    fun getSerialData(){
        val serialData = intent.getSerializableExtra(DATA_SERIAL) as MahasiswaSerial
        binding.tvTotalNilai.text = "Total Nilai: ${serialData.total}"
        binding.tvMean.text = "Rata-rata Nilai: ${serialData.rataRata}"
        binding.tvNilaiHuruf.text = "Nilai Huruf: ${serialData.nilaiHuruf}"
        binding.tvStatus.text = "Status: ${serialData.status}"
    }
}