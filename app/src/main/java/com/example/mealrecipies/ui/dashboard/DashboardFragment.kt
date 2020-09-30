package com.example.mealrecipies.ui.dashboard

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
import com.example.mealrecipies.api.ApiService
import com.example.mealrecipies.models.MealApiResponse
import com.jakewharton.rxbinding4.view.clicks
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_dashboard.*
import retrofit2.Call
import retrofit2.Retrofit

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
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
        recyclerViewSearch.layoutManager = LinearLayoutManager(context)
        recyclerViewSearch.adapter = MealRecyclerViewAdapter(dashboardViewModel.mealList)
    }
}