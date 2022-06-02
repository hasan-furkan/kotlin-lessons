package com.hasanfurkan.viewbindingkullanim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.hasanfurkan.viewbindingkullanim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonYap.setOnClickListener {
            Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()
        }
    }
}