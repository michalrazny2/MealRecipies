package com.example.mealrecipies.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mealrecipies.database.AppDatabase
import com.example.mealrecipies.database.MealDao
import com.example.mealrecipies.models.Meal
import java.util.concurrent.Executors

class MealRepository private constructor(val context: Context) {

    var localMeals: MutableLiveData<List<Meal>>

    var remoteMeals: MutableLiveData<List<Meal>>

    private val database: AppDatabase? = AppDatabase.INSTANCE
    private val executor = Executors.newSingleThreadExecutor()

    private val allLocalMeals: LiveData<List<Meal>>
        get() = this.database!!.mealDao().getAllMeals()

    init{
        //todo: jakos wypadaloby wsadzic tu wartosci z lokalnej bazy danych:
        // czy napewno w Dao funkcja getAllMeals ma zwracać LiveData a nie liste?
        localMeals = MutableLiveData<List<Meal>>()

        localMeals.value = listOf(
            Meal("1", "Italia", "Vege"), //naive data
            Meal("2", "Italia", "Meat"),
            Meal(),
            Meal())

        remoteMeals = MutableLiveData<List<Meal>>()

        remoteMeals.value = listOf(
            Meal("1", "Germany", "Vege"), //naive data
            Meal("2", "Poland", "Meat"),
            Meal(),
            Meal())
    }

    fun saveMeal(meal: Meal){
        executor.execute { database!!.mealDao().saveMeal(meal) }
    }

    fun getMealLiveData() = localMeals
    fun getRemoteLiveData() = remoteMeals

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