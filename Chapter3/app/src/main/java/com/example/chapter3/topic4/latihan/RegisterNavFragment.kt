package com.example.chapter3.topic4.latihan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.chapter3.R
import kotlinx.android.synthetic.main.fragment_register_nav.*

class RegisterNavFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register_nav, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnRegister.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("user_name", etUsernameRegister.text.toString())
            bundle.putString("password", etPasswordRegister.text.toString())
            Navigation.findNavController(view).navigate(R.id.action_registerNavFragment_to_loginNavFragment, bundle)
        }
    }

}