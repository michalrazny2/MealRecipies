package com.example.mealrecipies.adapter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mealrecipies.R
import com.example.mealrecipies.models.Meal
import com.example.mealrecipies.ui.recipe.RecipeActivity

class MealRecyclerViewAdapter(private val mMealList: LiveData<List<Meal>>) : RecyclerView.Adapter<MealRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView){
        val name = mView.findViewById<TextView>(R.id.meal_name_view)
        val area = mView.findViewById<TextView>(R.id.area_name_view)
        val category = mView.findViewById<TextView>(R.id.category_name_view)
        val image = mView.findViewById<ImageView>(R.id.meal_image)

        var mMeal : Meal? = null
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MealRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.meal_item, parent, false)
        return ViewHolder(view)    }

    override fun onBindViewHolder(holder: MealRecyclerViewAdapter.ViewHolder, position: Int) {
        val item = mMealList.value?.get(position)
        holder.name.text = item?.strMeal
        holder.area.text = item?.strArea
        holder.category.text = item?.strCategory
        holder.itemView.setOnClickListener {
            // Starting the meal activity:
            val intent = Intent(holder.image.context, RecipeActivity::class.java).apply{
                putExtra("recipe", item)
            }
            holder.image.context.startActivity(intent)
        }

        Glide.with(holder.mView.context) // image loading with glide
            .load(item?.strMealThumb) //todo: other image during loading
            .into(holder.image)


    }

    override fun getItemCount() = mMealList.value!!.size // null assertion
}