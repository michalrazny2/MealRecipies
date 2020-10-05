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
import com.example.mealrecipies.models.Meal
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

        dashboardViewModel.mealRepository.remoteMeals.value =
            listOf(
                Meal("1", "wow", "wow"),
                Meal("2", "wow", "wow")
            ) // todo: just testing
    }

    override fun onStop() {
        super.onStop()
    }

    private fun setUpObserversView() {
        // obserwowanie zmiany tekstu na searchView
        searchView.queryTextChanges()
            .observeOn(AndroidSchedulers.mainThread()) // todo: add some delay, I guess it crushes sometimes
            .subscribe(object : Consumer<CharSequence> {
                override fun accept(t: CharSequence?) {
                    dashboardViewModel.getMealsByName(t.toString())
                    Log.i("CALL_MADE", "queryTextChanges")
                }
            })

        dashboardViewModel.remoteMealList.observe(viewLifecycleOwner, Observer {
            mealAdapter.notifyDataSetChanged() // todo: Strange thing, works with api calls, does not work with normal value change <?>
        })

        // Todo: Observing recyclerView clicks
//        recyclerViewSearch.clicks().observeOn(AndroidSchedulers.mainThread())
//            .subscribe()

    }

    private fun setUpRecyclerView() {
        recyclerViewSearch.layoutManager = LinearLayoutManager(context)
        recyclerViewSearch.adapter = mealAdapter
    }
}