package com.hasanfurkan.fotografpaylasmauygulamasi.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.hasanfurkan.fotografpaylasmauygulamasi.R
import kotlinx.android.synthetic.main.activity_main.*

class KullaniciActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        val guncelKullanici = auth.currentUser

        if(guncelKullanici != null){
            val intent = Intent(this, HaberlerActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    fun girisYap(view: View){


        auth.signInWithEmailAndPassword(textEmail.text.toString(), textPassword.text.toString())
            .addOnCompleteListener{ task ->
                if(task.isSuccessful){
                    val guncelKullanici = auth.currentUser?.email.toString()
                    Toast.makeText(this, "Hosgeldiniz: $guncelKullanici", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, HaberlerActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }.addOnFailureListener { exception ->
                Toast.makeText(this, exception.localizedMessage, Toast.LENGTH_LONG).show()
            }



    }

    fun kayitOl(view: View){

        val email = textEmail.text.toString()
        val password = textPassword.text.toString()

        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{ task ->
            // asenkron calisacak kod blogu
            if(task.isSuccessful){
                // diger aktiviteye gidicez basarili olduysa
                val intent = Intent(this, HaberlerActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.addOnFailureListener{ exception ->
            Toast.makeText(applicationContext, exception.localizedMessage, Toast.LENGTH_LONG).show()
        }
    }

}