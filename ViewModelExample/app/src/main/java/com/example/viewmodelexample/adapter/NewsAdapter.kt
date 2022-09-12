package com.example.viewmodelexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodelexample.R
import com.example.viewmodelexample.data.News
import kotlinx.android.synthetic.main.news_item.view.*

class NewsAdapter(private val newsList:  ArrayList<News>): RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var ivNews = itemView.ivNews
        var tvTitle = itemView.tvTitleNews
        var tvEditor = itemView.tvEditor
        var tvDate = itemView.tvDate
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivNews.setImageResource(newsList[position].img)
        holder.tvTitle.text = newsList[position].title
        holder.tvEditor.text = newsList[position].editor
        holder.tvDate.text = newsList[position].date
    }

    override fun getItemCount(): Int = newsList.size
}