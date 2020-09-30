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
@JsonPropertyOrder("idMeal", "strMeal", "strDrinkAlternate", "strCategory", "strArea", "strInstructions", "strMealThumb", "strTags", "strYoutube", "strIngredient1", "strIngredient2", "strIngredient3", "strIngredient4", "strIngredient5", "strIngredient6", "strIngredient7", "strIngredient8", "strIngredient9", "strIngredient10", "strIngredient11", "strIngredient12", "strIngredient13", "strIngredient14", "strIngredient15", "strIngredient16", "strIngredient17", "strIngredient18", "strIngredient19", "strIngredient20", "strMeasure1", "strMeasure2", "strMeasure3", "strMeasure4", "strMeasure5", "strMeasure6", "strMeasure7", "strMeasure8", "strMeasure9", "strMeasure10", "strMeasure11", "strMeasure12", "strMeasure13", "strMeasure14", "strMeasure15", "strMeasure16", "strMeasure17", "strMeasure18", "strMeasure19", "strMeasure20", "strSource", "dateModified")
class Meal : Parcelable {
    @get:JsonProperty("idMeal")
    @set:JsonProperty("idMeal")
    @JsonProperty("idMeal")
    var idMeal: String? = null

    @get:JsonProperty("strMeal")
    @set:JsonProperty("strMeal")
    @JsonProperty("strMeal")
    var strMeal: String? = null

    @get:JsonProperty("strDrinkAlternate")
    @set:JsonProperty("strDrinkAlternate")
    @JsonProperty("strDrinkAlternate")
    var strDrinkAlternate: Any? = null

    @get:JsonProperty("strCategory")
    @set:JsonProperty("strCategory")
    @JsonProperty("strCategory")
    var strCategory: String? = null

    @get:JsonProperty("strArea")
    @set:JsonProperty("strArea")
    @JsonProperty("strArea")
    var strArea: String? = null

    @get:JsonProperty("strInstructions")
    @set:JsonProperty("strInstructions")
    @JsonProperty("strInstructions")
    var strInstructions: String? = null

    @get:JsonProperty("strMealThumb")
    @set:JsonProperty("strMealThumb")
    @JsonProperty("strMealThumb")
    var strMealThumb: String? = null

    @get:JsonProperty("strTags")
    @set:JsonProperty("strTags")
    @JsonProperty("strTags")
    var strTags: String? = null

    @get:JsonProperty("strYoutube")
    @set:JsonProperty("strYoutube")
    @JsonProperty("strYoutube")
    var strYoutube: String? = null

    @get:JsonProperty("strIngredient1")
    @set:JsonProperty("strIngredient1")
    @JsonProperty("strIngredient1")
    var strIngredient1: String? = null

    @get:JsonProperty("strIngredient2")
    @set:JsonProperty("strIngredient2")
    @JsonProperty("strIngredient2")
    var strIngredient2: String? = null

    @get:JsonProperty("strIngredient3")
    @set:JsonProperty("strIngredient3")
    @JsonProperty("strIngredient3")
    var strIngredient3: String? = null

    @get:JsonProperty("strIngredient4")
    @set:JsonProperty("strIngredient4")
    @JsonProperty("strIngredient4")
    var strIngredient4: String? = null

    @get:JsonProperty("strIngredient5")
    @set:JsonProperty("strIngredient5")
    @JsonProperty("strIngredient5")
    var strIngredient5: String? = null

    @get:JsonProperty("strIngredient6")
    @set:JsonProperty("strIngredient6")
    @JsonProperty("strIngredient6")
    var strIngredient6: String? = null

    @get:JsonProperty("strIngredient7")
    @set:JsonProperty("strIngredient7")
    @JsonProperty("strIngredient7")
    var strIngredient7: String? = null

    @get:JsonProperty("strIngredient8")
    @set:JsonProperty("strIngredient8")
    @JsonProperty("strIngredient8")
    var strIngredient8: String? = null

    @get:JsonProperty("strIngredient9")
    @set:JsonProperty("strIngredient9")
    @JsonProperty("strIngredient9")
    var strIngredient9: String? = null

    @get:JsonProperty("strIngredient10")
    @set:JsonProperty("strIngredient10")
    @JsonProperty("strIngredient10")
    var strIngredient10: String? = null

    @get:JsonProperty("strIngredient11")
    @set:JsonProperty("strIngredient11")
    @JsonProperty("strIngredient11")
    var strIngredient11: String? = null

    @get:JsonProperty("strIngredient12")
    @set:JsonProperty("strIngredient12")
    @JsonProperty("strIngredient12")
    var strIngredient12: String? = null

    @get:JsonProperty("strIngredient13")
    @set:JsonProperty("strIngredient13")
    @JsonProperty("strIngredient13")
    var strIngredient13: String? = null

    @get:JsonProperty("strIngredient14")
    @set:JsonProperty("strIngredient14")
    @JsonProperty("strIngredient14")
    var strIngredient14: String? = null

    @get:JsonProperty("strIngredient15")
    @set:JsonProperty("strIngredient15")
    @JsonProperty("strIngredient15")
    var strIngredient15: String? = null

    @get:JsonProperty("strIngredient16")
    @set:JsonProperty("strIngredient16")
    @JsonProperty("strIngredient16")
    var strIngredient16: Any? = null

    @get:JsonProperty("strIngredient17")
    @set:JsonProperty("strIngredient17")
    @JsonProperty("strIngredient17")
    var strIngredient17: Any? = null

    @get:JsonProperty("strIngredient18")
    @set:JsonProperty("strIngredient18")
    @JsonProperty("strIngredient18")
    var strIngredient18: Any? = null

    @get:JsonProperty("strIngredient19")
    @set:JsonProperty("strIngredient19")
    @JsonProperty("strIngredient19")
    var strIngredient19: Any? = null

    @get:JsonProperty("strIngredient20")
    @set:JsonProperty("strIngredient20")
    @JsonProperty("strIngredient20")
    var strIngredient20: Any? = null

    @get:JsonProperty("strMeasure1")
    @set:JsonProperty("strMeasure1")
    @JsonProperty("strMeasure1")
    var strMeasure1: String? = null

    @get:JsonProperty("strMeasure2")
    @set:JsonProperty("strMeasure2")
    @JsonProperty("strMeasure2")
    var strMeasure2: String? = null

    @get:JsonProperty("strMeasure3")
    @set:JsonProperty("strMeasure3")
    @JsonProperty("strMeasure3")
    var strMeasure3: String? = null

    @get:JsonProperty("strMeasure4")
    @set:JsonProperty("strMeasure4")
    @JsonProperty("strMeasure4")
    var strMeasure4: String? = null

    @get:JsonProperty("strMeasure5")
    @set:JsonProperty("strMeasure5")
    @JsonProperty("strMeasure5")
    var strMeasure5: String? = null

    @get:JsonProperty("strMeasure6")
    @set:JsonProperty("strMeasure6")
    @JsonProperty("strMeasure6")
    var strMeasure6: String? = null

    @get:JsonProperty("strMeasure7")
    @set:JsonProperty("strMeasure7")
    @JsonProperty("strMeasure7")
    var strMeasure7: String? = null

    @get:JsonProperty("strMeasure8")
    @set:JsonProperty("strMeasure8")
    @JsonProperty("strMeasure8")
    var strMeasure8: String? = null

    @get:JsonProperty("strMeasure9")
    @set:JsonProperty("strMeasure9")
    @JsonProperty("strMeasure9")
    var strMeasure9: String? = null

    @get:JsonProperty("strMeasure10")
    @set:JsonProperty("strMeasure10")
    @JsonProperty("strMeasure10")
    var strMeasure10: String? = null

    @get:JsonProperty("strMeasure11")
    @set:JsonProperty("strMeasure11")
    @JsonProperty("strMeasure11")
    var strMeasure11: String? = null

    @get:JsonProperty("strMeasure12")
    @set:JsonProperty("strMeasure12")
    @JsonProperty("strMeasure12")
    var strMeasure12: String? = null

    @get:JsonProperty("strMeasure13")
    @set:JsonProperty("strMeasure13")
    @JsonProperty("strMeasure13")
    var strMeasure13: String? = null

    @get:JsonProperty("strMeasure14")
    @set:JsonProperty("strMeasure14")
    @JsonProperty("strMeasure14")
    var strMeasure14: String? = null

    @get:JsonProperty("strMeasure15")
    @set:JsonProperty("strMeasure15")
    @JsonProperty("strMeasure15")
    var strMeasure15: String? = null

    @get:JsonProperty("strMeasure16")
    @set:JsonProperty("strMeasure16")
    @JsonProperty("strMeasure16")
    var strMeasure16: Any? = null

    @get:JsonProperty("strMeasure17")
    @set:JsonProperty("strMeasure17")
    @JsonProperty("strMeasure17")
    var strMeasure17: Any? = null

    @get:JsonProperty("strMeasure18")
    @set:JsonProperty("strMeasure18")
    @JsonProperty("strMeasure18")
    var strMeasure18: Any? = null

    @get:JsonProperty("strMeasure19")
    @set:JsonProperty("strMeasure19")
    @JsonProperty("strMeasure19")
    var strMeasure19: Any? = null

    @get:JsonProperty("strMeasure20")
    @set:JsonProperty("strMeasure20")
    @JsonProperty("strMeasure20")
    var strMeasure20: Any? = null

    @get:JsonProperty("strSource")
    @set:JsonProperty("strSource")
    @JsonProperty("strSource")
    var strSource: Any? = null

    @get:JsonProperty("dateModified")
    @set:JsonProperty("dateModified")
    @JsonProperty("dateModified")
    var dateModified: Any? = null

    @JsonIgnore
    private var additionalProperties: MutableMap<String, Any>? = HashMap()

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
        additionalProperties =
            `in`.readValue(MutableMap::class.java.classLoader) as MutableMap<String, Any>?
    }

    constructor() {}

    @JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any>? {
        return additionalProperties
    }

    @JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        additionalProperties!![name] = value
    }

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
        dest.writeValue(additionalProperties)
    }

    override fun describeContents(): Int {
        return 0
    }

//    companion object {
//        val CREATOR: Parcelable.Creator<Meal> = object : Parcelable.Creator<Meal?> {
//            override fun createFromParcel(`in`: Parcel): Meal? {
//                return Meal(`in`)
//            }
//
//            override fun newArray(size: Int): Array<Meal?> {
//                return arrayOfNulls(size)
//            }
//        }
//    }
}