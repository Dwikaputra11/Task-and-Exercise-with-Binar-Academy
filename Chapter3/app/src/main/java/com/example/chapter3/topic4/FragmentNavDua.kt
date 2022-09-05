package com.example.chapter3.topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.chapter3.R
import kotlinx.android.synthetic.main.fragment_nav_dua.*

class fragmentNavDua : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnMoveTo3.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentNavDua_to_fragmentNavTiga)
        }
    }

}