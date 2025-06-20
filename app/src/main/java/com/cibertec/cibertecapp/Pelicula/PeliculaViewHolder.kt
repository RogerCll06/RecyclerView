package com.cibertec.cibertecapp.Pelicula

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class PeliculaViewHolder (inflater: LayoutInflater,
    parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(
        R.layout.item_comida,
        parent, false)){
    val imgPelicula: ImageView = itemView.findViewById(R.id.imageProfile)
    val txtNombre: TextView = itemView.findViewById(R.id.textNombre)
    val txtFecha: TextView = itemView.findViewById(R.id.textFecha)
    val txtNombreProducto: TextView = itemView.findViewById(R.id.textNombreProducto)
    val txtValoracion: TextView = itemView.findViewById(R.id.textValoracion)
    val txtDescripcion: TextView = itemView.findViewById(R.id.textDescripcion)
    val imgProducto: ImageView = itemView.findViewById(R.id.imageProducto)

    fun data(pelicula: Pelicula) {
        imgPelicula.setImageResource(pelicula.imagen)
        txtNombre.text = pelicula.nombre
        txtFecha.text = pelicula.fecha
        txtValoracion.text = pelicula.valoracion
        txtDescripcion.text = pelicula.descripcion
        imgProducto.setImageResource(pelicula.imgProduct)
        txtNombreProducto.text = pelicula.nombreProducto
    }
}