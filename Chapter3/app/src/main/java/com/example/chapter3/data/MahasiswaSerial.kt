package com.example.chapter3.data

import java.io.Serializable

data class MahasiswaSerial(
    val total: Int,
    val rataRata: Int,
    val nilaiHuruf: String,
    val status: String,
): Serializable
