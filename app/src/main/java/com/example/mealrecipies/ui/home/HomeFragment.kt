package com.example.mealrecipies.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mealrecipies.R
import com.example.mealrecipies.adapter.MealRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setUpRecyclerView()
    }

    override fun onStop() {
        super.onStop()
    }

    private fun setUpRecyclerView() {
        recyclerViewLocal.layoutManager = LinearLayoutManager(context)
        recyclerViewLocal.adapter = MealRecyclerViewAdapter(homeViewModel.localMealList)
    }
}