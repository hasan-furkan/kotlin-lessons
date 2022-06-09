package com.hasanfurkan.radiobuttonvecheckboxkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.hasanfurkan.radiobuttonvecheckboxkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.button.setOnClickListener {
            val javaDurum = tasarim.java.isChecked
            val kotlinDurum = tasarim.kotlin.isChecked
            val barcelonaDurum = tasarim.radioButtonBarcelona.isChecked
            val realDurum = tasarim.radioButtonReal.isChecked

            Log.e("Java durum", javaDurum.toString())
            Log.e("Kotlin durum", kotlinDurum.toString())
            Log.e("Barcelona durum", barcelonaDurum.toString())
            Log.e("Real Madrid durum", realDurum.toString())
        }

        tasarim.radioButtonBarcelona.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){

                Toast.makeText(this, "Tebrikler dogru takim", Toast.LENGTH_LONG).show()
            }
        }
    }
}