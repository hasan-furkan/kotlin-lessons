package com.hasanfurkan.sploginekranuygulamasi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ana_ekran.*

class AnaEkranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ana_ekran)
        val sp = getSharedPreferences("KullaniciBilgileri", Context.MODE_PRIVATE)

        val ka = sp.getString("kullaniciadi", "kullanici ismi yok")
        val sf = sp.getString("kullanicisifre", "kullanici sifre yok")

        textViewCikti.text = "kullanici: $ka => sifre: $sf"
        buttonCikis.setOnClickListener {

            val editor = sp.edit()

            editor.remove("kullaniciadi")
            editor.remove("kullanicisifre")
            editor.commit()

            startActivity(Intent(this@AnaEkranActivity, MainActivity::class.java))
            finish()
        }
    }
}