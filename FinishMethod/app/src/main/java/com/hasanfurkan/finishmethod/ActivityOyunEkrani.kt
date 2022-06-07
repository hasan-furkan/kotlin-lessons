package com.hasanfurkan.finishmethod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.finishmethod.databinding.ActivityOyunEkraniBinding

class ActivityOyunEkrani : AppCompatActivity() {
    private lateinit var tasarim : ActivityOyunEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonBitir.setOnClickListener {
            val intent = Intent(this@ActivityOyunEkrani, ActivitySonuc::class.java)
            finish()
            startActivity(intent)
        }
    }
}