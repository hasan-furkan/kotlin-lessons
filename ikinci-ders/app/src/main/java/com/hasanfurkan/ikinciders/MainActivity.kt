package com.hasanfurkan.ikinciders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate geldi")
    }

    override fun onStart() {
        super.onStart()
        println("start geldi")
    }

    override fun onResume() {
        super.onResume()
        println("resume geldi")
    }

    override fun onPause() {
        super.onPause()
        println("pause geldi")
    }

    override fun onStop() {
        super.onStop()
        println("stop geldi")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("destroy geldi")
    }

    fun aktiviteDegistir(view: View) {

        val kullaniciVerisi = editText.text.toString()

        val intent = Intent(applicationContext, ikinciActivity::class.java)
        intent.putExtra("yollananVeri", kullaniciVerisi)
        startActivity(intent)
        finish()
    }

}

