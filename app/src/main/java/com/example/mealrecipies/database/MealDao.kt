package com.example.mealrecipies.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*
import com.example.mealrecipies.models.Meal

@Dao
interface MealDao {

    @Query("SELECT * FROM meals")
    fun getAllMeals(): LiveData<List<Meal>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMeal(meal : Meal)

    @Delete
    fun deleteMeal(meal : Meal)
}