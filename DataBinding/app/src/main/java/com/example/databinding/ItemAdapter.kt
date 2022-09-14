package com.example.databinding

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.ItemListBinding

class ItemAdapter():
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemListBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}