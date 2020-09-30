package com.example.mealrecipies.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mealrecipies.BaseViewModel
import com.example.mealrecipies.models.Meal

class DashboardViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

    // todo: mealList to be changed on LiveData
    val mealList: ArrayList<Meal> = arrayListOf(Meal(), //naive data
                                        Meal(),
                                        Meal(),
                                        Meal())



}