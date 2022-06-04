package com.hasanfurkan.backpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.backpress.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var tasarim : ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityBBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.GoToC.setOnClickListener {
            startActivity(Intent(this@ActivityB, ActivityC::class.java))
        }
    }
}