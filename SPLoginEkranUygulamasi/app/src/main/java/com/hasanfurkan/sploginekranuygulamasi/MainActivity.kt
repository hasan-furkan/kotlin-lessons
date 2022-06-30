package com.hasanfurkan.sploginekranuygulamasi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("KullaniciBilgileri", Context.MODE_PRIVATE)

        val otoGirisAd = sp.getString("kullaniciadi", "kullanici ismi yok")
        val otoGirisSifre = sp.getString("kullanicisifre", "kullanici sifre yok")

        if(otoGirisAd == "admin" && otoGirisSifre == "123"){
            startActivity(Intent(this@MainActivity, AnaEkranActivity::class.java))
            finish()
        }

        buttonGiris.setOnClickListener {

            val ka = editTextKullaniciAdi.text.toString()
            val sf = editTextKullaniciSifre.text.toString()

            if(ka == "admin" && sf == "123"){


                val editor = sp.edit()

                editor.putString("kullaniciadi", ka)
                editor.putString("kullanicisifre", sf)
                editor.commit()

                startActivity(Intent(this@MainActivity, AnaEkranActivity::class.java))
                finish()
            }else{
                Toast.makeText(applicationContext, "Hatali Giris", Toast.LENGTH_SHORT).show()
            }
        }
    }
}