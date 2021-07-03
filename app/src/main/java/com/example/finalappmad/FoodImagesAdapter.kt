package com.example.finalappmad

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.food_list_layout.view.*

class FoodImagesAdapter: BaseAdapter {
    private var context: Context
    private var foodNames: ArrayList<String>
    private var photosFood: ArrayList<Int>

    constructor(
        context: Context,
        foodNames: ArrayList<String>,
        photosFood: ArrayList<Int>
    ) : super() {
        this.context = context
        this.foodNames = foodNames
        this.photosFood = photosFood
    }

    override fun getCount(): Int {
        return foodNames.size
    }

    override fun getItem(position: Int): Any {
        return foodNames[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = layoutInflater.inflate(R.layout.food_list_layout, null, true)
        val foodNameTextView = itemView.food_name as TextView
        val foodImageView = itemView.food_image as ImageView
        foodNameTextView.text = getItem(position).toString()
        foodImageView.setImageResource(photosFood[position])
        return itemView
    }
}
