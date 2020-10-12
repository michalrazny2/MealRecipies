package com.example.mealrecipies.ui.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.mealrecipies.R
import com.example.mealrecipies.models.Meal
import kotlinx.android.synthetic.main.activity_recipe.*
import kotlinx.android.synthetic.main.meal_item.*

class RecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        viewInitialization()

    }

    private fun viewInitialization() {
        // Todo: setting values in textview etc., why tf the item is null
        val item = intent.extras?.getParcelable<Meal>("meal")
        strMeal_View.text = item?.strMeal
        categoryName_view.text = item?.strArea
        strInstructions_view.text = item?.strInstructions

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_navigation, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // While there is only one element, i dont think i have to call 'when'
        finish()
        return super.onOptionsItemSelected(item)
    }

}