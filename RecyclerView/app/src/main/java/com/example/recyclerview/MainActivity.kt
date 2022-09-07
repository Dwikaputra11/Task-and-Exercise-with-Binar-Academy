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
            CityItem("Jawa Barat", "Bandung", R.drawable.jawa_barat_rumah_kasepuhan),
            CityItem("Jawa TImur", "Surabaya", R.drawable.jawa_timur_rumah_joglo),
            CityItem("Jawa Tengah", "Semarang", R.drawable.jawa_tengah_rumah_joglo),
            CityItem("DI Yogyakarta", "Yogyakarta", R.drawable.di_yogyakarta_rumah_joglo),
            CityItem("DKI Jakarta", "Jakarta", R.drawable.dki_jakarta_rumah_kebaya),
            CityItem("Banten", "Serang", R.drawable.banten_rumah_baduy),
            CityItem("Lampung", "Bandar Lampung", R.drawable.lampung_rumah_nuwo_sesat),
            CityItem("Riau", "Pekanbaru", R.drawable.riau_rumah_adat_selaso_jatuh),
            CityItem("Jambi", "Jambi", R.drawable.jambi_rumah_panggung),
            CityItem("Sumatera Utara", "Medan", R.drawable.rumah_bolon_sumatera_utara),
            CityItem("Sumatera Selatan", "Palembang", R.drawable.sumatera_selatan_rumah_limas),
            CityItem("Sumatera Barat", "Padang", R.drawable.sumatera_barat_rumah_gadang),
            CityItem("Kepulauan Riau", "Tanjung Pinang", R.drawable.kepulauan_riau_rumah_atap_limas_potong),
            CityItem("Bengkulu", "Bengkulu", R.drawable.bengkulu_rumah_bubungan_lima),
            CityItem("Aceh", "Banda Aceh", R.drawable.rumah_krong_bade_aceh),
            CityItem("Bangka Belitung", "Pangkal Pinang", R.drawable.rumah_rakit_bangka_belitung),
            CityItem("Kalimantan Barat", "Potianak", R.drawable.kalimantan_barat_rumah_panjang),
            CityItem("Kalimantan Selatan", "Banjarbaru", R.drawable.kalimantan_selatan_rumah_bubungan_tinggi),
            CityItem("Kalimantan Tengah", "Palangkaraya", R.drawable.kalimantan_tengah_rumah_betang),
            CityItem("Kalimantan Timur", "Samarinda", R.drawable.kalimantan_timur_rumah_lamin),
            CityItem("Kalimantan Utara", "Tanjung Selor", R.drawable.kalimantan_utara_rumah_baloy),
            CityItem("Maluku", "Ambon", R.drawable.maluku_rumah_baileo),
            CityItem("Maluku Utara", "Soffli", R.drawable.maluku_utara_rumah_sasadu),
            CityItem("Nusa Tenggara Barat", "Mataram", R.drawable.nusa_tenggara_barat_rumah_dalam_loka),
            CityItem("Nusa Tenggara Timur", "Kupang", R.drawable.nusa_tenggara_timur_rumah_musalaki),
            CityItem("Papua", "Jayapura", R.drawable.papua_rumah_honai),
            CityItem("Papua Barat", "Manokwari", R.drawable.papua_barat_rumah_mod_aki_aksa),
            CityItem("Papua Selatan", "Merauke", R.drawable.papua_selatan),
            CityItem("Papua Tengah", "Nabire", R.drawable.rumah_adat_papua_tengah_karapao),
            CityItem("Papua Pegunungan", "Jayawijaya", R.drawable.papua_rumah_honai),
            CityItem("Sulawesi Barat", "Mamuju", R.drawable.sulawesi_barat_rumah_boyang),
            CityItem("Gorontalo", "Gorontalo", R.drawable.gorontalo_rumah_dulohupa),
            CityItem("Sulawesi Tengah", "Palu", R.drawable.sulawesi_tengah_rumah_souraja),
            CityItem("Sulawesi Tenggara", "Kendari", R.drawable.sulawesi_tenggara_rumah_buton),
            CityItem("Sulawesi Utara", "Manado", R.drawable.sulawesi_utara_rumah_walewangko),
            CityItem("Sulawesi Selatan", "Makassar", R.drawable.rumah_adat_sulawesi_selatan),
        )

        val adapter = CityAdapter(listCity)
        val layoutManager = GridLayoutManager(this,2, GridLayoutManager.VERTICAL, false )

        rvStudentList.adapter = adapter
        rvStudentList.layoutManager = layoutManager

    }
}