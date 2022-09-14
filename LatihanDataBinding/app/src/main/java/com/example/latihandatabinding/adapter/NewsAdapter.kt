package com.example.latihandatabinding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihandatabinding.data.News
import com.example.latihandatabinding.databinding.NewsItemBinding

class NewsAdapter(private var newsList: ArrayList<News>): RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    private lateinit var listener:OnItemClickListener
    interface OnItemClickListener{
        fun onItemClick(id: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        this.listener = listener
    }

    inner class ViewHolder(private val binding: NewsItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun setData(itemData: News){
            binding.news = itemData
        }

        init {
            binding.root.setOnClickListener {
                listener.onItemClick(newsList[adapterPosition].id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = NewsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(newsList[position])
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    fun setNewsData(newsList: ArrayList<News>){
        this.newsList = newsList
    }
}