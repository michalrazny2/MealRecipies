package com.example.mealrecipies.ui.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.mealrecipies.HomeViewModelFactory
import com.example.mealrecipies.R
import com.example.mealrecipies.RecipeViewModelFactory
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.ui.home.HomeViewModel
import com.jakewharton.rxbinding3.view.clicks
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.Action
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_recipe.*
import kotlinx.android.synthetic.main.meal_item.*

class RecipeActivity : AppCompatActivity() {

    lateinit var recipeViewModel : RecipeViewModel
    var meal : Meal? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        // View Model initialization, based on created factory
        recipeViewModel = ViewModelProvider(this, RecipeViewModelFactory(application))
            .get(RecipeViewModel::class.java)

        viewInitialization()

    }

    private fun viewInitialization() {
        // Todo: setting values in textview etc.
        val item = intent.extras?.getParcelable<Meal>("meal")
        strMeal_View.text = item?.strMeal
        categoryName_view.text = item?.strArea
        strInstructions_view.text = item?.strInstructions

        meal = item // assigning value to my meal

        val saveButtonObservable = getSaveButtonObserver()

        saveButtonObservable // subsribing button clicks
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .observeOn(Schedulers.io())
            .subscribe { _ -> recipeViewModel.saveRecipe(item) }

    }

    private fun getSaveButtonObserver(): Observable<Meal> { //todo: metoda do uzupelnienia
        return Observable.create { emmiter ->
            saveButton.setOnClickListener {
                emmiter.onNext(this.meal) // Todo: not sure if this is the correct way it should be done
                emmiter.setCancellable {
                    saveButton.setOnClickListener(null)
                }}
        }
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