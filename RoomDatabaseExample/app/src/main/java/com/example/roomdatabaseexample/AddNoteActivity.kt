package com.example.roomdatabaseexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.roomdatabaseexample.databinding.ActivityAddNoteBinding
import com.example.roomdatabaseexample.db.Note
import com.example.roomdatabaseexample.db.NoteDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class AddNoteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddNoteBinding
    private var dbNote: NoteDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dbNote = NoteDatabase.getInstance(this)

        binding.btnSave.setOnClickListener {
            addNote()
            Toast.makeText(this, "Data Berhasil Ditambah", Toast.LENGTH_SHORT).show()
        }
    }

    fun addNote(){
        var title = binding.etTitle.text.toString()
        var content = binding.etContent.toString()
        GlobalScope.async {
            dbNote!!.noteDao().insertNote(Note(0, title = title, content = content))
        }
        finish() // back to prev page
    }
}