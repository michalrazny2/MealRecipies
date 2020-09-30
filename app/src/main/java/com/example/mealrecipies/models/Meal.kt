package com.example.mealrecipies.models

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

//@Entity
class Meal : Parcelable {
    @SerializedName("idMeal")
    @Expose
    var idMeal: String? = null

    @SerializedName("strMeal")
    @Expose
    var strMeal: String? = null

    @SerializedName("strDrinkAlternate")
    @Expose
    var strDrinkAlternate: Any? = null

    @SerializedName("strCategory")
    @Expose
    var strCategory: String? = null

    @SerializedName("strArea")
    @Expose
    var strArea: String? = null

    @SerializedName("strInstructions")
    @Expose
    var strInstructions: String? = null

    @SerializedName("strMealThumb")
    @Expose
    var strMealThumb: String? = null

    @SerializedName("strTags")
    @Expose
    var strTags: String? = null

    @SerializedName("strYoutube")
    @Expose
    var strYoutube: String? = null

    @SerializedName("strIngredient1")
    @Expose
    var strIngredient1: String? = null

    @SerializedName("strIngredient2")
    @Expose
    var strIngredient2: String? = null

    @SerializedName("strIngredient3")
    @Expose
    var strIngredient3: String? = null

    @SerializedName("strIngredient4")
    @Expose
    var strIngredient4: String? = null

    @SerializedName("strIngredient5")
    @Expose
    var strIngredient5: String? = null

    @SerializedName("strIngredient6")
    @Expose
    var strIngredient6: String? = null

    @SerializedName("strIngredient7")
    @Expose
    var strIngredient7: String? = null

    @SerializedName("strIngredient8")
    @Expose
    var strIngredient8: String? = null

    @SerializedName("strIngredient9")
    @Expose
    var strIngredient9: String? = null

    @SerializedName("strIngredient10")
    @Expose
    var strIngredient10: String? = null

    @SerializedName("strIngredient11")
    @Expose
    var strIngredient11: String? = null

    @SerializedName("strIngredient12")
    @Expose
    var strIngredient12: String? = null

    @SerializedName("strIngredient13")
    @Expose
    var strIngredient13: String? = null

    @SerializedName("strIngredient14")
    @Expose
    var strIngredient14: String? = null

    @SerializedName("strIngredient15")
    @Expose
    var strIngredient15: String? = null

    @SerializedName("strIngredient16")
    @Expose
    var strIngredient16: Any? = null

    @SerializedName("strIngredient17")
    @Expose
    var strIngredient17: Any? = null

    @SerializedName("strIngredient18")
    @Expose
    var strIngredient18: Any? = null

    @SerializedName("strIngredient19")
    @Expose
    var strIngredient19: Any? = null

    @SerializedName("strIngredient20")
    @Expose
    var strIngredient20: Any? = null

    @SerializedName("strMeasure1")
    @Expose
    var strMeasure1: String? = null

    @SerializedName("strMeasure2")
    @Expose
    var strMeasure2: String? = null

    @SerializedName("strMeasure3")
    @Expose
    var strMeasure3: String? = null

    @SerializedName("strMeasure4")
    @Expose
    var strMeasure4: String? = null

    @SerializedName("strMeasure5")
    @Expose
    var strMeasure5: String? = null

    @SerializedName("strMeasure6")
    @Expose
    var strMeasure6: String? = null

    @SerializedName("strMeasure7")
    @Expose
    var strMeasure7: String? = null

    @SerializedName("strMeasure8")
    @Expose
    var strMeasure8: String? = null

    @SerializedName("strMeasure9")
    @Expose
    var strMeasure9: String? = null

    @SerializedName("strMeasure10")
    @Expose
    var strMeasure10: String? = null

    @SerializedName("strMeasure11")
    @Expose
    var strMeasure11: String? = null

    @SerializedName("strMeasure12")
    @Expose
    var strMeasure12: String? = null

    @SerializedName("strMeasure13")
    @Expose
    var strMeasure13: String? = null

    @SerializedName("strMeasure14")
    @Expose
    var strMeasure14: String? = null

    @SerializedName("strMeasure15")
    @Expose
    var strMeasure15: String? = null

    @SerializedName("strMeasure16")
    @Expose
    var strMeasure16: Any? = null

    @SerializedName("strMeasure17")
    @Expose
    var strMeasure17: Any? = null

    @SerializedName("strMeasure18")
    @Expose
    var strMeasure18: Any? = null

    @SerializedName("strMeasure19")
    @Expose
    var strMeasure19: Any? = null

    @SerializedName("strMeasure20")
    @Expose
    var strMeasure20: Any? = null

    @SerializedName("strSource")
    @Expose
    var strSource: Any? = null

    @SerializedName("dateModified")
    @Expose
    var dateModified: Any? = null

    protected constructor(`in`: Parcel) {
        idMeal = `in`.readValue(String::class.java.classLoader) as String?
        strMeal = `in`.readValue(String::class.java.classLoader) as String?
        strDrinkAlternate = `in`.readValue(Any::class.java.classLoader)
        strCategory = `in`.readValue(String::class.java.classLoader) as String?
        strArea = `in`.readValue(String::class.java.classLoader) as String?
        strInstructions = `in`.readValue(String::class.java.classLoader) as String?
        strMealThumb = `in`.readValue(String::class.java.classLoader) as String?
        strTags = `in`.readValue(String::class.java.classLoader) as String?
        strYoutube = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient1 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient2 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient3 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient4 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient5 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient6 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient7 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient8 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient9 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient10 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient11 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient12 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient13 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient14 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient15 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient16 = `in`.readValue(Any::class.java.classLoader)
        strIngredient17 = `in`.readValue(Any::class.java.classLoader)
        strIngredient18 = `in`.readValue(Any::class.java.classLoader)
        strIngredient19 = `in`.readValue(Any::class.java.classLoader)
        strIngredient20 = `in`.readValue(Any::class.java.classLoader)
        strMeasure1 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure2 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure3 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure4 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure5 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure6 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure7 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure8 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure9 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure10 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure11 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure12 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure13 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure14 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure15 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure16 = `in`.readValue(Any::class.java.classLoader)
        strMeasure17 = `in`.readValue(Any::class.java.classLoader)
        strMeasure18 = `in`.readValue(Any::class.java.classLoader)
        strMeasure19 = `in`.readValue(Any::class.java.classLoader)
        strMeasure20 = `in`.readValue(Any::class.java.classLoader)
        strSource = `in`.readValue(Any::class.java.classLoader)
        dateModified = `in`.readValue(Any::class.java.classLoader)
    }

    constructor() {}

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(idMeal)
        dest.writeValue(strMeal)
        dest.writeValue(strDrinkAlternate)
        dest.writeValue(strCategory)
        dest.writeValue(strArea)
        dest.writeValue(strInstructions)
        dest.writeValue(strMealThumb)
        dest.writeValue(strTags)
        dest.writeValue(strYoutube)
        dest.writeValue(strIngredient1)
        dest.writeValue(strIngredient2)
        dest.writeValue(strIngredient3)
        dest.writeValue(strIngredient4)
        dest.writeValue(strIngredient5)
        dest.writeValue(strIngredient6)
        dest.writeValue(strIngredient7)
        dest.writeValue(strIngredient8)
        dest.writeValue(strIngredient9)
        dest.writeValue(strIngredient10)
        dest.writeValue(strIngredient11)
        dest.writeValue(strIngredient12)
        dest.writeValue(strIngredient13)
        dest.writeValue(strIngredient14)
        dest.writeValue(strIngredient15)
        dest.writeValue(strIngredient16)
        dest.writeValue(strIngredient17)
        dest.writeValue(strIngredient18)
        dest.writeValue(strIngredient19)
        dest.writeValue(strIngredient20)
        dest.writeValue(strMeasure1)
        dest.writeValue(strMeasure2)
        dest.writeValue(strMeasure3)
        dest.writeValue(strMeasure4)
        dest.writeValue(strMeasure5)
        dest.writeValue(strMeasure6)
        dest.writeValue(strMeasure7)
        dest.writeValue(strMeasure8)
        dest.writeValue(strMeasure9)
        dest.writeValue(strMeasure10)
        dest.writeValue(strMeasure11)
        dest.writeValue(strMeasure12)
        dest.writeValue(strMeasure13)
        dest.writeValue(strMeasure14)
        dest.writeValue(strMeasure15)
        dest.writeValue(strMeasure16)
        dest.writeValue(strMeasure17)
        dest.writeValue(strMeasure18)
        dest.writeValue(strMeasure19)
        dest.writeValue(strMeasure20)
        dest.writeValue(strSource)
        dest.writeValue(dateModified)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Meal?> = object : Parcelable.Creator<Meal?> {
            override fun createFromParcel(`in`: Parcel): Meal? {
                return Meal(`in`)
            }

            override fun newArray(size: Int): Array<Meal?> {
                return arrayOfNulls(size)
            }
        }
    }
}