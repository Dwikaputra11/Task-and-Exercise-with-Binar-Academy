package com.example.newsapp.adapter

import android.content.Context
import android.icu.lang.UCharacter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsapp.R
import com.example.newsapp.data.News
import kotlinx.android.synthetic.main.news_item.view.*

class NewsAdapter(private var newsList:  ArrayList<News>): RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    private lateinit var context: Context

    interface OnItemClickListenr{
        fun onItemClick()
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var ivNews = itemView.ivNews
        var tvTitle = itemView.tvTitleNews
        var tvEditor = itemView.tvEditor
        var tvDate = itemView.tvDate
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        context = parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // use glide library to load image using url
        Glide.with(context)
            .load(newsList[position].imgUrl)
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.ivNews)
        holder.tvTitle.text = newsList[position].title
        holder.tvEditor.text = newsList[position].editor
        holder.tvDate.text = newsList[position].date
    }

    override fun getItemCount(): Int = newsList.size

    fun setNewsData(newsList: ArrayList<News>){
        this.newsList = newsList
    }
}