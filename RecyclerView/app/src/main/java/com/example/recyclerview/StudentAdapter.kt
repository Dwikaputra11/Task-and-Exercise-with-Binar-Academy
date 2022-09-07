package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val studentList: ArrayList<StudentItem>) :
    RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name =itemView.findViewById<TextView>(R.id.tvStudentName)
        val id = itemView.findViewById<TextView>(R.id.tvStudentId)
        val img = itemView.findViewById<ImageView>(R.id.ivStudentPhoto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = studentList[position].name
        holder.id.text = studentList[position].id
        holder.img.setImageResource(studentList[position].imgRes)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}