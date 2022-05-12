package com.hasanfurkan.contextyapilari

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Hosgeldin", Toast.LENGTH_LONG).show()

    }

    fun mesajGoster(view: View){

        val uyariMesaji = AlertDialog.Builder(this@MainActivity)
        uyariMesaji.setTitle("Sifre Hatasi")
        uyariMesaji.setMessage("Sifreyi girmediniz bastan denemek ister misiniz")
        uyariMesaji.setPositiveButton("Evet", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "bastan deniyorsunuz", Toast.LENGTH_LONG).show()
        })
        uyariMesaji.setNegativeButton("Hayir") {dialogInterface, i ->
            Toast.makeText(this, "hayiri sectin", Toast.LENGTH_LONG ).show()
        }
        uyariMesaji.show()

    }




}