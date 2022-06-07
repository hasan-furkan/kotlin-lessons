package com.hasanfurkan.finishmethod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.finishmethod.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonOyna.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityOyunEkrani::class.java)

            startActivity(intent)
        }
    }
}