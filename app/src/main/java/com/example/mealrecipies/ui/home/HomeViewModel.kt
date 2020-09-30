package com.example.mealrecipies.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mealrecipies.BaseViewModel
import com.example.mealrecipies.models.Meal

class HomeViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    // todo: mealList to be changed on LiveData
    val localMealList: ArrayList<Meal> = arrayListOf(
        Meal(), //naive data
        Meal("1", "Italia", "Vege"),
        Meal("2", "Italia", "Meat"),
        Meal()
    )
}