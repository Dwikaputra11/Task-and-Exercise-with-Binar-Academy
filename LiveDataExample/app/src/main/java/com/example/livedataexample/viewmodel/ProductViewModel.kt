package com.example.livedataexample.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.livedataexample.R
import com.example.livedataexample.data.Product

class ProductViewModel:ViewModel() {
    // declaration the data
    private val productList = arrayListOf<Product>(
        Product(id = 1, name = "Sabun", img = R.mipmap.ic_launcher_round, stock = 20,"A Soap", price = 7),
        Product(id = 2, name = "Sabun", img = R.mipmap.ic_launcher_round, stock = 20,"A Soap", price = 7),
        Product(id = 3, name = "Sabun", img = R.mipmap.ic_launcher_round, stock = 20,"A Soap", price = 7),
    )

    // set live data
    var productListLiveData: MutableLiveData<List<Product>> = MutableLiveData()

    // set the live data in activity
    fun setLiveData(){
        productListLiveData.value = productList
    }

    fun changeData(pos: Int, product: Product){
        productList[pos] = product
        setLiveData()
        Log.d(javaClass.simpleName, "changeData: Data Change")
    }
}