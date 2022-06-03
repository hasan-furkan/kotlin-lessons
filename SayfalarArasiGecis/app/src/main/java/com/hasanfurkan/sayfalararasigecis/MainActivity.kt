package com.hasanfurkan.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import com.hasanfurkan.sayfalararasigecis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGoToB.setOnClickListener {
            val yeniIntent = Intent(this@MainActivity, ActivityB::class.java)
            startActivity(yeniIntent)
        }

    }
}