package com.example.mealrecipies.repositories

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.mealrecipies.api.ApiClient
import com.example.mealrecipies.database.AppDatabase
import com.example.mealrecipies.database.MealDao
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.models.MealApiResponse
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Executors

class MealRepository private constructor(val context: Context) {

    var localMeals: MutableLiveData<List<Meal>>
    var remoteMeals: MutableLiveData<List<Meal>> // todo: btw LiveData in repository is Anti-pattern

    val database: AppDatabase? = AppDatabase.INSTANCE
    private val executor = Executors.newSingleThreadExecutor()

    private val mealDao : MealDao? = AppDatabase.getAppDataBase(context)?.mealDao()

    private lateinit var listMealCall : Call<MealApiResponse>

    init{
        // Todo: Naive local/database code to be deleted later on
        val meal1 = Meal("7", "Gerwry", "Vewrege")
        val meal2 = Meal("8", "Powerria", "Mewerat")
        saveMeal(meal1)
        Log.i("SAVED_TO_DATABASE", meal1.idMeal.toString())

        //////

        GlobalScope.launch {
            localMeals = loadMeals()
            Log.i("LOCAL_MEALS_LOADED", localMeals.value.toString())
        }

        remoteMeals = MutableLiveData<List<Meal>>()
        localMeals = MutableLiveData<List<Meal>>()

        // Todo: Naive remote data to be deleted later on
        remoteMeals.value = listOf(
            Meal("1", "Germany", "Vege"), //naive data
            Meal("2", "Poland", "Vege"),
            Meal("3", "Poland", "Vege"),
            Meal("4", "Poland", "Vege"))

        localMeals.value = listOf(
            Meal("3", "Germany", "Vege"),
            Meal("5", "Germany", "Vege"),
            Meal("4", "Germany", "Vege"),
            Meal("6", "Germany", "Vege")
        )

        val apiClient = ApiClient()

        // Todo: Naive API call to be deleted later on
        val call : Call<MealApiResponse> = apiClient.getApiService().getMealsByName("a")

        call.enqueue(object : Callback<MealApiResponse> {
            override fun onResponse(
                call: Call<MealApiResponse>,
                response: Response<MealApiResponse>
            ) {
                val meals = response.body()
                Log.i("CALL_MAIN_ACTIVITY", meals.toString())
                remoteMeals.value = meals?.meals as List<Meal>?
            }

            override fun onFailure(call: Call<MealApiResponse>, t: Throwable) {
                Log.e("CALL_MAIN_ACTIVITY", "Call failed")
            }
        })
        ////
        databaseObserversInitialization()
        // Todo: Just checking if observer works correctly (To be deleted):
        saveMeal(meal2)
        Log.i("SAVED_TO_DATABASE2", meal2.idMeal.toString())
    }

    fun databaseObserversInitialization(){
        // update of localMealList when local database changes
        database!!.mealDao().getAllMeals1().observeForever{
            Observer<MutableLiveData<List<Meal>>>{
                localMeals = it
            }
        }

    }

    suspend fun loadMeals() : MutableLiveData<List<Meal>>{
        var list : List<Meal> = listOf()
        list = database!!.mealDao().getAllMeals()
        return MutableLiveData(list)
    }

    fun saveMeal(meal: Meal){
        GlobalScope.launch { database?.mealDao()?.saveMeal(meal) }
    }

    fun deleteMeal(meal : Meal){
        GlobalScope.launch { database?.mealDao()?.deleteMeal(meal) }
    }

    fun getMealLiveData() = localMeals
    fun getRemoteLiveData() = remoteMeals

    // Retrofit function calls,
    fun getMealsName(name : String): MutableLiveData<List<Meal>>{
        listMealCall = ApiClient.getInstance().getApiService().getMealsByName(name)
        listMealCall.enqueue(object : Callback<MealApiResponse>{
            override fun onResponse(call: Call<MealApiResponse>, response: Response<MealApiResponse>) {
                val meals = response.body()
                remoteMeals.value = meals?.meals as List<Meal>?
            }

            override fun onFailure(call: Call<MealApiResponse>, t: Throwable) {
                remoteMeals.value = emptyList()
                Log.e("GET_MEAL_BY_ID", "Failed call")
            }
        })
        return remoteMeals
    }

    fun getMealsLetter(letter : String): MutableLiveData<List<Meal>>{
        listMealCall = ApiClient.getInstance().getApiService().getMealsByFirstLetter(letter)
        listMealCall.enqueue(object : Callback<MealApiResponse>{
            override fun onResponse(call: Call<MealApiResponse>, response: Response<MealApiResponse>) {
                val meals = response.body()
                remoteMeals.value = meals?.meals as List<Meal>?
            }

            override fun onFailure(call: Call<MealApiResponse>, t: Throwable) {
                remoteMeals.value = emptyList()
                Log.e("GET_MEAL_BY_ID", "Failed call")
            }
        })
        return remoteMeals
    }

    fun getMealsId(id : String): MutableLiveData<List<Meal>>{
        listMealCall = ApiClient.getInstance().getApiService().getMealsById(id)
        listMealCall.enqueue(object : Callback<MealApiResponse>{
            override fun onResponse(call: Call<MealApiResponse>, response: Response<MealApiResponse>) {
                val meals = response.body()
                remoteMeals.value = meals?.meals as List<Meal>?
            }

            override fun onFailure(call: Call<MealApiResponse>, t: Throwable) {
                remoteMeals.value = emptyList()
                Log.e("GET_MEAL_BY_ID", "Failed call")
            }
        })
        return remoteMeals
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