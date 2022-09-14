package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.newsapp.data.News
import kotlinx.android.synthetic.main.activity_news_content.*

class NewsContentActivity : AppCompatActivity() {
    companion object{
        const val NEWS_CONTENT: String = "news_content"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_content)

        val newsContent = intent.getParcelableExtra<News>(NEWS_CONTENT) as News
        Glide.with(this)
            .load(newsContent.imgUrl)
            .placeholder(R.mipmap.ic_launcher_round)
            .into(ivNewsContent)
        tvContentNews.text = newsContent.content
        tvDateNews.text = newsContent.date
        tvEditorNews.text = newsContent.editor
        tvTitleNews.text = newsContent.title
    }
}