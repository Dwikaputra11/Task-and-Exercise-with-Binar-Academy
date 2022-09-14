package com.example.newsapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.data.News

class NewsViewModel: ViewModel() {
    var newsList = arrayListOf<News>(
        News(id = 1,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 2,title = "Bayern Vs Barcelona: Die Roten Gebuk Barca 2-0", editor = "Okdwitya Karina Sari", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2022/09/14/bayern-vs-barcelona_169.jpeg?w=700&q=90", date = "14 Sep 2022", content = "Bayern Munich meraih kemenangan keduanya di laga fase grup Liga Champions 2022/2023. Menjamu Barcelona, Bayern menang dengan skor akhir 2-0.\n" +
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
        News(id = 3,title = "Kapolda Sumut Ungkap Kendala Kasus Siswi Diperkosa Kepsek di Medan", editor = "Datuk Haris Molana", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "13 Sep 2022", content = "Kapolda Sumut Irjen Panca Putra membeberkan kendala kasus siswi SD di Medan diduga diperkosa oleh kepala sekolah (kepsek) dan tukang sapu. Panca menyebut kendala itu didapati saat penyidik memeriksa korban.\n" +
                "\"Masih diproses,\" kata Panca kepada wartawan di Taman Makam Pahlawan Medan, Selasa (13/9/2022).\n" +
                "\n" +
                "Panca awalnya menceritakan sejarah kelam siswi SD tersebut. Menurut keterangan yang diterima dirinya, siswi itu merupakan korban pemerkosaan oleh ayahnya.\n" +
                "\"Itu memang dulu kan sejarahnya dia pernah menjadi korban orang tua, bapaknya, tetapi itu sudah diproses oleh kita dan sudah divonis. Sekarang sedang berjalan dalam Kasasi. Kemudian ternyata saya dengar lagi bahwa sebelumnya pernah melapor dengan hal yang sama,\" sebut Panca.\n" +
                "\n" +
                "Panca mengaku pihaknya sangat berhati-hati memproses kasus tersebut. Pihak kepolisian bakal bekerja profesional.\n" +
                "\n" +
                "\"Tetapi begini, kita bekerja dengan profesional hati-hati. Tidak boleh kita langsung menyimpulkan bahwa ini benar atau tidak benar,\" ujar Panca."),
        News(id = 4,title = "PLN Buka Suara soal Wacana Penghapusan Daya Listrik 450 VA", editor = "Yohana Artha Uly", imgUrl = "https://asset.kompas.com/crops/QZL7DGHOMeUM6jg6MGbJoFL0Fsw=/42x28:1000x667/750x500/data/photo/2022/07/03/62c0f8d806198.jpg", date = "13 Sep 2022", content = ""),
        News(id = 5,title = "Pelajar SMA Ikut Demo Tolak Kenaikan Harga BBM: Orang Tua Saya Jadi Korban", editor = "Muhsin Sabilillah", imgUrl = "https://statik.tempo.co/data/2022/09/12/id_1140283/1140283_720.jpg", date = "13 Sep 2022", content = "Seorang siswa SMA ikut demo menolak kenaikan harga BBM yang diumumkan Jokowi pada 3 September lalu.\n" +
                "\n" +
                "Alfiana Dewansyah misalnya, siswa SMA itu ikut dalam demonstrasi menolak kenaikan harga BBM bersama massa Gerakan Nasional Pembela Rakyat di GNPR yang digelar di Patung Kuda, Senin, 12 September 2022. Ia datang bersama teman-teman STM.\n" +
                "\n" +
                "Alfiana mengatakan orang tuanya turut menjadi korban kenaikan harga BBM. \"Karena orang tua saya itu pada mengeluh gara-gara kenaikan BBM. Saya ikut bela,\" tuturnya saat ditemui di lokasi demo di kawasan Patung Arjuna Wijaya atau lebih dikenal dengan Patung Kuda, Senin, 12 September 2022.\n" +
                "\n" +
                "Ia berangkat demo, berdua bersama temannya dari Bekasi. Lalu bergabung bersama teman-teman STM dan massa GNPR.\n" +
                "\n" +
                "Massa GNPR merupakan elemen gabungan dari massa Persatuan Alumni 212 (PA 212) yang terdiri atas Gerakan Nasional Pengawal Fatwa Ulama (GNPF Ulama) dan Front Persatuan Islam (FPI). Mereka melakukan demo menolak kenaikan harga BBM.\n" +
                "\n" +
                "Aksi penolakan kenaikan harga BBM sebelumnya sudah terjadi sejak sepekan terakhir. Tak cuma di Jakarta, demonstrasi itu juga terjadi di wilayah lain di Indonesia.\n" +
                "\n" +
                "Sebelumnya, berbagai kalangan masyarakat, baik mahasiswa, ojek online, serta ormas-ormas lainnya telah melakukan demo tolak kenaikan BBM sejak pemerintah resmi menaikkan harga BBM pada Sabtu, 3 September lalu."),
        News(id = 6,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 7,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 8,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 9,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 10,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
    )

    var newsListLiveData: MutableLiveData<List<News>> = MutableLiveData()

    fun getNewsData(){
        val news = newsList
        newsListLiveData.value = news
    }
}
