package com.cibertec.cibertecapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DishViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_dish,
        parent, false)) {

    private val imgDish: ImageView = itemView.findViewById(R.id.imgDish)
    private val textTitleDish: TextView = itemView.findViewById(R.id.textTitleDish)
    private val textDescriptionDish: TextView = itemView.findViewById(R.id.textDescriptionDish)

    fun bind(dish: Dish) {
        imgDish.setImageResource(dish.imageResId)
        textTitleDish.text = dish.name
        textDescriptionDish.text = dish.description
    }

}