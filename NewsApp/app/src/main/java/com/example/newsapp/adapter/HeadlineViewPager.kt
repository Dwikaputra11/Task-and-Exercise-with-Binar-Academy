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


class HeadlineViewPager(private var context: Context):
    RecyclerView.Adapter<HeadlineViewPager.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var title = itemView.tvTitleHeadline
        var content = itemView.tvContentHeadline
        var date = itemView.tvDateHeadline
        var img = itemView.ivHeadline
        var editor = itemView.tvEditorHeadline
    }
    private val headlineNews = arrayListOf<News>(
        News(id = 1,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 2,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
        News(id = 3,title = "Imigrasi Resmi Cegah Lukas Enembe ke Luar Negeri!", editor = "Andhika Prasetia", imgUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/26/ec2e42a6-6705-4e0d-99f1-738b6a8c921b_169.jpeg?w=700&q=90", date = "12 Sep 2022", content = ""),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.headline_news, parent, false)
        view.layoutParams =
            ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context)
            .load(headlineNews[position].imgUrl)
            .placeholder(R.mipmap.ic_launcher_round)
            .into(holder.img.ivHeadline)
        holder.title.text = headlineNews[position].title
        holder.content.text = headlineNews[position].content
        holder.date.text = headlineNews[position].date
        holder.editor.text = headlineNews[position].editor
    }

    override fun getItemCount(): Int {
        return headlineNews.size
    }
}