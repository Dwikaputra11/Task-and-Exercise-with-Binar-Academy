package com.example.latihandatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihandatabinding.adapter.NewsAdapter
import com.example.latihandatabinding.data.News
import com.example.latihandatabinding.databinding.FragmentNewsBinding
import com.example.latihandatabinding.viewmodel.NewsViewModel

class NewsFragment : Fragment() {

    private lateinit var binding: FragmentNewsBinding
    lateinit var viewParent: View
    private lateinit var newsVM:NewsViewModel
    private lateinit var adapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentNewsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewParent = view
        newsVM = ViewModelProvider(this)[NewsViewModel::class.java]
        newsVM.setLiveData()
        newsVM.newsListLiveData.observe(viewLifecycleOwner, Observer {
            adapter.setNewsData(it as ArrayList<News>)
        })
        adapter = NewsAdapter(ArrayList())
        binding.rvNewsList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvNewsList.adapter = adapter
        adapter.setOnItemClickListener(object : NewsAdapter.OnItemClickListener{
            override fun onItemClick(id: Int) {
                moveToDetail(id)
            }
        })
    }
    fun moveToDetail(id: Int){
        val newsContent = newsVM.newsListLiveData.value?.first{
            it.id == id
        }
        val bundle = Bundle()
        bundle.putParcelable("news_detail", newsContent)
        Navigation.findNavController(viewParent).navigate(R.id.action_newsFragment_to_detailNewsFragment, bundle)
    }
}