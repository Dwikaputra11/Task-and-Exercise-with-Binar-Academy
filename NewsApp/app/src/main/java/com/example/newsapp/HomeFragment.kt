package com.example.newsapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.newsapp.adapter.HeadlineViewPager
import com.example.newsapp.adapter.NewsAdapter
import com.example.newsapp.data.News
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    lateinit var newsAdapter: NewsAdapter
    lateinit var newsVM : NewsViewModel
    lateinit var viewPagerAdapter: HeadlineViewPager
    lateinit var viewParent: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setView()
        viewParent = view
        newsVM = ViewModelProvider(this)[NewsViewModel::class.java]
        newsVM.getNewsData()
        newsVM.newsListLiveData.observe(viewLifecycleOwner, Observer {
            newsAdapter.setNewsData(it as ArrayList<News>)
        })
    }

    private fun setView(){
        viewPagerAdapter = HeadlineViewPager(requireContext())
        vpHeadline.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        vpHeadline.offscreenPageLimit = 3
        vpHeadline.adapter = viewPagerAdapter
        vpHeadline.setPageTransformer(MarginPageTransformer(50))
        vpHeadline.clipToPadding = false;
        vpHeadline.setPadding(10,10,10,0);
        dotsIndicator.attachTo(vpHeadline)
        newsAdapter = NewsAdapter(ArrayList())
        rvNews.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rvNews.adapter = newsAdapter
        newsAdapter.setOnItemClickListener(object : NewsAdapter.OnItemClickListener{
            override fun onItemClick(id: Int) {
                moveToContentNews(id)
            }
        })
    }

    fun moveToContentNews(id: Int){
        val newsContent = newsVM.newsListLiveData.value?.first {
            it.id == id
        } as News
        val bundle = Bundle()
        bundle.putParcelable(DetailNewsFragment.NEWS_CONTENT, newsContent)
        Navigation.findNavController(viewParent).navigate(R.id.action_homeFragment_to_detailNewsFragment,bundle)
    }
}