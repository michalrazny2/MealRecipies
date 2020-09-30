package com.example.mealrecipies.api

import com.example.mealrecipies.models.MealApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    // Get meals by name
    @GET("search.php?s={mealName}")
    fun getMealsByName() : Call<MealApiResponse>
    // Get meals by first letter
    @GET()
    fun getMealsByFirstLetter() : Call<MealApiResponse>
    // Get meals by ID
    @GET()
    fun getMealsById() : Call<MealApiResponse>
    // Get meals by Categoriesg
}