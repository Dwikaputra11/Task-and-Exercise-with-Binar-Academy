package com.example.retrofitexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofitexample.R
import com.example.retrofitexample.databinding.CarItemBinding
import com.example.retrofitexample.model.ResponseDataCarItem

class CarAdapter(var listCar: List<ResponseDataCarItem>): RecyclerView.Adapter<CarAdapter.ViewHolder>() {
    class ViewHolder(var binding : CarItemBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarAdapter.ViewHolder {
        val view = CarItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarAdapter.ViewHolder, position: Int) {
        holder.binding.nameCar.text = listCar[position].name
        holder.binding.categoryCar.text = listCar[position].category
        holder.binding.priceCar.text = listCar[position].price.toString()
        Glide.with(holder.binding.root.context)
            .load(listCar[position].image)
            .placeholder(R.mipmap.ic_launcher_round)
            .into(holder.binding.imgCar)
    }

    override fun getItemCount(): Int {
        return listCar.size
    }
}