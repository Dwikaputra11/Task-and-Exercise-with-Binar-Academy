package com.example.fileprocessingexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fileprocessingexample.Utils.Utils
import com.example.fileprocessingexample.databinding.ActivityPdfHandleBinding

class PdfHandleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfHandleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfHandleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            buttonWebView.setOnClickListener {
                startActivity(Intent(this@PdfHandleActivity,WebViewActivity::class.java ))
            }
            buttonAssets.setOnClickListener {
                val intent = Intent(this@PdfHandleActivity, PdfViewActivity::class.java)
                intent.putExtra(Utils.viewType, Utils.assets)
                startActivity(intent)
            }
            buttonInternet.setOnClickListener {
                val intent = Intent(this@PdfHandleActivity, PdfViewActivity::class.java)
                intent.putExtra(Utils.viewType, Utils.internet)
                startActivity(intent)
            }
            buttonStorage.setOnClickListener {
                val intent = Intent(this@PdfHandleActivity, PdfViewActivity::class.java)
                intent.putExtra(Utils.viewType, Utils.storage)
                startActivity(intent)
            }
        }

    }
}