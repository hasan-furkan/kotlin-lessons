package com.hasanfurkan.sayitahminetmeoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.hasanfurkan.sayitahminetmeoyunu.databinding.ActivityTahminBinding
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityTahminBinding

    private var rastgeleSayi = 0
    private var sayac = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityTahminBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        rastgeleSayi = Random.nextInt(101)
        Log.e("rastgele sayi", rastgeleSayi.toString())

        tasarim.buttonTahmin.setOnClickListener {


            sayac = sayac -1
            val tahmin = tasarim.textGirdi.text.toString().toInt()



                if(tahmin == rastgeleSayi){
                    val intent = Intent(this@TahminActivity,SonucActivity::class.java)

                    intent.putExtra("sonuc",true)

                    finish()

                    startActivity(intent)

                    return@setOnClickListener
                }

                if(tahmin > rastgeleSayi){

                    tasarim.textViewYardim.text = "Azalt"
                    tasarim.textViewKalanHak.text = "Kalan Hak : $sayac"

                }

                if(tahmin < rastgeleSayi){

                    tasarim.textViewYardim.text = "Arttır"
                    tasarim.textViewKalanHak.text = "Kalan Hak : $sayac"
                }

                if(sayac == 1){
                    Toast.makeText(this, "Son 1 hakkiniz kaldi dikkatli tahmin edin", Toast.LENGTH_SHORT).show()
                }

                if(sayac == 0){

                    val intent = Intent(this@TahminActivity,SonucActivity::class.java)

                    intent.putExtra("sonuc",false)

                    finish()

                    startActivity(intent)

                }

                tasarim.textGirdi.setText("")




        }
    }
}