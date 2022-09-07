package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val listStudentItem = arrayListOf<StudentItem>(
//            StudentItem("Dwika", "091092309", R.drawable.ic_launcher_foreground),
//            StudentItem("Hasim", "123081902", R.drawable.ic_launcher_foreground),
//            StudentItem("Abdul", "123498123", R.drawable.ic_launcher_foreground),
//            StudentItem("Made", "238478423", R.drawable.ic_launcher_foreground),
//            StudentItem("Nyoman", "234567045", R.drawable.ic_launcher_foreground),
//            StudentItem("Bagus", "576834509", R.drawable.ic_launcher_foreground),
//            StudentItem("Muhammad", "812039893", R.drawable.ic_launcher_foreground),
//            StudentItem("Iqbal", "485834587", R.drawable.ic_launcher_foreground),
//            StudentItem("Juan", "348561458", R.drawable.ic_launcher_foreground),
//            StudentItem("Maulana", "128334599", R.drawable.ic_launcher_foreground),
//            StudentItem("Gusti", "485834587", R.drawable.ic_launcher_foreground),
//            StudentItem("Suardana", "348561458", R.drawable.ic_launcher_foreground),
//            StudentItem("Iqbal", "128334599", R.drawable.ic_launcher_foreground),
//        )

        val listCity  = arrayListOf<CityItem>(
            CityItem("Bali", "Denpasar", R.drawable.bali_gapura_candi_bentar),
            CityItem("Jambi", "Jambi", R.drawable.jambi_rumah_panggung),
            CityItem("Jawa Barat", "Bandung", R.drawable.jawa_barat_rumah_kasepuhan),
            CityItem("Jawa TImur", "Surabaya", R.drawable.jawa_timur_rumah_joglo),
            CityItem("Jawa Tengah", "Semarang", R.drawable.jawa_tengah_rumah_joglo),
            CityItem("Lampung", "Bandar Lampung", R.drawable.lampung_rumah_nuwo_sesat),
            CityItem("Papua", "Jayapura", R.drawable.papua_rumah_honai),
            CityItem("Riau", "Pekanbaru", R.drawable.riau_rumah_adat_selaso_jatuh),
            CityItem("Sumatera Utara", "Medan", R.drawable.rumah_bolon_sumatera_utara),
            CityItem("Sumatera Barat", "Padang", R.drawable.sumatera_barat_rumah_gadang),


        )

        val adapter = CityAdapter(listCity)
        val layoutManager = GridLayoutManager(this,2, GridLayoutManager.VERTICAL, false )

        rvStudentList.adapter = adapter
        rvStudentList.layoutManager = layoutManager

    }
}