package com.hasanfurkan.kullaniciningirdigiveriyitasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.kullaniciningirdigiveriyitasima.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGonder.setOnClickListener {
            val yeniIntent = Intent(this@MainActivity, ActivityB::class.java)
            val alinanVeri = tasarim.editTextGirdi.text.toString()
            yeniIntent.putExtra("girdi", alinanVeri)
            startActivity(yeniIntent)
        }

    }
}