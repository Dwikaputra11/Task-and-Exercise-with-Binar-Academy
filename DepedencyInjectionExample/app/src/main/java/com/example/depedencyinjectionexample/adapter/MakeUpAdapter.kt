package com.example.depedencyinjectionexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.depedencyinjectionexample.databinding.MakeUpItemBinding
import com.example.depedencyinjectionexample.model.MakeUpDataResponseItem

class MakeUpAdapter(private val list: List<MakeUpDataResponseItem>):
    RecyclerView.Adapter<MakeUpAdapter.ViewHolder>() {
    class ViewHolder(val binding: MakeUpItemBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MakeUpItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvBrand.text = list[position].brand
        holder.binding.tvCategory.text = list[position].category
        holder.binding.tvNameProduct.text = list[position].name
        Glide.with(holder.binding.root)
            .load(list[position].imageLink)
            .into(holder.binding.civMakeUp)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}