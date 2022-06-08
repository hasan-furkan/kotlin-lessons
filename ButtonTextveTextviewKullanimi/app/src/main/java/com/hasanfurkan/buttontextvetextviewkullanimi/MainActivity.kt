package com.hasanfurkan.buttontextvetextviewkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.buttontextvetextviewkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.button.setOnClickListener {
            val alinanVeri = tasarim.editText.text.toString()

            tasarim.textView.text = alinanVeri
        }
    }
}