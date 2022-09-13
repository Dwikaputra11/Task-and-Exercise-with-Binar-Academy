package com.example.newsapp

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
        newsVM.newsListLiveData.observe(this, Observer {
            newsAdapter.setNewsData(it as ArrayList<News>)
        })
    }

    private fun setView(){
        viewPagerAdapter = HeadlineViewPager(this)
        vpHeadline.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        vpHeadline.offscreenPageLimit = 3
        vpHeadline.adapter = viewPagerAdapter
        vpHeadline.setPageTransformer(MarginPageTransformer(50))
        vpHeadline.clipToPadding = false;
        vpHeadline.setPadding(10,10,10,0);
        dotsIndicator.attachTo(vpHeadline)
        newsAdapter = NewsAdapter(ArrayList())
        rvNews.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvNews.adapter = newsAdapter
    }
}