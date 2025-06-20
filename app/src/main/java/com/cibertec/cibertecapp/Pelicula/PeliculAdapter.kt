package com.cibertec.cibertecapp.Pelicula

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PeliculAdapter(val listPeli: List<Pelicula>):
    RecyclerView.Adapter<PeliculaViewHolder>() {

    // Inicializar el ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PeliculaViewHolder(inflater, parent)
    }
    // Indicar el numero de elementos a mostrar
    override fun getItemCount(): Int {
        return listPeli.size
    }
    // Asignar datos al ViewHolder
    override fun onBindViewHolder(holder: PeliculaViewHolder,
                                  position: Int) {
        val peli = listPeli[position]
        holder.data(peli)
    }


}