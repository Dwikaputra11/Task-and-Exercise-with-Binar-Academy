package com.example.latihandatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.latihandatabinding.data.News
import com.example.latihandatabinding.databinding.FragmentDetailNewsBinding

class DetailNewsFragment : Fragment() {

    private lateinit var binding: FragmentDetailNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailNewsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val newsContent = arguments?.getParcelable<News>("news_detail") as News
        binding.ivNewsDetail.setImageResource(newsContent.image)
        binding.tvDateDetail.text = newsContent.date
        binding.tvTitleDetail.text = newsContent.title
        binding.tvContentDetail.text = newsContent.content
        binding.tvEditorDetail.text = newsContent.editor
    }

}