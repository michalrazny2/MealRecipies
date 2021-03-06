package com.example.mealrecipies.ui.dashboard

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.mealrecipies.BaseViewModel
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.repositories.MealRepository

class DashboardViewModel(application : Application) : BaseViewModel() {

    val mealRepository : MealRepository = MealRepository.getInstance(application.applicationContext)

    var remoteMealList : LiveData<List<Meal>>
        get() = mealRepository.remoteMeals

    init{
        this.remoteMealList = mealRepository.getRemoteLiveData()
        setUpObserversViewModel()
    }

    fun setUpObserversViewModel(){
        mealRepository.remoteMeals.observeForever{ Observer<LiveData<List<Meal>>>{
            remoteMealList = it
            Log.i("REMOTE_MEALS_REPOSITORY" , "Meals changed")
        }}

    }

    fun getMealById(id : String) : MutableLiveData<List<Meal>>{
        return mealRepository.getMealsName(id)
    }

    fun getMealsByName(name : String) : MutableLiveData<List<Meal>>{
        return mealRepository.getMealsName(name)
    }

    fun getMealsByLetter(letter: String) : MutableLiveData<List<Meal>>{
        return mealRepository.getMealsName(letter)
    }


}