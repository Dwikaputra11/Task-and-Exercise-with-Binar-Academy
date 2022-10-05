package com.example.uidesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import com.example.uidesign.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIndo.setOnClickListener {
            setLocale("id")
        }
        binding.btnEnglish.setOnClickListener {
            setLocale("en")
        }

        binding.btnNextPage.setOnClickListener {
            startActivity(Intent(this, TranslateActivity::class.java))
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        val item = menu?.findItem(R.id.app_bar_switch)
        item?.setActionView(R.layout.switch_theme)

        val sw = menu?.findItem(R.id.app_bar_switch)?.actionView?.findViewById<SwitchCompat>(R.id.switchAB)
        sw?.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                Toast.makeText(this, "Checked", Toast.LENGTH_SHORT).show()
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
        return true
    }

    private fun setLocale(lang: String?) {
        val myLocale = lang?.let { Locale(it) }
        val res = resources
        val conf = res.configuration
        conf.locale = myLocale
        res.updateConfiguration(conf, res.displayMetrics)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}