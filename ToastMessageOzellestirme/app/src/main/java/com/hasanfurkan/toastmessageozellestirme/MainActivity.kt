package com.hasanfurkan.toastmessageozellestirme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNormal.setOnClickListener {
            Toast.makeText(this, "Merhaba", Toast.LENGTH_SHORT).show()
        }

        buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.toast_message, null)

            val text = tasarim.findViewById(R.id.textViewMessage) as TextView

            text.text = "Merhaba ozel mesaj"

            val toastOzel = Toast(applicationContext)

            toastOzel.view = tasarim // artik desteklenmiyor
            toastOzel.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL,0,0)
            toastOzel.duration = Toast.LENGTH_LONG
            toastOzel.show()
        }
    }
}