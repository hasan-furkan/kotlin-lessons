package com.hasanfurkan.kullaniciningirdigiveriyitasima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.kullaniciningirdigiveriyitasima.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var tasarim : ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityBBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        val gelenVeri = intent.getStringExtra("girdi")

        tasarim.textViewCikti.text = gelenVeri
    }
}