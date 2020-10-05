package com.example.mealrecipies.ui.home

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mealrecipies.BaseViewModel
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.repositories.MealRepository
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors

class HomeViewModel(application: Application) : BaseViewModel() {

    var localMealList : LiveData<List<Meal>>
//        get() {viewModelScope.launch { // todo: this shit does not work
//            mealRepository.loadMeals()
//            } }
//        get() = Observable.just(mealRepository.database)
//            .subscribeOn(Schedulers.io())
//            .subscribe { db -> // database operation
//                 mealRepository.loadMeals() }

    private val mealRepository : MealRepository = MealRepository.getInstance(application.applicationContext)

    init{
//        this.localMealList = LiveData()
        this.localMealList = mealRepository.getMealLiveData()

    }

    fun getMealLiveData() = localMealList

    // Todo: initialization of observers- observing mealRepository.remoteMealList z this.remoteMealList
    fun setUpObserversViewModel(){

    }

//    val localMealList: ArrayList<Meal> = listOf(
//        Meal("1", "Italia", "Vege"),
//        Meal("2", "Italia", "Meat"),
//        Meal(), //naive data
//        Meal()
//    )
}