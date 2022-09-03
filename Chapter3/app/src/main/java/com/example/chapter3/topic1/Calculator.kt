package com.example.chapter3.topic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.chapter3.R

class Calculator : AppCompatActivity() {
    lateinit var etNumOne: EditText
    lateinit var etNumTwo: EditText
    lateinit var btnCalculate: Button
    lateinit var btnReset: Button
    lateinit var tvResult: TextView
    lateinit var btnNextPage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        config()
        btnCalculate.setOnClickListener {
            calculate()
        }
        btnReset.setOnClickListener {
            tvResult.text = "Result: "
            etNumOne.text.clear()
            etNumTwo.text.clear()
        }
        btnNextPage.setOnClickListener {
            val intent = Intent(this, BMICalculator::class.java)
            startActivity(intent)
        }
    }
    private fun config(){
        etNumOne = findViewById(R.id.et_num_one)
        etNumTwo = findViewById(R.id.et_num_two)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)
        btnReset = findViewById(R.id.btn_reset)
        btnNextPage = findViewById(R.id.btn_next)
    }
    private fun calculate(){
        var numberOne:Int = etNumOne.text.toString().toInt()
        var numberTwo:Int = etNumTwo.text.toString().toInt()
        tvResult.text = "Result: ${numberOne + numberTwo}"
    }
}