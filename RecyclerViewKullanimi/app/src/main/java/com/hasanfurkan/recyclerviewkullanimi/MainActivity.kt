package com.hasanfurkan.recyclerviewkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var ulkelerList : ArrayList<Ulkeler>
    private lateinit var adapter : RVAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this@MainActivity)

        val u1 = Ulkeler(1, "Turkiye")
        val u2 = Ulkeler(2, "Ispanya")
        val u3 = Ulkeler(3, "Amerika")
        val u4 = Ulkeler(4, "Japonya")
        val u5 = Ulkeler(5, "Isvec")

        ulkelerList = ArrayList<Ulkeler>()

        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)
        ulkelerList.add(u5)

        adapter = RVAdapter(this, ulkelerList)

        rv.adapter = adapter

    }
}