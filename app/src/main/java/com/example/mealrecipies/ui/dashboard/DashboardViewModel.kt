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

    var remoteMealList : LiveData<List<Meal>>
    private val mealRepository : MealRepository = MealRepository.getInstance(application.applicationContext)

    init{
        this.remoteMealList = mealRepository.getRemoteLiveData()
    }

    // Todo: initialization of observers- observing mealRepository.remoteMealList z this.remoteMealList
    fun setUpObserversViewModel(){
        mealRepository.remoteMeals.observeForever(Observer{// todo: lifecycle owner zamiast this?
            Log.i("REMOTE_MEALS_REPOSITORY" , "Meals changed")
            // todo: zmiana listy przechowywanej w LiveData
        })

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