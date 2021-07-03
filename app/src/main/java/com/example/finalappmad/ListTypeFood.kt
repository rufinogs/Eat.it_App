package com.example.finalappmad

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.list_layout.*

class ListTypeFood : AppCompatActivity() {
    private val listOfTypes = ArrayList<String>()
    private val photoTypeFood = ArrayList<Int>()
    var account = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_layout)
        account = intent.getIntExtra("account", 0)
        initializeList()
        var namesandImageAdapterAdapter =
            FoodImagesAdapter(this, listOfTypes, photoTypeFood)
        typefood_list.adapter = namesandImageAdapterAdapter
        typefood_list.setOnItemClickListener {
                parent, view, position, id -> onItemClick(position)

        }
    }

    private fun onItemClick(position: Int) {
        intent= Intent(this, FoodInfo::class.java)
        intent.putExtra("position",position)
        intent.putExtra("account", account)
        startActivity(intent)
    }

    private fun initializeList() {

        listOfTypes.add("Salads and Vegetables")
        listOfTypes.add("Snacks")
        listOfTypes.add("Meat")
        listOfTypes.add("Pasta and Pizza")
        listOfTypes.add("Fish and Seafood")
        listOfTypes.add("Vegetarian")
        listOfTypes.add("Fast Food")
        listOfTypes.add("Desserts")

        photoTypeFood.add(R.drawable.salads)
        photoTypeFood.add(R.drawable.appetizer)
        photoTypeFood.add(R.drawable.meat)
        photoTypeFood.add(R.drawable.pasta)
        photoTypeFood.add(R.drawable.seafood)
        photoTypeFood.add(R.drawable.vegetarian)
        photoTypeFood.add(R.drawable.hamburguer)
        photoTypeFood.add(R.drawable.cake)

    }
}
