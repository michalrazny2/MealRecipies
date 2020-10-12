package com.example.mealrecipies.ui.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mealrecipies.BaseViewModel
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.repositories.MealRepository

class HomeViewModel(application: Application) : BaseViewModel() {

    var localMealList : LiveData<List<Meal>>
        get() = mealRepository.localMeals

    val mealRepository : MealRepository = MealRepository.getInstance(application.applicationContext)

    init{
        this.localMealList = mealRepository.getMealLiveData()

        setUpObserversViewModel()
    }

    fun getMealLiveData() = localMealList

    // Todo: initialization of observers- observing mealRepository.localMealList z this.localMealList
    fun setUpObserversViewModel(){
        // Observing localMeals in Meal Repository:
        mealRepository.localMeals.observeForever {
            Observer<LiveData<List<Meal>>>{
                localMealList= it
            }
        }
    }


//    val localMealList: ArrayList<Meal> = listOf(
//        Meal("1", "Italia", "Vege"),
//        Meal("2", "Italia", "Meat"),
//        Meal(), //naive data
//        Meal()
//    )
}