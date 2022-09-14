package com.example.newsapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.data.News

class NewsViewModel: ViewModel() {
    var newsList = arrayListOf<News>(
        News(id = 1,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = " Direktorat Jenderal Imigrasi melakukan pencegahan ke luar negeri terhadap Gubernur Papua Lukas Enembe. Hal itu dilakukan berdasarkan permintaan pencegahan yang diajukan oleh KPK.\n" +
                "    \"Direktorat Pengawasan dan Penindakan Keimigrasian (Ditwasdakim) Ditjen Imigrasi menerima pengajuan pencegahan kepada subjek an. Lukas Enembe dari Komisi Pemberantasan Korupsi (KPK) pada Rabu, 7 September 2022. Pencegahan berlaku selama enam bulan,\" kata Direktur Pengawasan dan Penindakan Keimigrasian, I Nyoman Gede Surya Mataram, seperti dikutip dari situs resmi Imigrasi, Senin (12/9/2022).\n" +
                "    Lukas Enembe resmi dicegah ke luar dari wilayah Indonesia terhitung sejak tanggal diterimanya pengajuan pencegahan sampai 7 Maret 2023. Setelah menerima permintaan pencegahan, Surya mengungkapkan Ditjen Imigrasi langsung memasukkan nama Lukas Enembe ke dalam Sistem Informasi Manajemen Keimigrasian (SIMKIM) yang terhubung ke seluruh Tempat Pemeriksaan Imigrasi di bandara, pelabuhan laut, dan Pos Lintas Batas seluruh Indonesia.\n" +
                "    \"Yang bersangkutan dilarang bepergian ke luar negeri selama masa pencegahan berlaku, \" ujar Surya.\n" +
                "    Sebelumnya, Koordinator tim kuasa hukum Gubernur Papua Lukas Enembe, Stefanus Roy Rening, mengungkapkan kliennya sudah ditetapkan sebagai tersangka oleh KPK terkait kasus dugaan suap dan gratifikasi Rp 1 miliar. Roy mempertanyakan dasar penetapan status tersangka tersebut.\n" +
                "    Roy mengatakan kliennya Lukas Enembe menjadi tersangka di KPK sejak 5 September 2022. Oleh sebab itulah, KPK memanggil Lukas Enembe sebagai tersangka di Mako Brimob Kotaraja, Kota Jayapura, Papua, hari ini, Senin (12/9)."),
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
        News(id = 6,title = "Lima Instruksi Jokowi Tekan Inflasi: Biaya Transportasi Turun hingga Percepat Penyerapan APBD\n", editor = "Riani Sanusi Putri", imgUrl = "https://statik.tempo.co/data/2022/01/03/id_1078287/1078287_720.jpg", date = "14 Sep 2022", content = "Menteri Koordinator Bidang Perekonomian Airlangga Hartarto mengungkapkan lima arahan dari Presiden Joko Widodo atau Jokowi dalam mengendalikan laju inflasi. Arahan tersebut diharapkan dapat diteruskan kepada Tim Pengendalian Inflasi Pusat (TPIP) maupun Tim Pengendalian Inflasi Daerah (TPID). \n" +
                "\n" +
                "\"Arahan ini untuk menjaga stabilitas harga dan meningkatkan ketahanan pangan untuk mendukung daya beli masyarakat dan pemulihan ekonomi nasional,\" ucap Airlangga dalam Rapat Koordinasi Pusat dan Daerah Pengendalian Inflasi 2022, dikutip dari video YouTube Bank Indonesia pada Rabu, 14 September 2022. \n" +
                "\n" +
                "Arahan yang pertama adalah memperkuat identifikasi sumber tekanan inflasi di daerah melalui pemanfaatan data makro dan mikro serta data detail. Kedua, memperluas kerja sama antardaerah (KAD) guna mengurangi disparitas pasokan dan harga antarwilayah.\n" +
                "\n" +
                "Menurut Jokowi, TPIP dan TPID perlu mengidentifikasi wilayah surplus dan defisit serta menjadi fasilitator untuk mendorong kerjasama antar daerah dalam pengendalian inflasi.\n" +
                "\n" +
                "Kemudian arahan yang ketiga, yaitu menurunkan biaya transportasi dengan memanfaatkan fasilitasi distribusi perdagangan antardaerah. Hal ini termasuk menurunkan harga tiket pesawat dengan menambah jumlah pesawat.\n" +
                "\n" +
                "Arahan selanjutnya adalah mengoptimalkan penggunaan anggaran belanja tidak terduga untuk mendukung upaya pengendalian inflasi daerah. Tetakhir, Jokowi meminta penyerapan Anggaran Pendapatan dan Belanja Daerah (APBD) dipercepat untuk mendukung pertumbuhan ekonomi daerah.\n" +
                "\n" +
                "Jokowi ingatkan Airlangga soal pentingnya melakukan extra effort dalam pengendalian inflasi. Sebab, saat ini Indonesia masih menghadapi tantangan berat, baik dari global maupun domestik. Selain itu, menurut Jokowi belanja tidak terduga bisa digunakan untuk mengatasi inflasi.\n" +
                "\n" +
                "\"Dengan cara apa, ya tutup biaya transportasi, tutup biaya distribusi dari yang ada di lapangan,\" kata dia. \n" +
                "\n"),
        News(id = 7,title = "Liverpool Menang di Liga Champions, Ini Balasan Virgil van Dijk ke Pundit Bola", editor = "Skor.id", imgUrl = "https://statik.tempo.co/data/2022/02/24/id_1090437/1090437_720.jpg", date = "14 Sep 2022", content = " Liverpool sukses meraih tiga poin atau kemenangan perdana di Liga Champions. Pertandingan Liverpool vs Ajax Amsterdam di Stadion Anfield berakhir dengan skor 2-1.\n" +
                "\n" +
                "Tim asuhan Jurgen Klopp bisa bangkit setelah pada laga sebelumnya kalah dari Napoli dengan skor telak 1-4. Dua gol kemenangan Liverpool dicetak oleh Mohamed Salah dan Joel Matip. Sementara gol Ajax dikemas Mohammed Kudus. \n" +
                "\n" +
                "Atas hasil itu, the Reds kini naik peringkat ke posisi dua klasemen Grup A dengan tiga poin. Sementara Ajax tergeser ke peringkat tiga mengemas poin yang sama dengan Liverpool.  \n" +
                "\n" +
                "Hasil positif yang diraih finalis Liga Champions musim lalu ini rupanya menjadi amunisi bagi Virgil van Dijk untuk merespons kritik dari pengamat atau pundit sepak bola. Bek Liverpool tersebut mengatakan bahwa para pengamat nampaknya hanya bertujuan menurunkan moral skuad the Reds. \n" +
                "\n" +
                "\"Kami tidak peduli dengan komentar publik. Banyak mantan pemain sepak bola yang tahu persis apa yang kami lalui. Mereka mengatakan banyak hal untuk menjatuhkan kami, tetapi kami tahu pertandingan terakhir sangat buruk dan ini adalah langkah ke arah yang benar,\" ujar van Dijk kepada BT Sport. \n" +
                "\n" +
                "Usai mengalami kekalahan dari Napoli, Liverpool menerima kritik yang cukup tajam dari berbagai pundit sepak bola, khususnya penampilan pemain di lini belakang. Van Dijk merupakan salah satu pemain yang menerima kritikan tersebut. \n" +
                "\n" +
                "Lebih lanjut, pemain asal Belanda tersebut mengatakan hasil positif dari Ajax amat penting bagi Liverpool untuk menatap laga-laga selanjutnya. \"Tidak mudah untuk membalikkannya, tetapi ini adalah langkah ke arah yang benar. Sangat penting untuk menang menjelang jeda internasional,\" ujar van Dijk. \n" +
                "\n"),
        News(id = 8,title = "PSG Ingin Perpanjang Kontrak Lionel Messi dan Sergio Ramos", editor = "Antara", imgUrl = "https://statik.tempo.co/data/2022/08/07/id_1130993/1130993_720.jpg", date = "13 Sep 2022", content = "Klub raksasa Liga Prancis Paris Saint-Germain (PSG) tengah mempertimbangkan memperpanjang kontrak dua pemain senior pada bursa transfer musim dingin mendatang. Mereka adalah Lionel Messi dan Sergio Ramos. \n" +
                "\n" +
                "Football Espana melaporkan pada Selasa, 13 September 2022, PSG dikabarkan sedang mempertimbangkan langkah ini lantaran kedua pemain tersebut telah memberikan kontribusi positif kepada tim berjuluk Les Parisiens.\n" +
                "\n" +
                "Kontrak Messi dan Ramos akan habis pada akhir musim ini. Direktur Teknik PSG Luis Campos disebut-sebut telah siap memperpanjang kontrak keduanya selama satu tahun.\n" +
                "\n" +
                "Messi sepertinya akan mulai memutuskan masa depannya awal tahun depan. Pasalnya, saat ini dia terlihat lebih ingin fokus kepada Timnas Argentina yang akan tampil di Piala Dunia 2022 Qatar.\n" +
                "\n" +
                "Lionel Messi dan Sergio Ramos didatangkan dari Barcelona dan Real Madrid pada musim panas 2021. Messi pergi dari Barcelona karena ada persoalan keuangan yang menimpa klub asal Catalan tersebut. Sementara Ramos memilih tidak memperpanjang kontraknya.\n" +
                "\n" +
                "Messi sudah tampil dalam 43 pertandingan PSG dengan menyumbangkan 15 gol dan 22 assist. Sedangkan Ramos sudah bermain 22 kali dan menyumbangkan tiga gol untuk Les Parisiens.\n" +
                "\n"),
        News(id = 9,title = "Pangeran Andrew Dipermalukan di Dekat Peti Mati Ratu Elizabeth II", editor = "Tempo.co", imgUrl = "https://statik.tempo.co/data/2022/09/13/id_1140517/1140517_720.jpg", date = "13 Sep 2022", content = "Seorang pria Skotlandia mengolok-olok putra kedua Ratu Elizabeth II, Pangeran Andrew pada prosesi pemakaman sang ratu di Edinburgh, Skotlandia pada Senin, 12 September 2022. Insiden itu terjadi ketika Andrew dan saudara-saudaranya yaitu Raja Charles III, Pangeran Edward dan Putri Anne sedang berjalan di belakang mobil jenazah sambil memegang peti mati berbendera ratu.\n" +
                "\n" +
                "Saat prosesi kerajaan melewati kerumunan, seorang pria terdengar berteriak. \"Andrew, kamu orang tua yang sakit,\" ujarnya kepada sang pangeran. \n" +
                "\n" +
                "Polisi segera menangkap pria itu dan menariknya keluar dari kerumunan. Penduduk yang berkerumun di sekitar pun berteriak, \"Tuhan selamatkan Raja!\" \n" +
                "\n" +
                "Pangeran Andrew sedang diselidiki karena hubungannya dengan pengusaha asal Amerika Serikat Jeffrey Epstein. Andrew dituduh melakukan pelecehan seksual kepada Virginia Giuffre, saat korban masih di bawah umur pada awal 2000-an. \n" +
                "\n" +
                "Pria yang berteriak kepada Pangeran Andrew diidentifikasi hanya sebagai \"Rory.\" Kepada jurnalis Holyrood Daily, dia mengatakan mencela sang pangeran sehingga orang-orang akan tahu meski Andrew adalah orang kuat, dia tidak bisa lolos dari kejahatan seksual. \n" +
                "\n" +
                "Dalam rangkaian prosesi pemakaman Ratu Elizabeth II, polisi telah menangkap dua tersangka lainnya di Eidenburgh. Keduanya adalah seorang wanita berusia 22 tahun, yang memegang tanda anti-monarki dan seorang pria berusia 74 tahun yang ditangkap secara terpisah pada Minggu didakwa melanggar perdamaian.\n" +
                "\n"),
        News(id = 10,title = "Ukraina Siap Turuti Rusia di Awal Konflik, tapi Putin Pilih Perang", editor = "Tempo.co", imgUrl = "https://statik.tempo.co/data/2022/09/14/id_1140855/1140855_720.jpg", date = "14 Sep 2022", content = "Kepala utusan Rusia untuk berunding dengan Ukraina pernah mengatakan kepada Presiden Vladimir Putin di awal perang bahwa Kyiv siap memenuhi permintaan Moskow untuk tetap berada di luar NATO sebagai syarat dihentikannya serangan.\n" +
                "\n" +
                "Namun Putin saat itu menolak dan melanjutkan tindakan militernya, kata tiga orang-orang yang dekat dengan kepemimpinan Rusia seperti disiarkan Reuters, Rabu, 14 September 2022.\n" +
                "\n" +
                "Utusan kelahiran Ukraina, Dmitry Kozak, mengatakan kepada Putin bahwa dia yakin kesepakatan yang dia buat menghilangkan kebutuhan Rusia untuk mengejar pendudukan skala besar di Ukraina, menurut sumber-sumber ini.  \n" +
                "\n" +
                "Putin berulang kali menegaskan sebelum perang bahwa NATO dan infrastruktur militernya merayap lebih dekat ke perbatasan Rusia dengan menerima anggota baru dari Eropa timur, dan bahwa aliansi itu sekarang bersiap memasukkan Ukraina. Putin secara terbuka mengatakan bahwa itu merupakan ancaman eksistensial bagi Rusia, memaksanya untuk bereaksi.\n" +
                "\n" +
                "Namun, meskipun sebelumnya mendukung negosiasi, Putin menjelaskan bahwa konsesi yang dinegosiasikan oleh Kozak tidak sesuai harapan, selain ia juga memperluas tujuan serangan yakni pencaplokan wilayah Ukraina, kata sumber tersebut. Hasilnya: kesepakatan dibatalkan.\n" +
                "\n" +
                "Juru bicara Kremlin Dmitry Peskov membantah pernyataan sumber itu. \"Itu sama sekali tidak ada hubungannya dengan kenyataan. Tidak ada hal seperti itu yang pernah terjadi. Ini benar-benar informasi yang salah,\" katanya kepada Reuters.\n" +
                "\n" +
                "Kozak tidak menanggapi permintaan komentar yang dikirim melalui Kremlin.\n" +
                "\n" +
                "Mykhailo Podolyak, penasihat presiden Ukraina, mengatakan Rusia telah menggunakan negosiasi sebagai tabir asap untuk mempersiapkan invasi, tetapi dia tidak menanggapi pertanyaan tentang substansi pembicaraan atau mengkonfirmasi bahwa kesepakatan awal telah tercapai.\n" +
                "\n" +
                "\"Hari ini, kami dengan jelas memahami bahwa pihak Rusia tidak pernah tertarik pada penyelesaian damai,\" kata Podolyak.\n" +
                "\n" +
                "Dua dari tiga sumber mengatakan dorongan untuk menyelesaikan kesepakatan terjadi segera setelah invasi Rusia pada 24 Februari. Dalam beberapa hari, Kozak yakin dia memiliki kesepakatan Ukraina dengan persyaratan utama yang dicari Rusia dan merekomendasikan kepada Putin agar dia menandatangani kesepakatan, kata sumber tersebut.\n" +
                "\n" +
                "“Setelah 24 Februari, Kozak diberi kekuasaan penuh: mereka memberinya lampu hijau; dia mendapatkan kesepakatan. Dia membawanya kembali dan mereka menyuruhnya untuk pergi. Semuanya dibatalkan,\" kata salah satu sumber yang dekat dengan kepemimpinan Rusia.\n" +
                "\n" +
                "Sumber ketiga - yang diberi tahu tentang peristiwa itu oleh orang-orang yang diberi pengarahan tentang diskusi antara Kozak dan Putin - berbeda pendapat tentang waktunya. Ia mengatakan bahwa Kozak telah mengusulkan kesepakatan itu kepada Putin yang menolaknya, tepat sebelum invasi. Semua sumber meminta anonimitas untuk membagikan informasi internal yang sensitif.\n" +
                "\n" +
                "Serangan Moskow di Ukraina adalah kampanye militer terbesar di Eropa sejak Perang Dunia II. Ini mendorong sanksi ekonomi besar-besaran terhadap Rusia dan dukungan militer untuk Ukraina dari Washington dan sekutu Baratnya.\n" +
                "\n"),
    )

    var headlineNewsList = arrayListOf<News>(
        News(id = 1,title = "Ukraina Siap Turuti Rusia di Awal Konflik, tapi Putin Pilih Perang", editor = "Tempo.co", imgUrl = "https://statik.tempo.co/data/2022/09/14/id_1140855/1140855_720.jpg", date = "14 Sep 2022", content = "Kepala utusan Rusia untuk berunding dengan Ukraina pernah mengatakan kepada Presiden Vladimir Putin di awal perang bahwa Kyiv siap memenuhi permintaan Moskow untuk tetap berada di luar NATO sebagai syarat dihentikannya serangan.\n" +
                "\n" +
                "Namun Putin saat itu menolak dan melanjutkan tindakan militernya, kata tiga orang-orang yang dekat dengan kepemimpinan Rusia seperti disiarkan Reuters, Rabu, 14 September 2022.\n" +
                "\n" +
                "Utusan kelahiran Ukraina, Dmitry Kozak, mengatakan kepada Putin bahwa dia yakin kesepakatan yang dia buat menghilangkan kebutuhan Rusia untuk mengejar pendudukan skala besar di Ukraina, menurut sumber-sumber ini.  \n" +
                "\n" +
                "Putin berulang kali menegaskan sebelum perang bahwa NATO dan infrastruktur militernya merayap lebih dekat ke perbatasan Rusia dengan menerima anggota baru dari Eropa timur, dan bahwa aliansi itu sekarang bersiap memasukkan Ukraina. Putin secara terbuka mengatakan bahwa itu merupakan ancaman eksistensial bagi Rusia, memaksanya untuk bereaksi.\n" +
                "\n" +
                "Namun, meskipun sebelumnya mendukung negosiasi, Putin menjelaskan bahwa konsesi yang dinegosiasikan oleh Kozak tidak sesuai harapan, selain ia juga memperluas tujuan serangan yakni pencaplokan wilayah Ukraina, kata sumber tersebut. Hasilnya: kesepakatan dibatalkan.\n" +
                "\n" +
                "Juru bicara Kremlin Dmitry Peskov membantah pernyataan sumber itu. \"Itu sama sekali tidak ada hubungannya dengan kenyataan. Tidak ada hal seperti itu yang pernah terjadi. Ini benar-benar informasi yang salah,\" katanya kepada Reuters.\n" +
                "\n" +
                "Kozak tidak menanggapi permintaan komentar yang dikirim melalui Kremlin.\n" +
                "\n" +
                "Mykhailo Podolyak, penasihat presiden Ukraina, mengatakan Rusia telah menggunakan negosiasi sebagai tabir asap untuk mempersiapkan invasi, tetapi dia tidak menanggapi pertanyaan tentang substansi pembicaraan atau mengkonfirmasi bahwa kesepakatan awal telah tercapai.\n" +
                "\n" +
                "\"Hari ini, kami dengan jelas memahami bahwa pihak Rusia tidak pernah tertarik pada penyelesaian damai,\" kata Podolyak.\n" +
                "\n" +
                "Dua dari tiga sumber mengatakan dorongan untuk menyelesaikan kesepakatan terjadi segera setelah invasi Rusia pada 24 Februari. Dalam beberapa hari, Kozak yakin dia memiliki kesepakatan Ukraina dengan persyaratan utama yang dicari Rusia dan merekomendasikan kepada Putin agar dia menandatangani kesepakatan, kata sumber tersebut.\n" +
                "\n" +
                "“Setelah 24 Februari, Kozak diberi kekuasaan penuh: mereka memberinya lampu hijau; dia mendapatkan kesepakatan. Dia membawanya kembali dan mereka menyuruhnya untuk pergi. Semuanya dibatalkan,\" kata salah satu sumber yang dekat dengan kepemimpinan Rusia.\n" +
                "\n" +
                "Sumber ketiga - yang diberi tahu tentang peristiwa itu oleh orang-orang yang diberi pengarahan tentang diskusi antara Kozak dan Putin - berbeda pendapat tentang waktunya. Ia mengatakan bahwa Kozak telah mengusulkan kesepakatan itu kepada Putin yang menolaknya, tepat sebelum invasi. Semua sumber meminta anonimitas untuk membagikan informasi internal yang sensitif.\n" +
                "\n" +
                "Serangan Moskow di Ukraina adalah kampanye militer terbesar di Eropa sejak Perang Dunia II. Ini mendorong sanksi ekonomi besar-besaran terhadap Rusia dan dukungan militer untuk Ukraina dari Washington dan sekutu Baratnya.\n" +
                "\n"),
        News(id = 2,title = "PSG Ingin Perpanjang Kontrak Lionel Messi dan Sergio Ramos", editor = "Antara", imgUrl = "https://statik.tempo.co/data/2022/08/07/id_1130993/1130993_720.jpg", date = "13 Sep 2022", content = "Klub raksasa Liga Prancis Paris Saint-Germain (PSG) tengah mempertimbangkan memperpanjang kontrak dua pemain senior pada bursa transfer musim dingin mendatang. Mereka adalah Lionel Messi dan Sergio Ramos. \n" +
                "\n" +
                "Football Espana melaporkan pada Selasa, 13 September 2022, PSG dikabarkan sedang mempertimbangkan langkah ini lantaran kedua pemain tersebut telah memberikan kontribusi positif kepada tim berjuluk Les Parisiens.\n" +
                "\n" +
                "Kontrak Messi dan Ramos akan habis pada akhir musim ini. Direktur Teknik PSG Luis Campos disebut-sebut telah siap memperpanjang kontrak keduanya selama satu tahun.\n" +
                "\n" +
                "Messi sepertinya akan mulai memutuskan masa depannya awal tahun depan. Pasalnya, saat ini dia terlihat lebih ingin fokus kepada Timnas Argentina yang akan tampil di Piala Dunia 2022 Qatar.\n" +
                "\n" +
                "Lionel Messi dan Sergio Ramos didatangkan dari Barcelona dan Real Madrid pada musim panas 2021. Messi pergi dari Barcelona karena ada persoalan keuangan yang menimpa klub asal Catalan tersebut. Sementara Ramos memilih tidak memperpanjang kontraknya.\n" +
                "\n" +
                "Messi sudah tampil dalam 43 pertandingan PSG dengan menyumbangkan 15 gol dan 22 assist. Sedangkan Ramos sudah bermain 22 kali dan menyumbangkan tiga gol untuk Les Parisiens.\n" +
                "\n"),
        News(id = 3,title = "Lima Instruksi Jokowi Tekan Inflasi: Biaya Transportasi Turun hingga Percepat Penyerapan APBD\n", editor = "Riani Sanusi Putri", imgUrl = "https://statik.tempo.co/data/2022/01/03/id_1078287/1078287_720.jpg", date = "14 Sep 2022", content = "Menteri Koordinator Bidang Perekonomian Airlangga Hartarto mengungkapkan lima arahan dari Presiden Joko Widodo atau Jokowi dalam mengendalikan laju inflasi. Arahan tersebut diharapkan dapat diteruskan kepada Tim Pengendalian Inflasi Pusat (TPIP) maupun Tim Pengendalian Inflasi Daerah (TPID). \n" +
                "\n" +
                "\"Arahan ini untuk menjaga stabilitas harga dan meningkatkan ketahanan pangan untuk mendukung daya beli masyarakat dan pemulihan ekonomi nasional,\" ucap Airlangga dalam Rapat Koordinasi Pusat dan Daerah Pengendalian Inflasi 2022, dikutip dari video YouTube Bank Indonesia pada Rabu, 14 September 2022. \n" +
                "\n" +
                "Arahan yang pertama adalah memperkuat identifikasi sumber tekanan inflasi di daerah melalui pemanfaatan data makro dan mikro serta data detail. Kedua, memperluas kerja sama antardaerah (KAD) guna mengurangi disparitas pasokan dan harga antarwilayah.\n" +
                "\n" +
                "Menurut Jokowi, TPIP dan TPID perlu mengidentifikasi wilayah surplus dan defisit serta menjadi fasilitator untuk mendorong kerjasama antar daerah dalam pengendalian inflasi.\n" +
                "\n" +
                "Kemudian arahan yang ketiga, yaitu menurunkan biaya transportasi dengan memanfaatkan fasilitasi distribusi perdagangan antardaerah. Hal ini termasuk menurunkan harga tiket pesawat dengan menambah jumlah pesawat.\n" +
                "\n" +
                "Arahan selanjutnya adalah mengoptimalkan penggunaan anggaran belanja tidak terduga untuk mendukung upaya pengendalian inflasi daerah. Tetakhir, Jokowi meminta penyerapan Anggaran Pendapatan dan Belanja Daerah (APBD) dipercepat untuk mendukung pertumbuhan ekonomi daerah.\n" +
                "\n" +
                "Jokowi ingatkan Airlangga soal pentingnya melakukan extra effort dalam pengendalian inflasi. Sebab, saat ini Indonesia masih menghadapi tantangan berat, baik dari global maupun domestik. Selain itu, menurut Jokowi belanja tidak terduga bisa digunakan untuk mengatasi inflasi.\n" +
                "\n" +
                "\"Dengan cara apa, ya tutup biaya transportasi, tutup biaya distribusi dari yang ada di lapangan,\" kata dia. \n" +
                "\n"),
        News(id = 4,title = "Pelajar SMA Ikut Demo Tolak Kenaikan Harga BBM: Orang Tua Saya Jadi Korban", editor = "Muhsin Sabilillah", imgUrl = "https://statik.tempo.co/data/2022/09/12/id_1140283/1140283_720.jpg", date = "13 Sep 2022", content = "Seorang siswa SMA ikut demo menolak kenaikan harga BBM yang diumumkan Jokowi pada 3 September lalu.\n" +
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
    )

    var newsListLiveData: MutableLiveData<List<News>> = MutableLiveData()

    fun getNewsData(){
        val news = newsList
        newsListLiveData.value = news
    }

    var headlineListLiveData: MutableLiveData<List<News>> = MutableLiveData()
    fun getHeadlinesData(){
        val headlines = headlineNewsList
        headlineListLiveData.value = headlines
    }
}
