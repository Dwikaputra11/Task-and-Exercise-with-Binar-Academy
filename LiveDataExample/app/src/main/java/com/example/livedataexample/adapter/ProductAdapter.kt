package com.example.livedataexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.livedataexample.R
import com.example.livedataexample.data.Product
import com.example.livedataexample.databinding.ItemProductBinding

class ProductAdapter(private var productList: ArrayList<Product>):
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    private lateinit var listener: OnItemClickListener
    interface OnItemClickListener{
        fun onItemClick(id: Int, pos: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        this.listener = listener
    }

    inner class ViewHolder(private var binding: ItemProductBinding): RecyclerView.ViewHolder(binding.root) {
        fun setData(product: Product){
            binding.product = product
        }
        init {
            itemView.setOnClickListener {
                listener.onItemClick(productList[adapterPosition].id, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(product = productList[position])
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    fun setProductList(productList: ArrayList<Product>){
        this.productList = productList
    }
}