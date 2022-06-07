package com.hasanfurkan.backpress

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hasanfurkan.backpress.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private lateinit var tasarim : ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityCBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.GoToD.setOnClickListener {
            startActivity(Intent(this@ActivityC, ActivityD::class.java))
        }
    }
}