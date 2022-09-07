package com.example.chapter3.topic5.latihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter3.R

class ContactAdapter():
    RecyclerView.Adapter<ContactAdapter.ViewHolder>()
{
    private var diffCallBack = object : DiffUtil.ItemCallback<MyContact>() {
        override fun areItemsTheSame(oldItem: MyContact, newItem: MyContact): Boolean {
            return oldItem.nama == newItem.nama
        }

        override fun areContentsTheSame(oldItem: MyContact, newItem: MyContact): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }

    private val differ = AsyncListDiffer(this, diffCallBack)

    fun submitData(value: ArrayList<MyContact>) = differ.submitList(value)

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.tvNama)
        val noHp = itemView.findViewById<TextView>(R.id.tvNoHp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_contact_item, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = differ.currentList[position]

        holder.name.text = data.nama
        holder.noHp.text = data.noHp
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}