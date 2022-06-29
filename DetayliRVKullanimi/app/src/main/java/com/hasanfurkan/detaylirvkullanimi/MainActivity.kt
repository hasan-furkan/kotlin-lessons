package com.hasanfurkan.detaylirvkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var filmler : ArrayList<Filmler>
    private lateinit var filmlerAdapter: FilmlerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)

        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val f1 = Filmler(1, "Django", "django", 12.99)
        val f2 = Filmler(2, "Inception", "inception", 13.99)
        val f3 = Filmler(3, "Insterstellar", "interstellar", 16.99)
        val f4 = Filmler(4, "The HateFul Eight", "thehatefuleight", 22.99)
        val f5 = Filmler(5, "The Pianist", "thepianist", 12.99)
        val f6 = Filmler(6, "Bir Zamanlar Anadoluda", "birzamanlaranadoluda", 92.99)

        filmler = ArrayList<Filmler>()
        filmler.add(f1)
        filmler.add(f2)
        filmler.add(f3)
        filmler.add(f4)
        filmler.add(f5)
        filmler.add(f6)

        filmlerAdapter = FilmlerAdapter(this, filmler)

        rv.adapter = filmlerAdapter
    }
}