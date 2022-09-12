package com.example.newsapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.data.News

class NewsViewModel: ViewModel() {
    var newsList = arrayListOf<News>(
        News(id = 1,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 2,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 3,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 4,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 5,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
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