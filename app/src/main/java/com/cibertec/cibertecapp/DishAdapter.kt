package com.cibertec.cibertecapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DishAdapter(private val dishList: List<Dish>) :
    RecyclerView.Adapter<DishViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DishViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val dish = dishList[position]
        holder.bind(dish)
    }

    override fun getItemCount(): Int {
        return dishList.size
    }

}