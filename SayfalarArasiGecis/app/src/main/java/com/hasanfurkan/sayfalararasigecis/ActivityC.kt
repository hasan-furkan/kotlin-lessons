package com.hasanfurkan.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.sayfalararasigecis.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private lateinit var tasarim: ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityCBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
    }


    override fun onBackPressed() {
        val yeniIntent = Intent(this@ActivityC, MainActivity::class.java)
        startActivity(yeniIntent)
        finish()
    }
}