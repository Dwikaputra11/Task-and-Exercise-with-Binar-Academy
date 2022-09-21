package com.example.roomdatabaseexample.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo // gak harus dipakek
    var title: String,
    @ColumnInfo
    var content: String,
)
