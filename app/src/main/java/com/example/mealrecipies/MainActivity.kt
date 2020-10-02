package com.example.mealrecipies

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mealrecipies.api.ApiClient
import com.example.mealrecipies.database.AppDatabase
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.models.MealApiResponse
import com.example.mealrecipies.repositories.MealRepository
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val db = AppDatabase.getAppDataBase(context = this)
        val mealDao = db?.mealDao()

//        Thread{
//            val meal1 = Meal("1", "Italia", "Vege")
//            val meal2 = Meal("2", "Italia", "Meat")
//
//            mealDao?.saveMeal(meal1)
//            mealDao?.saveMeal(meal2)
//        }.start()

//        val httpClient = OkHttpClient
//            .Builder()
//            .addInterceptor(HttpLoggingInterceptor()
//                .setLevel(HttpLoggingInterceptor.Level.BODY))
//            .build()
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl(resources.getString(R.string.BASE_URL))
//            .addConverterFactory(GsonConverterFactory.create())
////            .client(httpClient)
//            .build()


    }

}