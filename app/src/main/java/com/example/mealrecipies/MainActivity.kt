package com.example.mealrecipies

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.room.Room
import com.example.mealrecipies.api.ApiService
import com.example.mealrecipies.database.AppDatabase
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.models.MealApiResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val db = AppDatabase.getAppDataBase(context = this)
        val mealDao = db?.mealDao()

        Thread{
            val meal1 = Meal("1", "Italia", "Vege")
            val meal2 = Meal("2", "Italia", "Meat")

            mealDao?.saveMeal(meal1)
            mealDao?.saveMeal(meal2)
        }.start()


        val retrofit = Retrofit.Builder()
            .baseUrl(resources.getString(R.string.BASE_URL))
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(ApiService::class.java)

        val call : Call<Meal> = apiService.getMealsById("52772")

        call.enqueue(object: Callback<Meal>{
            override fun onResponse(call: Call<Meal>, response: Response<Meal>) {
                val meal = response.body()

                Log.i("TAG", meal?.strArea.toString())
            }

            override fun onFailure(call: Call<Meal>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }


    companion object{

    }
}