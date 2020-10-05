package com.example.mealrecipies.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mealrecipies.HomeViewModelFactory
import com.example.mealrecipies.R
import com.example.mealrecipies.adapter.MealRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private lateinit var mealAdapter : MealRecyclerViewAdapter
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        homeViewModel = ViewModelProvider(this, HomeViewModelFactory(this.requireActivity().application))
            .get(HomeViewModel::class.java)

        mealAdapter = MealRecyclerViewAdapter(homeViewModel.localMealList)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setUpRecyclerView()
        setUpObserversView()
    }

    override fun onStop() {
        super.onStop()
    }

    // TODO: observers initialization <?>
    private fun setUpObserversView() {
        // Todo: observing homeViewModel.localMealList from recyclerView
        homeViewModel.localMealList.observe(viewLifecycleOwner , Observer{
            mealAdapter.notifyDataSetChanged() // todo: setData?
        })

    }

    private fun setUpRecyclerView() {
        recyclerViewLocal.layoutManager = LinearLayoutManager(context)
        recyclerViewLocal.adapter = mealAdapter
    }
}