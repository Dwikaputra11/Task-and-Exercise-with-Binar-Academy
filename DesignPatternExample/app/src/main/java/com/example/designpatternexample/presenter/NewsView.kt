package com.example.designpatternexample.presenter

import com.example.designpatternexample.model.CarResponseItem

interface NewsView {

    fun onSuccess(pesan: String, list: List<CarResponseItem>)
    fun onError(pesan: String)
}