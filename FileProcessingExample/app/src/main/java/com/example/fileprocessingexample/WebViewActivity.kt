package com.example.fileprocessingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.fileprocessingexample.Utils.Utils
import com.example.fileprocessingexample.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            webView.webViewClient = WebViewClient()
            webView.settings.javaScriptEnabled = true
            webView.settings.displayZoomControls = true
            webView.loadUrl("https://docs.google.com/gview?embedded=true&url=${Utils.pdfUrl}")
        }
    }
}