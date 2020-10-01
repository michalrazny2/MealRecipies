package com.example.mealrecipies.ui.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mealrecipies.BaseViewModel
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.repositories.MealRepository

class HomeViewModel(application: Application) : BaseViewModel() {

    var localMealList : LiveData<List<Meal>>
    private val mealRepository : MealRepository = MealRepository.getInstance(application.applicationContext)

    init{
        this.localMealList = mealRepository.getMealLiveData()
    }

    fun getMealLiveData() = localMealList

//    val localMealList: ArrayList<Meal> = listOf(
//        Meal("1", "Italia", "Vege"),
//        Meal("2", "Italia", "Meat"),
//        Meal(), //naive data
//        Meal()
//    )
}