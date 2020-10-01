package com.example.mealrecipies.ui.dashboard

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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

    // TODO: methods to send api requests from viewModel layer

}