package com.example.mealrecipies.ui.recipe

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.mealrecipies.BaseViewModel
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.repositories.MealRepository

class RecipeViewModel(application: Application) : BaseViewModel() {

    val mealRepository : MealRepository = MealRepository.getInstance(application.applicationContext)

//    lateinit var meal : LiveData<Meal>

    fun saveRecipe(meal: Meal?){
        mealRepository.saveMeal(meal)
    }

}