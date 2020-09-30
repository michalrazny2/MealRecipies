package com.example.mealrecipies.database

import androidx.room.*
import com.example.mealrecipies.models.Meal

@Dao
interface MealDao {

    @Query("SELECT * FROM meals")
    fun getAllMeals(): ArrayList<Meal>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMeal(meal : Meal)

    @Delete
    fun deleteMeal(meal : Meal)
}