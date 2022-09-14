package com.example.newsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.newsapp.data.News
import kotlinx.android.synthetic.main.fragment_detail_news.*

class DetailNewsFragment : Fragment() {
    companion object{
        const val NEWS_CONTENT: String = "news_content"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val newsContent = arguments?.getParcelable<News>(NEWS_CONTENT) as News
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