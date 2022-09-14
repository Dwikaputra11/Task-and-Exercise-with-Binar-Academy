package com.example.databinding.dbrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databinding.R
import com.example.databinding.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {

    lateinit var binding: ActivityStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_student)

        var studentList = arrayListOf<Student>(
            Student(name = "Dwika", nim = "1232093", R.mipmap.ic_launcher_round),
            Student(name = "Putra", nim = "2459084", R.mipmap.ic_launcher_round),
            Student(name = "Yusuf", nim = "4596855", R.mipmap.ic_launcher_round),
            Student(name = "Amir", nim = "4596850", R.mipmap.ic_launcher_round),
        )

        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.adapter = StudentAdapter(studentList)

    }
}