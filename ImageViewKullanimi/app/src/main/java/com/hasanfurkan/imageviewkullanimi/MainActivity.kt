package com.hasanfurkan.imageviewkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.imageviewkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonResim1.setOnClickListener {
            tasarim.imageView.setImageResource(R.drawable.ic_baseline_android_24)
        }

        tasarim.buttonResim2.setOnClickListener {
            tasarim.imageView.setImageResource(resources.getIdentifier("resim", "drawable", packageName))
        }
    }
}