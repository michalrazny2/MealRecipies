package com.example.mealrecipies.models

import android.os.Parcel
import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("meals")
class MealApiResponse : Parcelable {
    @JsonProperty("meals")
    private var meals: List<Meal?>? = null

    @JsonIgnore
    private var additionalProperties: MutableMap<String, Any>? = HashMap()

    protected constructor(`in`: Parcel) {
        `in`.readList(meals!!, com.example.mealrecipies.models.Meal::class.java.getClassLoader())
        additionalProperties =
            `in`.readValue(MutableMap::class.java.classLoader) as MutableMap<String, Any>?
    }

    constructor() {}

    @JsonProperty("meals")
    fun getMeals(): List<Meal?>? {
        return meals
    }

    @JsonProperty("meals")
    fun setMeals(meals: List<Meal?>?) {
        this.meals = meals
    }

    @JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any>? {
        return additionalProperties
    }

    @JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        additionalProperties!![name] = value
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeList(meals)
        dest.writeValue(additionalProperties)
    }

    override fun describeContents(): Int {
        return 0
    }

//    companion object {
//        val CREATOR: Parcelable.Creator<MealApiResponse> = object : Parcelable.Creator<MealApiResponse?> {
//            override fun createFromParcel(`in`: Parcel): MealApiResponse? {
//                return MealApiResponse(`in`)
//            }
//
//            override fun newArray(size: Int): Array<MealApiResponse?> {
//                return arrayOfNulls(size)
//            }
//        }
//    }
}