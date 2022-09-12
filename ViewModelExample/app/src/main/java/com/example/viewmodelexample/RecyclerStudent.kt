package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewmodelexample.adapter.StudentAdapter
import com.example.viewmodelexample.data.Student
import kotlinx.android.synthetic.main.activity_recycler_student.*

class RecyclerStudent : AppCompatActivity() {
    lateinit var studentVm: StudentViewModel
    lateinit var studentAdapter: StudentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_student)

        setView()

        studentVm = ViewModelProvider(this)[StudentViewModel::class.java]
        // to retrieve data from studentList in StudentViewModel for studentListLiveData
        studentVm.getStudent()
        // make data up to date by observe data by usuing student adapter method
        studentVm.studentListLiveData.observe(this, Observer {
                studentAdapter.setStudentData(it as ArrayList<Student>)
            }
        )
    }

    private fun setView(){
        studentAdapter = StudentAdapter(ArrayList())
        rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvStudent.adapter = studentAdapter
    }
}