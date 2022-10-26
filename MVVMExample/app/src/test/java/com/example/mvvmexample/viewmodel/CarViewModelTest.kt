package com.example.mvvmexample.viewmodel

import com.example.mvvmexample.api.ApiResponse
import com.example.mvvmexample.model.CarResponseItem
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class CarViewModelTest {

    lateinit var service: ApiResponse

    @Test
    fun getAllCar() {
    }

    @Test
    fun testGetAllCar() {
    }

    @Before
    fun setUp(){
        service = mockk()
    }


    @Test
    fun getAllCarTest(): Unit = runBlocking {
        val respAllCar = mockk<List<CarResponseItem>>()

        every {
            runBlocking {
                service.getCar()
            }
        }returns respAllCar

        val result = service.getCar()

        verify {
            runBlocking {
                service.getCar()
            }
        }

        assertEquals(result, respAllCar)
    }
}

