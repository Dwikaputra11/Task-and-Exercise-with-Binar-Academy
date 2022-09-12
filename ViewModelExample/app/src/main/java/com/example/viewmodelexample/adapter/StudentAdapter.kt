package com.example.viewmodelexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodelexample.R
import com.example.viewmodelexample.data.Student
import kotlinx.android.synthetic.main.student_item.view.*

class StudentAdapter(private var listStudent: ArrayList<Student>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var ivStudent = itemView.ivStudent
        var tvName  = itemView.tvName
        var tvNim = itemView.tvNIM
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = listStudent[position].name
        holder.tvNim.text = listStudent[position].nim
        holder.ivStudent.setImageResource(listStudent[position].img)
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }

    fun setStudentData(studentList: ArrayList<Student>){
        this.listStudent = studentList
    }
}