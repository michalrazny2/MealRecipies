package com.example.mealrecipies.ui.dashboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mealrecipies.DashboardViewModelFactory
import com.example.mealrecipies.HomeViewModelFactory
import com.example.mealrecipies.R
import com.example.mealrecipies.adapter.MealRecyclerViewAdapter
import com.example.mealrecipies.api.ApiService
import com.example.mealrecipies.models.MealApiResponse
import com.example.mealrecipies.ui.home.HomeViewModel
import com.jakewharton.rxbinding4.view.clicks
import com.jakewharton.rxbinding4.widget.queryTextChanges
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_dashboard.*
import retrofit2.Call
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var mealAdapter : MealRecyclerViewAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        dashboardViewModel = ViewModelProvider(this, DashboardViewModelFactory(this.requireActivity().application))
            .get(DashboardViewModel::class.java)

        mealAdapter = MealRecyclerViewAdapter(dashboardViewModel.remoteMealList)

        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
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

    private fun setUpObserversView() {
        // obserwowanie zmiany tekstu na searchView, todo: nie dziala, wywala Throwable w subsribe
        searchView.queryTextChanges().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .debounce(300, TimeUnit.MILLISECONDS)
            .subscribe(object : Consumer<CharSequence> {
                override fun accept(t: CharSequence?) {
                    dashboardViewModel.getMealsByName(t.toString())
                    Log.i("CALL_MADE", "queryTextChanges")
                }
            }, object : Consumer<Throwable>{
                override fun accept(t: Throwable?) {
                    Log.e("OBSERVER_SET_UP", "Last log went wrong")
                }

            })


        // obserwowanie kliknięcia na item recyclerView?

        // Todo: observiing remoteMealList changes in dashboardViewModel


    }

    private fun setUpRecyclerView() {
        recyclerViewSearch.layoutManager = LinearLayoutManager(context)
        recyclerViewSearch.adapter = mealAdapter
    }
}