package com.hasanfurkan.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Superwoman")
        superKahramanIsimleri.add("Wolverine")
        superKahramanIsimleri.add("Badchar")

//        Verimsiz tanimlamalar

//        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.batman)
//        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)
//        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)
//        val superwomanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superwoman)
//        val wolverineBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.wolverine)
//        val badcharBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.badchar)
//
//        var superKahramanGorselleri = ArrayList<Bitmap>()
//        superKahramanGorselleri.add(batmanBitmap)
//        superKahramanGorselleri.add(spidermanBitmap)
//        superKahramanGorselleri.add(supermanBitmap)
//        superKahramanGorselleri.add(superwomanBitmap)
//        superKahramanGorselleri.add(wolverineBitmap)
//        superKahramanGorselleri.add(badcharBitmap)

//        Verimli tanimlama

        val batmanDrawableId = R.drawable.batman
        val spidermanDrawableId = R.drawable.spiderman
        val supermanDrawableId = R.drawable.superman
        val superwomanDrawableId = R.drawable.superwoman
        val wolverineDrawableId = R.drawable.wolverine
        val badcharDrawableId = R.drawable.badchar

        var superKahramanDrawable = ArrayList<Int>()
        superKahramanDrawable.add(batmanDrawableId)
        superKahramanDrawable.add(spidermanDrawableId)
        superKahramanDrawable.add(supermanDrawableId)
        superKahramanDrawable.add(superwomanDrawableId)
        superKahramanDrawable.add(wolverineDrawableId)
        superKahramanDrawable.add(badcharDrawableId)


        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsimleri, superKahramanDrawable)
        recyclerView.adapter = adapter
    }
}