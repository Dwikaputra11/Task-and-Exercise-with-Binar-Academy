package com.example.depedencyinjectionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.depedencyinjectionexample.adapter.MakeUpAdapter
import com.example.depedencyinjectionexample.databinding.ActivityMainBinding
import com.example.depedencyinjectionexample.viewmodel.MakeUpViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var makeUpVM: MakeUpViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        makeUpVM = ViewModelProvider(this)[MakeUpViewModel::class.java]

        setViews()
    }

    private fun setViews() {
        makeUpVM.callMakeupApi()
        makeUpVM.getAllMakeupData().observe(this){
            if(it != null){
                val adapter = MakeUpAdapter(it)
                binding.rvMakeUp.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvMakeUp.adapter = adapter
            }
        }
    }
}