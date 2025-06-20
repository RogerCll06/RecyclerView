package com.cibertec.cibertecapp.cursos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CursosAdapter(val listCursos: List<Curso>):
    RecyclerView.Adapter<CursosViewHolder>() {

    // Inicializar el ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CursosViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CursosViewHolder(inflater, parent)
    }
    // Indicar el numero de elementos a mostrar
    override fun getItemCount(): Int {
        return listCursos.size
    }
    // Asignar datos al ViewHolder
    override fun onBindViewHolder(holder: CursosViewHolder,
                                  position: Int) {
        val curso = listCursos[position]
        holder.data(curso)
    }


}