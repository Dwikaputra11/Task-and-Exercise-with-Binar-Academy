package com.example.viewmodelexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewmodelexample.data.Student

class StudentViewModel: ViewModel() {

    val studentList = arrayListOf<Student>(
        Student(name = "Dwika", nim = "123200343", img = R.drawable.ic_launcher_foreground),
        Student(name = "Dwika", nim = "123200343", img = R.drawable.ic_launcher_foreground),
        Student(name = "Dwika", nim = "123200343", img = R.drawable.ic_launcher_foreground),
        Student(name = "Dwika", nim = "123200343", img = R.drawable.ic_launcher_foreground),
    )

    val studentListLiveData: MutableLiveData<List<Student>> = MutableLiveData()

    fun getStudent(){
        var student = studentList
        studentListLiveData.value = student
    }
}