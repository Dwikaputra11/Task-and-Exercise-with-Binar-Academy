package com.example.chapter3.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.chapter3.R
import com.example.chapter3.databinding.ActivityGojekBinding

class GojekActivity : AppCompatActivity() {
    lateinit var binding: ActivityGojekBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGojekBinding.inflate(layoutInflater)
        setContentView(binding.root)

        changeFragment(HomeFragment())

        binding.bottomNav.setOnItemSelectedListener setOnItemReselectedListener@{
            when(it.itemId){
                R.id.menu_home -> {
                    changeFragment(HomeFragment())
                    return@setOnItemReselectedListener true
                }
                R.id.menu_chat ->{
                    changeFragment(ChatFragment())
                    return@setOnItemReselectedListener true
                }
                R.id.menu_promo ->{
                    changeFragment(PromoFragment())
                    return@setOnItemReselectedListener true
                }
                R.id.menu_profile ->{
                    changeFragment(ProfileFragment())
                    return@setOnItemReselectedListener true
                }

                else -> return@setOnItemReselectedListener false
            }
        }
    }

    fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fr_container, fragment)
            .commit()
    }
}