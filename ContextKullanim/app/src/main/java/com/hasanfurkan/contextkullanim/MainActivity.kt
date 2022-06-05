package com.hasanfurkan.contextkullanim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hasanfurkan.contextkullanim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.button.setOnClickListener {
            Toast.makeText(this, "Merhaba", Toast.LENGTH_SHORT).show()
        }
    }
}