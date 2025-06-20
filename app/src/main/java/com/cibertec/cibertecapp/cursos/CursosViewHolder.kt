package com.cibertec.cibertecapp.cursos

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class CursosViewHolder (inflater: LayoutInflater,
    parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_curso,
        parent, false)) {

    private var imgCurso: ImageView =
            itemView.findViewById(R.id.imgCurso)
    private var textNombreCurso: TextView =
        itemView.findViewById(R.id.textNombreCurso)

    fun data(curso: Curso) {
        textNombreCurso.text = curso.nombre
        imgCurso.setImageResource(curso.imagen)
    }
}