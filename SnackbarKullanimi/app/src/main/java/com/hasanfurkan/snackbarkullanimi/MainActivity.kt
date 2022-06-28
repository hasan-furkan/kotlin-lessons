package com.hasanfurkan.snackbarkullanimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.hasanfurkan.snackbarkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonNormal.setOnClickListener {

            Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()

        }

        tasarim.buttonGeriDonus.setOnClickListener {

            Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT)
                .setAction("Evet"){
                    Snackbar.make(it, "Nasilsin", Snackbar.LENGTH_SHORT).show()
                }.show()

        }

        tasarim.buttonOzel.setOnClickListener {

            val sb = Snackbar.make(it, "Internet baglantisi yok", Snackbar.LENGTH_LONG)

            sb.setAction("Tekrar Dene"){

            }

            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.BLUE)
            sb.setBackgroundTint(Color.WHITE)

            sb.show()

        }
    }
}