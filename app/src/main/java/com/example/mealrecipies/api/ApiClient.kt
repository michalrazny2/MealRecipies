package com.example.mealrecipies.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiClient {

    init {
        // todo: this one will be replaced with dependency injection
        val okHttpClient = OkHttpClient().newBuilder().connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .build();
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        mApiServices = retrofit.create(ApiService::class.java)
    }

    fun getApiService() = mApiServices


    companion object {
        private val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"
        private lateinit var mApiServices: ApiService
        private var mInstance: ApiClient? = null
        fun getInstance(): ApiClient {
            if (mInstance == null) {
                synchronized(this) {
                    mInstance = ApiClient()
                }
            }
            return mInstance!!
        }
    }
}