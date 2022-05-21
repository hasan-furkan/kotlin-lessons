package com.hasanfurkan.handlerrunnable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var numara = 0
    var runnable : Runnable = Runnable {  }
    var handler  = Handler(Looper.myLooper()!!)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun baslat(view: View){
//        numara = 0
    runnable = object : Runnable{
        override fun run() {
            numara += 1

            textView.text = "sayac ${numara}"
            handler.postDelayed(runnable, 1000)
        }

    }
        handler.post(runnable)

    }

    fun durdur(view: View){
        handler.removeCallbacks(runnable)
        numara = 0
        textView.text = "sayac: 0"
    }
}