package com.example.roomdatabaseexample.db

import androidx.room.*

@Dao
interface NoteDao {
    @Query("SELECT * FROM Note")
    fun getAllNote(): List<Note>

    @Insert
    fun insertNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Delete
    fun deleteNote(note: Note): Int
}