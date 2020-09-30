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
        this.localMealList = this.mealRepository.meals
    }

    // todo: mealList to be changed on LiveData, content taken from Room database
//    val localMealList: ArrayList<Meal> = arrayListOf(
//        Meal("1", "Italia", "Vege"),
//        Meal("2", "Italia", "Meat"),
//        Meal(), //naive data
//        Meal()
//    )
}