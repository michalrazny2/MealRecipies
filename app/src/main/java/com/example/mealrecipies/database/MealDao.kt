package com.example.mealrecipies.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*
import com.example.mealrecipies.models.Meal
import kotlinx.coroutines.flow.Flow

@Dao
interface MealDao {

//    @Query("SELECT * FROM meals")
//    suspend fun getAllMeals(): List<Meal> // multiple value request, using flow

    @Query("SELECT * FROM meals")
    suspend fun getAllMeals(): List<Meal> // not sure if this should be list or LiveData

    @Query("SELECT * FROM meals")
    fun getAllMeals1(): LiveData<List<Meal>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMeal(meal : Meal)

    @Delete
    fun deleteMeal(meal : Meal)
}