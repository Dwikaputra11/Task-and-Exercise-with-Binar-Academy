package com.example.chapter3.topic4.latihan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.chapter3.R
import kotlinx.android.synthetic.main.fragment_home_nav.*

class HomeNavFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_nav, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val username = arguments?.getString("user_name")
        tvGreet.text = "Hello, $username"
        val bundle = Bundle()
        bundle.putString("user_name", username)

        btnHitung.setOnClickListener {
            bundle.putString("birth_year",etInputBirthYear.text.toString())
            Navigation.findNavController(view).navigate(R.id.action_homeNavFragment_to_calculateFragment,bundle)
        }

        fabProfile.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_homeNavFragment_to_profileNavFragment,bundle)
        }
//        Toast.makeText(context, tvGreet.text.toString(), Toast.LENGTH_LONG).show()
    }

}