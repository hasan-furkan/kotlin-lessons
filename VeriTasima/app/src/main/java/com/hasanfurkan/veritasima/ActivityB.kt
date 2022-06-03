package com.hasanfurkan.veritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hasanfurkan.veritasima.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var tasarim : ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityBBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val gelenMesaj = intent.getStringExtra("mesaj")
        val gelenYas = intent.getIntExtra("yas", 0)
        val gelenBoy = intent.getDoubleExtra("boy", 0.0)


        Log.e("Mesaj", gelenMesaj.toString())
        Log.e("yas", gelenYas.toString())
        Log.e("boy", gelenBoy.toString())

        val gelenNesne = intent.getSerializableExtra("nesne") as Kisiler

            Log.e("Kisi Tc No",gelenNesne.tcNo.toString())
            Log.e("Kisi ISIM",gelenNesne.isim)
            Log.e("Kisi Boy",gelenNesne.boy.toString())
    }
}