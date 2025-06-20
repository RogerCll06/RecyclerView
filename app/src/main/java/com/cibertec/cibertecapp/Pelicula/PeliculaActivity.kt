package com.cibertec.cibertecapp.Pelicula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.cibertec.cibertecapp.R
import com.cibertec.cibertecapp.cursos.Curso
import com.cibertec.cibertecapp.cursos.CursosAdapter

class PeliculaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peliculas)
        val recyclerPeli =
            findViewById<RecyclerView>(R.id.RecyclerPeliculas)

        val peliList = arrayListOf(
            Pelicula(
                R.drawable.plato,
                "Spider-Man: No Way Home",
                "2021", "8.5",
                "Peter enfrenta enemigos de otros universos.",
                R.drawable.onepiece, "Lanzador de Telarañas"),
            Pelicula(
                R.drawable.imagen1,
                "Spider-Man: No Way Home",
                "2021", "8.5",
                "Peter enfrenta enemigos de otros universos.",
                R.drawable.onepiece, "Lanzador de Telarañas"),
            Pelicula(
                R.drawable.perfil2,
                "Spider-Man: No Way Home",
                "2021", "8.5",
                "Peter enfrenta enemigos de otros universos.",
                R.drawable.bembos_logo, "Lanzador de Telarañas"),
            Pelicula(
                R.drawable.perfil2,
                "Spider-Man: No Way Home",
                "2021", "8.5",
                "Peter enfrenta enemigos de otros universos.",
                R.drawable.hara, "Lanzador de Telarañas"),
            Pelicula(
                R.drawable.perfil2,
                "Spider-Man: No Way Home",
                "2021", "8.5",
                "Peter enfrenta enemigos de otros universos.",
                R.drawable.producto1, "Lanzador de Telarañas"),
            Pelicula(
                R.drawable.plato,
                "Spider-Man: No Way Home",
                "2021", "8.5",
                "Peter enfrenta enemigos de otros universos.",
                R.drawable.hara, "Lanzador de Telarañas")

        )
        val adapter = PeliculAdapter(peliList)
        recyclerPeli.adapter = adapter
        // recyclerCursos.layoutManager = LinearLayoutManager(this)
        // recyclerCursos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerPeli.layoutManager = GridLayoutManager(this, 2)
        /*recyclerPeli.layoutManager =
            StaggeredGridLayoutManager(2,
                LinearLayoutManager.VERTICAL)*/
    }


}