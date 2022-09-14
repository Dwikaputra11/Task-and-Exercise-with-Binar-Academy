package com.example.databinding.dbrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.StudentItemBinding

class StudentAdapter(private var studentList: ArrayList<Student>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(val binding: StudentItemBinding):RecyclerView.ViewHolder(binding.root) {
        fun data(itemData: Student){
            binding.student = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = StudentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.data(studentList[position])
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}