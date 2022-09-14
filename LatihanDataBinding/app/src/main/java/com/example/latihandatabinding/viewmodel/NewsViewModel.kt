package com.example.latihandatabinding.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.latihandatabinding.R
import com.example.latihandatabinding.data.News

class NewsViewModel:ViewModel() {

    private var newsList = arrayListOf<News>(
        News(id = 1,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", image = R.drawable.berita1, date = "12 Sep 2022", content = " Direktorat Jenderal Imigrasi melakukan pencegahan ke luar negeri terhadap Gubernur Papua Lukas Enembe. Hal itu dilakukan berdasarkan permintaan pencegahan yang diajukan oleh KPK.\n" +
                "    \"Direktorat Pengawasan dan Penindakan Keimigrasian (Ditwasdakim) Ditjen Imigrasi menerima pengajuan pencegahan kepada subjek an. Lukas Enembe dari Komisi Pemberantasan Korupsi (KPK) pada Rabu, 7 September 2022. Pencegahan berlaku selama enam bulan,\" kata Direktur Pengawasan dan Penindakan Keimigrasian, I Nyoman Gede Surya Mataram, seperti dikutip dari situs resmi Imigrasi, Senin (12/9/2022).\n" +
                "    Lukas Enembe resmi dicegah ke luar dari wilayah Indonesia terhitung sejak tanggal diterimanya pengajuan pencegahan sampai 7 Maret 2023. Setelah menerima permintaan pencegahan, Surya mengungkapkan Ditjen Imigrasi langsung memasukkan nama Lukas Enembe ke dalam Sistem Informasi Manajemen Keimigrasian (SIMKIM) yang terhubung ke seluruh Tempat Pemeriksaan Imigrasi di bandara, pelabuhan laut, dan Pos Lintas Batas seluruh Indonesia.\n" +
                "    \"Yang bersangkutan dilarang bepergian ke luar negeri selama masa pencegahan berlaku, \" ujar Surya.\n" +
                "    Sebelumnya, Koordinator tim kuasa hukum Gubernur Papua Lukas Enembe, Stefanus Roy Rening, mengungkapkan kliennya sudah ditetapkan sebagai tersangka oleh KPK terkait kasus dugaan suap dan gratifikasi Rp 1 miliar. Roy mempertanyakan dasar penetapan status tersangka tersebut.\n" +
                "    Roy mengatakan kliennya Lukas Enembe menjadi tersangka di KPK sejak 5 September 2022. Oleh sebab itulah, KPK memanggil Lukas Enembe sebagai tersangka di Mako Brimob Kotaraja, Kota Jayapura, Papua, hari ini, Senin (12/9)."),
        News(id = 2,title = "Bayern Vs Barcelona: Die Roten Gebuk Barca 2-0", editor = "Okdwitya Karina Sari", image = R.drawable.berita2, date = "14 Sep 2022", content = "Bayern Munich meraih kemenangan keduanya di laga fase grup Liga Champions 2022/2023. Menjamu Barcelona, Bayern menang dengan skor akhir 2-0.\n" +
                "Big match antara Bayern vs Barcelona digelar di Allianz Arena pada Rabu (14/9/2022) dinihari WIB. Kemenangan Die Roten ditentukan oleh gol-gol dari Lucas Hernandez dan Leroy Sane di babak kedua.\n" +
                "\n" +
                "Meski menang, Bayern tidak melalui pertandingan dengan mudah. Pasalnya, Bayern menghadapi sejumlah peluang berbahaya tapi Barcelona tidak cukup bagus dalam penyelesaian akhir.\n" +
                "\n" +
                "Berkat kemenangan ini Bayern naik ke posisi teratas Grup C dengan perolehan enam poin usai di laga pembuka mengalahkan Inter Milan 2-0. Barca di urutan kedua dibayangi Inter di bawahnya yang sama-sama mengoleksi tiga poin. Sementara itu Viktoria Plzen di urutan terbawah tanpa poin.\n" +
                "\n" +
                "Manuel Neuer menciptakan penyelamatan gemilang di menit kedelapan. Serangan apik Barcelona di kotak penalti diakhiri Pedri dengan sepakan mendatar, Neuer siap mengahalau dengan kaki kirinya.\n" +
                "\n" +
                "Neuer nyaris membuat kesalahan fatal enam menit kemudian. Operan Neuer kepada Dayot Upamecano direbut Robert Lewandowski, namun Upamecano kemudian mampu menutup pergerakan lawannya sehingga hanya menjadi sepak pojok.\n" +
                "\nBarcelona melewatkan sebauh peluang emas di menit ke-18. Akselerasi Ousmane Dembele diteruskan Gavi dengan umpan silang mendatar kepada Lewandowski yang tinggal menghadapi Neuer. Namun, tendangan first-time Lewandowski melambung.\n" +
                "\n" +
                "Tekanan lain dari Barcelona. Crossing Marcos Alonso kepada Lewandowski digagalkan Neuer. Bola dikuasai Raphinha kemudian menusuk dari sisi kanan tapi tembakannya ke tiang jauh melenceng. Tidak lama berselang, Raphinha kembali mengancam Bayer meski sepakan mendatarnya lagi-lagi melebar.\n" +
                "\n" +
                "Bayern akhirnya keluar dari tekanan Barcelona. Di menit ke-27, sodoran Jamal Musiala menemui Noussair Mazraoui namun sepakannya masih terlalu lemah untuk menguji Marc-Andre ter Stegen.\n" +
                "\n" +
                "Sebuah peluang lain diciptakan Bayern tiga menit berselang. Aksi Leroy Sane dari sayap kanan diakhiri Marcel Sabitzer dengan tembakan dari luar kotak penalti. Bola melenceng dari tiang gawang Barcelona.\n" +
                "\n" +
                "Di menit ke-40, Musiala mengalahkan penjagaan Alonso di byline lalu mengirim crossing. Sayang sekali, Mane dan Thomas Mueller justru sama-sama menyambut bola sehingga bola keluar untuk menjadi tendangan gawang.\n" +
                "\n" +
                "Barcelona mengklaim penalti setelah Pedri jatuh ketika berduel dengan Davies. Namun, wasit memutuskan meneruskan permainan. Skor 0-0 menandai akhir babak pertama.\n" +
                "\n"),
        News(id = 3,title = "Kapolda Sumut Ungkap Kendala Kasus Siswi Diperkosa Kepsek di Medan", editor = "Datuk Haris Molana", image = R.drawable.berita3, date = "13 Sep 2022", content = "Kapolda Sumut Irjen Panca Putra membeberkan kendala kasus siswi SD di Medan diduga diperkosa oleh kepala sekolah (kepsek) dan tukang sapu. Panca menyebut kendala itu didapati saat penyidik memeriksa korban.\n" +
                "\"Masih diproses,\" kata Panca kepada wartawan di Taman Makam Pahlawan Medan, Selasa (13/9/2022).\n" +
                "\n" +
                "Panca awalnya menceritakan sejarah kelam siswi SD tersebut. Menurut keterangan yang diterima dirinya, siswi itu merupakan korban pemerkosaan oleh ayahnya.\n" +
                "\"Itu memang dulu kan sejarahnya dia pernah menjadi korban orang tua, bapaknya, tetapi itu sudah diproses oleh kita dan sudah divonis. Sekarang sedang berjalan dalam Kasasi. Kemudian ternyata saya dengar lagi bahwa sebelumnya pernah melapor dengan hal yang sama,\" sebut Panca.\n" +
                "\n" +
                "Panca mengaku pihaknya sangat berhati-hati memproses kasus tersebut. Pihak kepolisian bakal bekerja profesional.\n" +
                "\n" +
                "\"Tetapi begini, kita bekerja dengan profesional hati-hati. Tidak boleh kita langsung menyimpulkan bahwa ini benar atau tidak benar,\" ujar Panca."),
    )

    var newsListLiveData: MutableLiveData<List<News>> = MutableLiveData()

    fun setLiveData(){
        val list = newsList
        newsListLiveData.value = list
    }

}