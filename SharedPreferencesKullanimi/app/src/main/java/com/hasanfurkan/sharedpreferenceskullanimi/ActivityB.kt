package com.hasanfurkan.sharedpreferenceskullanimi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val sp = getSharedPreferences("kisiselBilgiler", Context.MODE_PRIVATE)
        val editor = sp.edit()

        val ad = sp.getString("ad", "isim yok")
        val yas = sp.getInt("yas", 0)
        val boy = sp.getFloat("boy", 0.0f)
        val bekarMi = sp.getBoolean("bekarMi", false)
        val arkadaslari = sp.getStringSet("arkadaslistesi", null)

        Log.e("ad", ad.toString())
        Log.e("yas", yas.toString())
        Log.e("boy", boy.toString())
        Log.e("bekarMi", bekarMi.toString())
        if(arkadaslari != null){
            for (a in arkadaslari){
                Log.e("arkadaslari", a)
            }
        }



        buttonDelete.setOnClickListener {


            Log.e("ad", ad.toString())

        }
    }
}