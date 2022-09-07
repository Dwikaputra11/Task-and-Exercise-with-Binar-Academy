package com.example.chapter3.topic5.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter3.R
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val listContact = arrayListOf<MyContact>(
            MyContact("Dwika", "091092309"),
            MyContact("Hasim", "123081902"),
            MyContact("Abdul", "123498123"),
            MyContact("Made", "238478423"),
            MyContact("Nyoman", "234567045"),
            MyContact("Bagus", "576834509"),
            MyContact("Muhammad", "812039893"),
            MyContact("Iqbal", "485834587"),
            MyContact("Juan", "348561458"),
            MyContact("Maulana", "128334599"),
            MyContact("Gusti", "485834587"),
            MyContact("Suardana", "348561458"),
            MyContact("Iqbal", "128334599"),
        )

        val adapter = ContactAdapter()
        adapter.submitData(listContact)
        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rvContactView.layoutManager = layoutManager
        rvContactView.adapter = adapter
    }
}