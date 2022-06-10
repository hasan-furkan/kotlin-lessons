package com.hasanfurkan.sayitahminetmeoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.sayitahminetmeoyunu.databinding.ActivitySonucBinding

class SonucActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivitySonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySonucBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val sonuc = intent.getBooleanExtra("sonuc", false)

        if(sonuc){
            tasarim.textViewSonuc.text = "KAZANDINIZ"
            tasarim.imageViewSonuc.setImageResource(R.drawable.gulen_resim)
        }else{
            tasarim.textViewSonuc.text = "KAYBETTINIZ"
            tasarim.imageViewSonuc.setImageResource(R.drawable.uzgun_resim)
        }

        tasarim.buttonYeniden.setOnClickListener {
            val intent = Intent(this@SonucActivity, TahminActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}