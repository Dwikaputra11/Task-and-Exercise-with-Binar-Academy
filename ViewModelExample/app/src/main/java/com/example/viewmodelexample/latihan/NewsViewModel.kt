package com.example.viewmodelexample.latihan

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewmodelexample.R
import com.example.viewmodelexample.data.News

class NewsViewModel: ViewModel() {
    var newsList = arrayListOf<News>(
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
        News(title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", img = R.drawable.ic_launcher_background, date = "12 Sep 2022", content = ""),
    )

    var newsListLiveData: MutableLiveData<List<News>> = MutableLiveData()

    fun setNewsData(){
        val news = newsList
        newsListLiveData.value = news
    }
}