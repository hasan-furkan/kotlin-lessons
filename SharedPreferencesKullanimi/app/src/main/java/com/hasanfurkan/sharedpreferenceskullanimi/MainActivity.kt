package com.hasanfurkan.sharedpreferenceskullanimi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("kisiselBilgiler", Context.MODE_PRIVATE)

        val editor = sp.edit()

        editor.putString("ad", "hasan")
        editor.putInt("yas", 20)
        editor.putFloat("boy", 1.78f)
        editor.putBoolean("bekarMi", true)

        val arkadaslistesi = HashSet<String>()
        arkadaslistesi.add("zeynep")
        arkadaslistesi.add("irem")
        arkadaslistesi.add("furkan")
        arkadaslistesi.add("ali")

        editor.putStringSet("arkadaslistesi", arkadaslistesi)

        editor.commit()
        editor.remove("ad")

        editor.commit()

        buttonGit.setOnClickListener {
            startActivity(Intent(this@MainActivity, ActivityB::class.java))
        }
    }
}