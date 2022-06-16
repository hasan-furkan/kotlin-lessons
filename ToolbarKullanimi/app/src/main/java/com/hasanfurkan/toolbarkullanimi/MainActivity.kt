package com.hasanfurkan.toolbarkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.title = "Ozel baslik"
        toolbar.subtitle = "Ozel Alt Baslik"
        toolbar.setLogo(R.drawable.resim)
        toolbar.setTitleTextColor(resources.getColor(R.color.white))

        setSupportActionBar(toolbar)
    }
}