package com.example.mealrecipies.ViewModelTests

import android.app.Application
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

class DashboardViewModelTest {

//   todo: inicjalizacja LiveData var remoteMealList : LiveData<List<Meal>> = LiveData()
    lateinit var mApplication : Application

    @Before
    fun before(){
        mApplication = mock(Application::class.java)
//        mealRepository = MealRepository.getInstance(mApplication.applicationContext)

    }

    @Test
    fun getMealsTest(){
        // Todo: test DashboardViewModel getters
        //  with given MealRepository remote LiveData<?>
    }

    @Test
    fun observerTest(){
        // Todo: test of ViewModel's observers (?)
    }


}