package com.hasanfurkan.sayitahminetmeoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hasanfurkan.sayitahminetmeoyunu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonBasla.setOnClickListener {
            Toast.makeText(this, "0 ve 100 arasinda sayi tahmin etmeye calisin.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,TahminActivity::class.java)

            startActivity(intent)
        }
    }
}