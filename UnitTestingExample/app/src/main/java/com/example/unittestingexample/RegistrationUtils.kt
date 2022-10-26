package com.example.unittestingexample

object RegistrationUtils {

    val existingUsers = listOf("dwika", "bagus", "putra", "joni")

    fun validate(
        username: String,
        password: String,
        email: String,
    ): Boolean{
        if(username.isEmpty() || password.isEmpty() || email.isEmpty())
            return false
        if(password.length < 6 || password.length > 50)
            return false
        if(username in existingUsers)
            return false
        return true
    }
}