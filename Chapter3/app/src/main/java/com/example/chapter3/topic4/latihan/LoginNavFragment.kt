package com.example.chapter3.topic4.latihan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.chapter3.R
import kotlinx.android.synthetic.main.fragment_login_nav.*
import kotlinx.android.synthetic.main.fragment_login_nav.etPasswordRegister
import kotlinx.android.synthetic.main.fragment_register_nav.*


class LoginNavFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_nav, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userName = arguments?.getString("user_name")
        val password = arguments?.getString("password")

        if(userName != null && password != null){
            etUsername.setText(userName)
            etPasswordRegister.setText(password)
        }

        btnLogin.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("user_name", etUsername.text.toString())
            bundle.putString("password", etPasswordRegister.text.toString())
            Navigation.findNavController(view).navigate(R.id.action_loginNavFragment_to_homeNavFragment, bundle)
        }
        tvForgetPass.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginNavFragment_to_forgetPassNavFragment)
        }
        tvRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginNavFragment_to_registerNavFragment)
        }
        fabContact.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginNavFragment_to_contactNavFragment)
        }
        fabHelp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginNavFragment_to_helpNavFragment)
        }
    }
}