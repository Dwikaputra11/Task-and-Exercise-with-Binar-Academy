package com.example.unittestingexample

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class RegistrationUtilsTest {

    @Test
    fun validate() {
    }

    @Before
    fun setUp(){

    }

    @Test
    fun registrationSuccess_true(){
        val result = RegistrationUtils.validate("asdasd", "kdjflaaks", "23432")
        assertEquals("registration_true", result, true)
    }
    @Test
    fun usernameEmpty_false(){
        val result = RegistrationUtils.validate("", "kdjflaaks", "23432")
        assertEquals("username_empty", result, false)
    }
    @Test
    fun passwordEmpty_false(){
        val result = RegistrationUtils.validate("asd", "", "23432")
        assertEquals("password_empty", result, false)
    }
    @Test
    fun emailEmpty_false(){
        val result = RegistrationUtils.validate("asd", "kdjflaaks", "")
        assertEquals("email_empty", result, false)
    }
    @Test
    fun passwordLengthBelow6_false(){
        val result = RegistrationUtils.validate("asd", "kdj", "asdasd")
        assertEquals("password_length_below_six", result, false)
    }
    @Test
    fun passwordLengthAbove50_false(){
        val str = "di".repeat(27)
        val result = RegistrationUtils.validate("asd", "kdj", str)
        assertEquals("password_length_above_fifty", result, false)
    }
    @Test
    fun usernameAlreadyExist_false(){
        val username = "dwika"
        val exist = username in RegistrationUtils.existingUsers
        assertEquals("username_already_exist", !exist, false)
    }
}