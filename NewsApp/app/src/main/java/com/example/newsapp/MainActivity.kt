package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.newsapp.adapter.HeadlineViewPager
import com.example.newsapp.adapter.NewsAdapter
import com.example.newsapp.data.News
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var newsAdapter: NewsAdapter
    lateinit var newsVM : NewsViewModel
    lateinit var viewPagerAdapter: HeadlineViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setView()

        newsVM = ViewModelProvider(this)[NewsViewModel::class.java]
        newsVM.getNewsData()
        newsVM.getHeadlinesData()
        newsVM.newsListLiveData.observe(this, Observer {
            newsAdapter.setNewsData(it as ArrayList<News>)
        })
        newsVM.headlineListLiveData.observe(this, Observer {
            viewPagerAdapter.setHeadlineNewsData(it as ArrayList<News>)
        })
    }

    private fun setView(){
        viewPagerAdapter = HeadlineViewPager(ArrayList())
        vpHeadline.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        vpHeadline.offscreenPageLimit = 3
        vpHeadline.adapter = viewPagerAdapter
        viewPagerAdapter.setOnItemClickListener(object: HeadlineViewPager.OnItemClickListener{
            override fun onItemClick(id: Int) {
                moveToContentNews(id, "headline")
            }
        })
        vpHeadline.setPageTransformer(MarginPageTransformer(50))
        vpHeadline.clipToPadding = false;
        vpHeadline.setPadding(10,10,10,0);
        dotsIndicator.attachTo(vpHeadline)
        newsAdapter = NewsAdapter(ArrayList())
        rvNews.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvNews.adapter = newsAdapter
        newsAdapter.setOnItemClickListener(object : NewsAdapter.OnItemClickListener{
            override fun onItemClick(id: Int) {
                moveToContentNews(id, "news")
            }
        })
    }

    fun moveToContentNews(id: Int, key_word:String ){
        val newsContent = if(key_word == "headline"){
            newsVM.headlineListLiveData.value?.first{
                it.id == id
            } as News
        }else{
            newsVM.newsListLiveData.value?.first {
                it.id == id
            } as News
        }
        val intent = Intent(this@MainActivity, NewsContentActivity::class.java)
        intent.putExtra(NewsContentActivity.NEWS_CONTENT, newsContent)
        startActivity(intent)
    }
}