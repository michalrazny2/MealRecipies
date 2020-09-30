package com.example.mealrecipies.models

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "meals")
class Meal : Parcelable {
    @PrimaryKey
    @NonNull
    @SerializedName("idMeal")
    @Expose
    var idMeal: String? = null

    @ColumnInfo(name="strMeal")
    @SerializedName("strMeal")
    @Expose
    var strMeal: String? = null

    @ColumnInfo(name="strDrinkAlternate")
    @SerializedName("strDrinkAlternate")
    @Expose
    var strDrinkAlternate: String? = null

    @ColumnInfo(name="strCategory")
    @SerializedName("strCategory")
    @Expose
    var strCategory: String? = null

    @ColumnInfo(name="strArea")
    @SerializedName("strArea")
    @Expose
    var strArea: String? = null

    @ColumnInfo(name="strInstructions")
    @SerializedName("strInstructions")
    @Expose
    var strInstructions: String? = null

    @ColumnInfo(name="strMealThumb")
    @SerializedName("strMealThumb")
    @Expose
    var strMealThumb: String? = null

    @ColumnInfo(name="strTags")
    @SerializedName("strTags")
    @Expose
    var strTags: String? = null

    @ColumnInfo(name="strYoutube")
    @SerializedName("strYoutube")
    @Expose
    var strYoutube: String? = null

    @ColumnInfo(name="strIngredient1")
    @SerializedName("strIngredient1")
    @Expose
    var strIngredient1: String? = null

    @ColumnInfo(name="strIngredient2")
    @SerializedName("strIngredient2")
    @Expose
    var strIngredient2: String? = null

    @ColumnInfo(name="strIngredient3")
    @SerializedName("strIngredient3")
    @Expose
    var strIngredient3: String? = null

    @ColumnInfo(name="strIngredient4")
    @SerializedName("strIngredient4")
    @Expose
    var strIngredient4: String? = null

    @ColumnInfo(name="strIngredient5")
    @SerializedName("strIngredient5")
    @Expose
    var strIngredient5: String? = null

    @ColumnInfo(name="strIngredient6")
    @SerializedName("strIngredient6")
    @Expose
    var strIngredient6: String? = null

    @ColumnInfo(name="strIngredient7")
    @SerializedName("strIngredient7")
    @Expose
    var strIngredient7: String? = null

    @ColumnInfo(name="strIngredient8")
    @SerializedName("strIngredient8")
    @Expose
    var strIngredient8: String? = null

    @ColumnInfo(name="strIngredient9")
    @SerializedName("strIngredient9")
    @Expose
    var strIngredient9: String? = null

    @ColumnInfo(name="strIngredient10")
    @SerializedName("strIngredient10")
    @Expose
    var strIngredient10: String? = null

    @ColumnInfo(name="strIngredient11")
    @SerializedName("strIngredient11")
    @Expose
    var strIngredient11: String? = null

    @ColumnInfo(name="strIngredient12")
    @SerializedName("strIngredient12")
    @Expose
    var strIngredient12: String? = null

    @ColumnInfo(name="strIngredient13")
    @SerializedName("strIngredient13")
    @Expose
    var strIngredient13: String? = null

    @ColumnInfo(name="strIngredient14")
    @SerializedName("strIngredient14")
    @Expose
    var strIngredient14: String? = null

    @ColumnInfo(name="strIngredient15")
    @SerializedName("strIngredient15")
    @Expose
    var strIngredient15: String? = null

    @ColumnInfo(name="strIngredient16")
    @SerializedName("strIngredient16")
    @Expose
    var strIngredient16: String? = null

    @ColumnInfo(name="strIngredient17")
    @SerializedName("strIngredient17")
    @Expose
    var strIngredient17: String? = null

    @ColumnInfo(name="strIngredient18")
    @SerializedName("strIngredient18")
    @Expose
    var strIngredient18: String? = null

    @ColumnInfo(name="strIngredient19")
    @SerializedName("strIngredient19")
    @Expose
    var strIngredient19: String? = null

    @ColumnInfo(name="strIngredient20")
    @SerializedName("strIngredient20")
    @Expose
    var strIngredient20: String? = null

    @ColumnInfo(name="strMeasure1")
    @SerializedName("strMeasure1")
    @Expose
    var strMeasure1: String? = null

    @ColumnInfo(name="strMeasure2")
    @SerializedName("strMeasure2")
    @Expose
    var strMeasure2: String? = null

    @ColumnInfo(name="strMeasure3")
    @SerializedName("strMeasure3")
    @Expose
    var strMeasure3: String? = null

    @ColumnInfo(name="strMeasure4")
    @SerializedName("strMeasure4")
    @Expose
    var strMeasure4: String? = null

    @ColumnInfo(name="strMeasure5")
    @SerializedName("strMeasure5")
    @Expose
    var strMeasure5: String? = null

    @ColumnInfo(name="strMeasure6")
    @SerializedName("strMeasure6")
    @Expose
    var strMeasure6: String? = null

    @ColumnInfo(name="strMeasure7")
    @SerializedName("strMeasure7")
    @Expose
    var strMeasure7: String? = null

    @ColumnInfo(name="strMeasure8")
    @SerializedName("strMeasure8")
    @Expose
    var strMeasure8: String? = null

    @ColumnInfo(name="strMeasure9")
    @SerializedName("strMeasure9")
    @Expose
    var strMeasure9: String? = null

    @ColumnInfo(name="strMeasure10")
    @SerializedName("strMeasure10")
    @Expose
    var strMeasure10: String? = null

    @ColumnInfo(name="strMeasure11")
    @SerializedName("strMeasure11")
    @Expose
    var strMeasure11: String? = null

    @ColumnInfo(name="strMeasure12")
    @SerializedName("strMeasure12")
    @Expose
    var strMeasure12: String? = null

    @ColumnInfo(name="strMeasure13")
    @SerializedName("strMeasure13")
    @Expose
    var strMeasure13: String? = null

    @ColumnInfo(name="strMeasure14")
    @SerializedName("strMeasure14")
    @Expose
    var strMeasure14: String? = null

    @ColumnInfo(name="strMeasure15")
    @SerializedName("strMeasure15")
    @Expose
    var strMeasure15: String? = null

    @ColumnInfo(name="strMeasure16")
    @SerializedName("strMeasure16")
    @Expose
    var strMeasure16: String? = null

    @ColumnInfo(name="strMeasure17")
    @SerializedName("strMeasure17")
    @Expose
    var strMeasure17: String? = null

    @ColumnInfo(name="strMeasure18")
    @SerializedName("strMeasure18")
    @Expose
    var strMeasure18: String? = null

    @ColumnInfo(name="strMeasure19")
    @SerializedName("strMeasure19")
    @Expose
    var strMeasure19: String? = null

    @ColumnInfo(name="strMeasure20")
    @SerializedName("strMeasure20")
    @Expose
    var strMeasure20: String? = null

    @ColumnInfo(name="strSource")
    @SerializedName("strSource")
    @Expose
    var strSource: String? = null

    @ColumnInfo(name="dateModified")
    @SerializedName("dateModified")
    @Expose
    var dateModified: String? = null

    protected constructor(`in`: Parcel) {
        idMeal = `in`.readValue(String::class.java.classLoader) as String?
        strMeal = `in`.readValue(String::class.java.classLoader) as String?
        strDrinkAlternate = `in`.readValue(String::class.java.classLoader) as String?
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
        strIngredient16 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient17 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient18 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient19 = `in`.readValue(String::class.java.classLoader) as String?
        strIngredient20 = `in`.readValue(String::class.java.classLoader) as String?
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
        strMeasure16 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure17 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure18 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure19 = `in`.readValue(String::class.java.classLoader) as String?
        strMeasure20 = `in`.readValue(String::class.java.classLoader) as String?
        strSource = `in`.readValue(String::class.java.classLoader) as String?
        dateModified = `in`.readValue(String::class.java.classLoader) as String?
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