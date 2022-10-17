package com.example.designpatternexample.presenter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.designpatternexample.databinding.CarItemBinding
import com.example.designpatternexample.model.CarResponseItem

class CarAdapter: RecyclerView.Adapter<CarAdapter.ViewHolder>() {


    private var diffCallback = object : DiffUtil.ItemCallback<CarResponseItem>(){
        override fun areItemsTheSame(oldItem: CarResponseItem, newItem: CarResponseItem): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: CarResponseItem, newItem: CarResponseItem): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    class ViewHolder(val binding: CarItemBinding):RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CarItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.carCategory.text = differ.currentList[position].category
        holder.binding.carName.text = differ.currentList[position].name
        holder.binding.carPrice.text = differ.currentList[position].price.toString()
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    fun setCarList(list: List<CarResponseItem>) = differ.submitList(list)
}