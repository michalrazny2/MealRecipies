package com.example.mealrecipies.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.mealrecipies.database.AppDatabase
import com.example.mealrecipies.database.MealDao
import com.example.mealrecipies.models.Meal
import java.util.concurrent.Executors

class MealRepository private constructor(context: Context) {

    var meals: LiveData<List<Meal>>
    private val database: AppDatabase? = AppDatabase.INSTANCE
    private val executor = Executors.newSingleThreadExecutor()

    private val allMeals: LiveData<List<Meal>>
        get() = this.database!!.mealDao().getAllMeals()

    init{
        this.meals = allMeals
    }
    fun saveMeal(meal: Meal){
        executor.execute { database!!.mealDao().saveMeal(meal) }
    }

    companion object {

        private var ourInstance: MealRepository? = null

        fun getInstance(context: Context): MealRepository {
            if (ourInstance == null) {
                ourInstance = MealRepository(context)
            }
            return ourInstance!!
        }
    }
}