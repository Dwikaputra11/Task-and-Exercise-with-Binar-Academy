package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.ActivityUsingViewModelBinding

class UsingViewModel : AppCompatActivity() {

    lateinit var bind: ActivityUsingViewModelBinding
    lateinit var viewModel: ViewModelExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityUsingViewModelBinding.inflate(layoutInflater)
        setContentView(bind.root)

        // call the ViewModelClass for this activity
        viewModel = ViewModelProvider(this)[ViewModelExample::class.java]
        bind.tvHasil.text = viewModel.hasil.toString()

        bind.btnHitungVolume.setOnClickListener {
            var pj = bind.etPanjang.text.toString().toInt()
            var lb = bind.etLebar.text.toString().toInt()
            var tg = bind.etTinggi.text.toString().toInt()
            
            // get access method from view model class after initiate the view model
            viewModel.hitungData(panjang = pj, lebar = lb, tinggi = tg)
            bind.tvHasil.text = viewModel.hasil.toString()
        }
    }

}