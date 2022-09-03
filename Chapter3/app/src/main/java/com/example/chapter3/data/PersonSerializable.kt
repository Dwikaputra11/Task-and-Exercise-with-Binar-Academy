package com.example.chapter3.data

import java.io.Serializable

data class PersonSerializable(val name: String, val age: Int, val city: String) : Serializable
