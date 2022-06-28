package com.hasanfurkan.floatingactionbuttonkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener {
            val ad = editAd.text.toString().trim()
            val tel = editPhone.text.toString().trim()

            if(TextUtils.isEmpty(ad)){
                Toast.makeText(this@MainActivity, "isim kismi bos birakilamaz", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(tel)){
                Toast.makeText(this@MainActivity, "tel kismi bos birakilamaz", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(tel.length < 6){
                Toast.makeText(this@MainActivity, "tel 6 haneden az olamaz", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this@MainActivity, "$ad, isimli kullanicin numarasi $tel'dir", Toast.LENGTH_SHORT).show()
        }
    }
}