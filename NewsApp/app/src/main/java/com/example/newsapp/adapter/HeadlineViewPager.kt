package com.example.newsapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsapp.R
import com.example.newsapp.data.News
import kotlinx.android.synthetic.main.headline_news.view.*


class HeadlineViewPager(private var headlineNewsList: ArrayList<News>):
    RecyclerView.Adapter<HeadlineViewPager.ViewHolder>() {
    lateinit var listener: OnItemClickListener
    private lateinit var context: Context
    interface OnItemClickListener{
        fun onItemClick(id: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        this.listener = listener
    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var title = itemView.tvTitleHeadline
        var date = itemView.tvDateHeadline
        var img = itemView.ivHeadline
        var editor = itemView.tvEditorHeadline

        init {
            itemView.setOnClickListener {
                listener.onItemClick(headlineNewsList[adapterPosition].id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.headline_news, parent, false)
        view.layoutParams =
            ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        context = parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context)
            .load(headlineNewsList[position].imgUrl)
            .placeholder(R.mipmap.ic_launcher_round)
            .into(holder.img.ivHeadline)
        holder.title.text = headlineNewsList[position].title
        holder.date.text = headlineNewsList[position].date
        holder.editor.text = headlineNewsList[position].editor
    }

    override fun getItemCount(): Int {
        return headlineNewsList.size
    }
    fun setHeadlineNewsData(headlineNewsList: ArrayList<News>){
        this.headlineNewsList = headlineNewsList
    }
}