package com.hasanfurkan.veritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.veritasima.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

     tasarim.buttonGonder.setOnClickListener {

         val kisi = Kisiler(9999, "Ahmet", 1.68)


         val yeniIntent = Intent(this@MainActivity, ActivityB::class.java)
         yeniIntent.putExtra("mesaj", "merhaba")
         yeniIntent.putExtra("yas", 23)
         yeniIntent.putExtra("boy", 1.78)
         yeniIntent.putExtra("nesne", kisi)

         startActivity(yeniIntent)
     }
    }


}