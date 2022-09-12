package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class CityAdapterDiff(): RecyclerView.Adapter<CityAdapterDiff.ViewHolder>() {

    private var diffCallback = object : DiffUtil.ItemCallback<CityItem>(){
        override fun areItemsTheSame(oldItem: CityItem, newItem: CityItem): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: CityItem, newItem: CityItem): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }

    private val differ = AsyncListDiffer(this,diffCallback)

    fun submitData(value: ArrayList<CityItem>) = differ.submitList(value)

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
        val data = differ.currentList[position]

        holder.name.text = data.name
        holder.capital.text = data.capital
        holder.img.setImageResource(data.img)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}