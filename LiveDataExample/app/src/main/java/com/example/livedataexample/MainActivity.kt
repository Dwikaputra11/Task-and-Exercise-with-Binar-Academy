package com.example.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.livedataexample.adapter.ProductAdapter
import com.example.livedataexample.data.Product
import com.example.livedataexample.viewmodel.ProductViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var rvProduct: RecyclerView
    private lateinit var productVM: ProductViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvProduct = findViewById(R.id.rvProduct)
        productVM = ViewModelProvider(this)[ProductViewModel::class.java]
        productVM.setLiveData()

        val adapter = ProductAdapter(ArrayList())
        productVM.productListLiveData.observe(this, Observer {
            Log.d(localClassName, "observe: Change Data")
            adapter.setProductList(it as ArrayList<Product>)
        })
        rvProduct.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rvProduct.adapter = adapter
        adapter.setOnItemClickListener(object : ProductAdapter.OnItemClickListener{
            override fun onItemClick(id: Int, pos: Int) {
                val product = Product(id = 4, name = "Shampo", img = R.mipmap.ic_launcher_round, stock = 40,"A Soap", price = 10)
                Log.d(localClassName, "onItemClick: set data")
                productVM.changeData(pos, product)
            }
        })

    }
}