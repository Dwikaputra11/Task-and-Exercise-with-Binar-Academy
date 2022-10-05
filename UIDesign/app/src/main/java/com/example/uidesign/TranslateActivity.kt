package com.example.uidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidesign.databinding.ActivityTranslateBinding
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions

class TranslateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTranslateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTranslateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var conditions = DownloadConditions.Builder()
            .requireWifi()
            .build()
        val translationConfigs = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.INDONESIAN)
            .setTargetLanguage(TranslateLanguage.ENGLISH)
            .build()
        val translator = Translation.getClient(translationConfigs)
        binding.btnTranslate.setOnClickListener {
            translator.translate(binding.etWord.text.toString())
                .addOnSuccessListener {
                    binding.tvWord.text = it
                }
                .addOnFailureListener{
                    it.printStackTrace()
                }
        }
    }
}