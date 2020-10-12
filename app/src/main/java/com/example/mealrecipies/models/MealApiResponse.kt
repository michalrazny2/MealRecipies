package com.example.mealrecipies.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class MealApiResponse : Parcelable {
    @SerializedName("meals")
    @Expose
    var meals: List<Meal?>? = null

    protected constructor(`in`: Parcel) {
        `in`.readList(meals!!, Meal::class.java.classLoader)
    }

    constructor() {}

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeList(meals)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        // Without this Jvm field annotation the compiler throws BadParcelableException!
        @JvmField
        val CREATOR: Parcelable.Creator<MealApiResponse?> = object : Parcelable.Creator<MealApiResponse?> {
            override fun createFromParcel(`in`: Parcel): MealApiResponse? {
                return MealApiResponse(`in`)
            }

            override fun newArray(size: Int): Array<MealApiResponse?> {
                return arrayOfNulls(size)
            }
        }
    }
}