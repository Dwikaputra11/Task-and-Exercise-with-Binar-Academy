package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(private val listCity: ArrayList<CityItem>): RecyclerView.Adapter<CityAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.tvCityName)
        val capital = itemView.findViewById<TextView>(R.id.tvCityCapital)
        val img = itemView.findViewById<ImageView>(R.id.ivCityImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = listCity[position].name
        holder.capital.text = listCity[position].name
        holder.img.setImageResource(listCity[position].img)
    }

    override fun getItemCount(): Int {
        return listCity.size
    }
}