package com.example.mealrecipies.ui.dashboard

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mealrecipies.BaseViewModel
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.repositories.MealRepository

class DashboardViewModel(application : Application) : BaseViewModel() {

    var searchMealList : LiveData<List<Meal>>
    private val mealRepository : MealRepository = MealRepository.getInstance(application.applicationContext)

    init{
        this.searchMealList = this.mealRepository.meals
    }


    // todo: mealList to be changed on LiveData
    val mealList: ArrayList<Meal> = arrayListOf(Meal(), //naive data
                                        Meal(),
                                        Meal(),
                                        Meal())



}