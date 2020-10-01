package com.example.mealrecipies.repositories

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mealrecipies.api.ApiClient
import com.example.mealrecipies.database.AppDatabase
import com.example.mealrecipies.database.MealDao
import com.example.mealrecipies.models.Meal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Executors

class MealRepository private constructor(val context: Context) {

    var localMeals: MutableLiveData<List<Meal>>
    var remoteMeals: MutableLiveData<List<Meal>>

    private val database: AppDatabase? = AppDatabase.INSTANCE
    private val executor = Executors.newSingleThreadExecutor()

    private lateinit var listMealCall : Call<List<Meal>>

    init{
        //todo: jakos wypadaloby wsadzic tu wartosci z lokalnej bazy danych:
        // czy napewno w Dao funkcja getAllMeals ma zwracać LiveData a nie liste?
        val meal1 = Meal("3", "Germany", "Vege")
        val meal2 = Meal("4", "Polonia", "Meat")
        saveMeal(meal1)                                     // todo: zapisywanie w bazie danych cos nie hula za bardzo ;;
        Log.i("SAVED_TO_DATABASE", meal1.toString())
        saveMeal(meal2)
        Log.i("SAVED_TO_DATABASE2", meal2.toString())

        localMeals = MutableLiveData<List<Meal>>(loadMeals().value)
//        localMeals.postValue(listOf(
//            Meal("3", "Italia", "Vege"), //naive data
//            Meal("4", "Italia", "Meat")))

//        localMeals.value = listOf(
//            Meal("1", "Italia", "Vege"), //naive data
//            Meal("2", "Italia", "Meat"),
//            Meal(),
//            Meal())

        remoteMeals = MutableLiveData<List<Meal>>()

        remoteMeals.value = listOf(
            Meal("1", "Germany", "Vege"), //naive data
            Meal("2", "Poland", "Meat"),
            Meal("3", "Poland", "Meat"),
            Meal("4", "Poland", "Meat"))
    }

    fun loadMeals() : LiveData<List<Meal>>{ // TODO: this function should not be executed on mainThread
        return database!!.mealDao().getAllMeals()
//        executor.execute {  }
    }

    fun saveMeal(meal: Meal){
        executor.execute { database!!.mealDao().saveMeal(meal) }
    }

    fun deleteMeal(meal : Meal){
        executor.execute { database!!.mealDao().deleteMeal(meal) }
    }

    fun getMealLiveData() = localMeals
    fun getRemoteLiveData() = remoteMeals

    // Retrofit function calls
    fun getMealsName(name : String): MutableLiveData<List<Meal>>{
        listMealCall = ApiClient.getInstance().getApiService().getMealsByName(name)
        listMealCall.enqueue(object : Callback<List<Meal>>{
            override fun onResponse(call: Call<List<Meal>>, response: Response<List<Meal>>) {
                remoteMeals.value = response.body()
            }

            override fun onFailure(call: Call<List<Meal>>, t: Throwable) {
                remoteMeals.value = emptyList()
                Log.e("GET_MEAL_BY_ID", "Failed call")
            }
        })

        return remoteMeals
    }

    fun getMealsLetter(letter : String): MutableLiveData<List<Meal>>{
        listMealCall = ApiClient.getInstance().getApiService().getMealsByFirstLetter(letter)
        listMealCall.enqueue(object : Callback<List<Meal>>{
            override fun onResponse(call: Call<List<Meal>>, response: Response<List<Meal>>) {
                remoteMeals.value = response.body()
            }

            override fun onFailure(call: Call<List<Meal>>, t: Throwable) {
                remoteMeals.value = emptyList()
                Log.e("GET_MEAL_BY_ID", "Failed call")
            }
        })

        return remoteMeals
    }

    fun getMealsId(id : String): MutableLiveData<List<Meal>>{
        listMealCall = ApiClient.getInstance().getApiService().getMealsById(id)
        listMealCall.enqueue(object : Callback<List<Meal>>{
            override fun onResponse(call: Call<List<Meal>>, response: Response<List<Meal>>) {
                remoteMeals.value = response.body()
            }

            override fun onFailure(call: Call<List<Meal>>, t: Throwable) {
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