package com.example.finalappmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.food_info.*

class FoodInfo : AppCompatActivity() {
    var position = 0
    var account = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_info)
        position=intent.getIntExtra("position",0)
        account =intent.getIntExtra("account",0)
        showImage_text(position)
    }

    private fun showImage_text(position: Int) {
        when (position+1){
            1-> {
                image.setImageResource(R.drawable.salads)
                name.setText("Salad and Vegetables")
                facts0.setText("Cucumber Salada and jam")
                facts1.setText("Vegan Black Bean and Potato Salad")
                facts2.setText("Caesar salad")
                facts3.setText("Thai Carrot Salad")
            }
            2-> {
                image.setImageResource(R.drawable.appetizer)
                name.setText("Snacks")
                facts0.setText("Potato cheese balls")
                facts1.setText("Cheese and Onion Bhaji")
                facts2.setText("Potatoe Lollipop")
                facts3.setText("Grilled Mozzarella Sandwichs")
            }
            3-> {
                image.setImageResource(R.drawable.meat)
                name.setText("Meat ")
                facts0.setText("Roast beef with red wine ")
                facts1.setText("Chicken schnitzel Caesar")
                facts2.setText("Roast spiced duck with plums")
                facts3.setText("Braised bacon")
            }
            4-> {
                image.setImageResource(R.drawable.pasta)
                name.setText("Pasta and Pizza")
                facts0.setText("Penne a la Bolognesa")
                facts1.setText("Baked Spaghetti and Meatballs")
                facts2.setText("Pizza 4 formaggi")
                facts3.setText("Pizza Margaritha")
            }
            5->{
                image.setImageResource(R.drawable.seafood)
                name.setText("Seafood")
                facts0.setText("Tuna with potatoes")
                facts1.setText("Rice with Glazed Salmon")
                facts2.setText("Roast Fish with Curry Butter")
                facts3.setText("Grilled Salt-and-Pepper Black Bass")
            }
            6-> {
                image.setImageResource(R.drawable.vegetarian)
                name.setText("Vegetarian food")
                facts0.setText("Crispy Baked Falafel")
                facts1.setText("Vegetable Paella")
                facts2.setText("Brocoli with Cheese Sauce")
                facts3.setText("Black Bean Sweet Potato Enchiladas")
            }
            7-> {
                image.setImageResource(R.drawable.hamburguer)
                name.setText("Hamburguers, chips, nachos...")
                facts0.setText("Mozzarella-Stuffed Crispy Baked Onion Rings")
                facts1.setText("Chili Cheese Dog Grilled Cheese")
                facts2.setText("The Monster Burguer")
                facts3.setText("Bacon-Wrapped Hot Dogs")
            }
            8-> {
                image.setImageResource(R.drawable.cake)
                name.setText("Desserts")
                facts0.setText("Reese's Peanut Butter Cup Sundae")
                facts1.setText("Cookies")
                facts2.setText("Spiked Thin Mint Milkshake")
                facts3.setText("Cheesecake")
            }

        }
    }

    fun sumar(view: View) {
        account = account + 10
    }

    fun sumar2(view: View) {

        account = account + 15
    }

    fun finishAccount(view: View){
        var intent= Intent(this,AccountActivity::class.java)
        intent.putExtra("account",account)
        startActivity(intent)
    }


}