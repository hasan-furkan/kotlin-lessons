package com.hasanfurkan.alertviewornek

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNormal.setOnClickListener {
            val ad = AlertDialog.Builder(this@MainActivity)
            ad.setMessage("Mesaj")
            ad.setTitle("Baslik")
            ad.setIcon(R.drawable.resim)
            ad.setPositiveButton("TAMAM"){dialogInterface , i ->
                Toast.makeText(this@MainActivity, "TAMAM'A tiklandi", Toast.LENGTH_SHORT).show()

            }
            ad.setNegativeButton("iPTAL"){dialogInterface , i ->
                Toast.makeText(this@MainActivity, "IPTAL'e tiklandi", Toast.LENGTH_SHORT).show()

            }
            ad.create().show()

    }
        buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.layout_tasarim, null)

            val edittext = tasarim.findViewById(R.id.alertEdit) as EditText


            val ad = AlertDialog.Builder(this@MainActivity)
            ad.setMessage("Mesaj")
            ad.setTitle("Baslik")
            ad.setIcon(R.drawable.resim)

            ad.setView(tasarim)

            ad.setPositiveButton("Kaydet"){dialogInterface , i ->
                val alinanVeri = edittext.text.toString()



                Toast.makeText(this@MainActivity, "$alinanVeri Kaydedildi", Toast.LENGTH_SHORT).show()

            }
            ad.setNegativeButton("iPTAL"){dialogInterface , i ->
                Toast.makeText(this@MainActivity, "alinan veri kaydedilmedi", Toast.LENGTH_SHORT).show()

            }
            ad.create().show()

        }
}
}