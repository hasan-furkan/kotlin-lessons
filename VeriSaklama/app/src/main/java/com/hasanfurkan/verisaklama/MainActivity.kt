package com.hasanfurkan.verisaklama

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences
    var alinanKullaniciAdi : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         sharedPreferences = this.getSharedPreferences("com.hasanfurkan.verisaklama",
            MODE_PRIVATE)

        alinanKullaniciAdi = sharedPreferences.getString("kullanici", "")

        if(alinanKullaniciAdi != null) {
            textView.text = "alinan kullanici adi  = ${alinanKullaniciAdi}"
        }
    }

    fun kaydet(view: View){
        val kullaniciAdi = editText.text.toString()
        if(kullaniciAdi == "") {
            Toast.makeText(this, "bos birakmayin", Toast.LENGTH_LONG).show()
        }else {
            sharedPreferences.edit().putString("kullanici", kullaniciAdi).apply()
            textView.text = "Kaydedilen kullanici adi => ${kullaniciAdi}"
        }
    }

    fun sil(view: View){
        alinanKullaniciAdi = sharedPreferences.getString("kullanici", "")

        if(alinanKullaniciAdi != null) {
            textView.text = "kaydedilen kullanici adi"
            sharedPreferences.edit().remove("kullanici").apply()
        }
    }
}