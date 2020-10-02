package com.example.mealrecipies.api

import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.models.MealApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    // Get meals by name
    @GET("search.php")
    fun getMealsByName(@Query("s") name : String) : Call<MealApiResponse>
    // todo: @Query + jakas tam litera


    // Get meals by first letter
    @GET("search.php")
    fun getMealsByFirstLetter(@Query("f") letter : String) : Call<List<Meal>>

    // Get meals by ID
    @GET("lookup.php")     //?i={id}
    fun getMealsById(@Query("i") id: String) : Call<List<Meal>>

    // Get meals by Categories
}