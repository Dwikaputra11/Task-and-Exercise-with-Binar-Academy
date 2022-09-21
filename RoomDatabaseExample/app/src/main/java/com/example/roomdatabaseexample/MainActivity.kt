package com.example.roomdatabaseexample

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomdatabaseexample.adapter.NoteAdapter
import com.example.roomdatabaseexample.databinding.ActivityMainBinding
import com.example.roomdatabaseexample.db.Note
import com.example.roomdatabaseexample.db.NoteDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var noteDB: NoteDatabase? = null
    private lateinit var noteAdapter: NoteAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        noteDB = NoteDatabase.getInstance(this)

        binding.fabAddNote.setOnClickListener {
            val intent = Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
        }
        Log.d(packageName, "onCreate: Started")

//        setDataItem()
    }

    override fun onStart() {
        super.onStart()
        setDataItem()
        Log.d(packageName, "onStart: Started")
    }

    fun getAllNotes(){
        GlobalScope.launch { // launch for grt data
            val data = noteDB!!.noteDao().getAllNote()
            runOnUiThread { // use runOnUIThread for ui update
                noteAdapter = NoteAdapter(data)
                binding.rvNote.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
                binding.rvNote.adapter = noteAdapter
            }
        }
    }

    private fun setDataItem(){
        GlobalScope.launch { // launch for grt data
            val data = noteDB!!.noteDao().getAllNote()
            runOnUiThread { // use runOnUIThread for ui update
                noteAdapter = NoteAdapter(data)
                binding.rvNote.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
                binding.rvNote.adapter = noteAdapter
            }
        }
    }


}