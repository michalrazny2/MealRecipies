package com.example.mealrecipies.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mealrecipies.models.Meal

@Database(entities = [Meal::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun mealDao(): MealDao

    companion object{
        var INSTANCE: AppDatabase? = null

        fun getAppDataBase(context: Context): AppDatabase? {
            if (INSTANCE == null){
                synchronized(AppDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "myDB")
                                    .build()
                }
            }
            return INSTANCE
        }

        fun destroyDataBase(){
            INSTANCE = null
        }
    }

}