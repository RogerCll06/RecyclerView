package com.cibertec.cibertecapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class DishActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish)

        val recyclerDish = findViewById<RecyclerView>(R.id.recyclerDish)

        val dishList = listOf(
            Dish("Tacos al Pastor", "Tacos mexicanos con piña y cerdo.", R.drawable.plato),
            Dish("Pizza Margarita", "Tomate, mozzarella y albahaca.", R.drawable.plato),
            Dish("Sushi", "Rollos de arroz con pescado fresco.", R.drawable.plato)
        )

        // recyclerDish.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        // recyclerDish.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerDish.layoutManager = LinearLayoutManager(this)
        // recyclerDish.layoutManager = GridLayoutManager(this, 2)
        // recyclerDish.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false)
        // recyclerDish.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerDish.adapter = DishAdapter(dishList)

    }

}