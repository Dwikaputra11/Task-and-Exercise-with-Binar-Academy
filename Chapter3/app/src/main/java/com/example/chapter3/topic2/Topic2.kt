package com.example.chapter3.topic2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3.data.PersonParcelable
import com.example.chapter3.data.PersonSerializable
import com.example.chapter3.databinding.ActivityTopic2Binding

class Topic2 : AppCompatActivity() {
    /// INTENT, BUNDLE, PARCELABLE, SERIALIZABLE
    lateinit var binding: ActivityTopic2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopic2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBundle.setOnClickListener {
            startActivity(Intent(this,BundleExam::class.java))
        }
        binding.btnIntent.setOnClickListener {
            startActivity(Intent(this,IntentExam::class.java))
        }
        binding.btnParcelable.setOnClickListener {
            setParcelableData()
        }
        binding.btnSerializable.setOnClickListener {
            setSerializableData()
        }
    }

    private fun setParcelableData(){
        val intent = Intent(this, SerialParcel::class.java)
        var dataPerson = PersonParcelable(name = "Dwika", age = 20, city = "Denpasar")
        intent.putExtra("data_person", dataPerson)
        intent.putExtra("id", "parcel")
        startActivity(intent)
    }

    fun setSerializableData(){
        val intent = Intent(this, SerialParcel::class.java)
        var dataPerson = PersonSerializable(name = "Dwika", age = 20, city = "Denpasar")
        intent.putExtra("data_person", dataPerson)
        intent.putExtra("id", "serializable")
        startActivity(intent)
    }
}