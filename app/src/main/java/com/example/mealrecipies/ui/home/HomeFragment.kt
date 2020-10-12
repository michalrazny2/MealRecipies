package com.example.mealrecipies.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mealrecipies.HomeViewModelFactory
import com.example.mealrecipies.R
import com.example.mealrecipies.adapter.MealRecyclerViewAdapter
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.ui.recipe.RecipeActivity
import com.jakewharton.rxbinding4.view.clicks
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(), MealRecyclerViewAdapter.OnItemClicked {

    private lateinit var mealAdapter : MealRecyclerViewAdapter
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        homeViewModel = ViewModelProvider(this, HomeViewModelFactory(this.requireActivity().application))
            .get(HomeViewModel::class.java)

        mealAdapter = MealRecyclerViewAdapter(homeViewModel.localMealList, this)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setUpRecyclerView()
        setUpObserversView()


        // todo: just testing:
        homeViewModel.mealRepository.saveMeal(Meal("1", "wow", "wow"))

    }

    override fun onStop() {
        super.onStop()
    }

    // TODO: observers initialization <?>
    private fun setUpObserversView() {
        homeViewModel.localMealList.observe(viewLifecycleOwner , Observer{
            mealAdapter.notifyDataSetChanged() // todo: niby coś robi, ale zwraca dwa puste miejsca
        })

        // Todo: observing click on recyclerView item
//        recyclerViewLocal.clicks().observeOn(AndroidSchedulers.mainThread())
//            .subscribe()

    }

    private fun setUpRecyclerView() {
        recyclerViewLocal.layoutManager = LinearLayoutManager(context)
        recyclerViewLocal.adapter = mealAdapter
    }

    override fun startActivity(item: Meal?) {
        val intent = Intent(context, RecipeActivity::class.java)
        intent.putExtra("meal", item)
        context?.startActivity(intent)
    }


}