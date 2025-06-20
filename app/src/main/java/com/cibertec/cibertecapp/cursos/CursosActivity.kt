package com.cibertec.cibertecapp.cursos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.cibertec.cibertecapp.R

class CursosActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos)

        val recyclerCursos =
            findViewById<RecyclerView>(R.id.recyclerCursos)

        val cursosList = arrayListOf(
            Curso(R.drawable.plato,"Curso Android Cu"),
            Curso(R.drawable.plato,"Curso iOS"),
            Curso(R.drawable.plato,"Curso Java")
        )
        val adapter = CursosAdapter(cursosList)
        recyclerCursos.adapter = adapter
        // recyclerCursos.layoutManager = LinearLayoutManager(this)
        // recyclerCursos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        // recyclerCursos.layoutManager = GridLayoutManager(this, 2)
        recyclerCursos.layoutManager =
            StaggeredGridLayoutManager(1,
                LinearLayoutManager.VERTICAL)
    }

}