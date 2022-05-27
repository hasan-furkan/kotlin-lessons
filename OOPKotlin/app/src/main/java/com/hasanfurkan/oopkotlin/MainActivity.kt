package com.hasanfurkan.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ////////////////////////////////// siniflar //////////////////////////////////////////////////////

        val kullanici = Kullanici("Hasan Furkan", 20)
        val digerKullanici = Kullanici("hasan", 50)


        ////////////////////////////////// Encapsulation //////////////////////////////////////////////////////

        val ahmet = Sanatci("ahmet", 50, "muzisyen")

        println(ahmet.isim)

        ////////////////////////////////// Inheritance //////////////////////////////////////////////////////

        val mehmet= OzelSanatci("mehmet", 12, "ozelSanatci")
        mehmet.sarkiSoyle()

        ////////////////////////////////// Polymorphism //////////////////////////////////////////////////////

//        Statik Polymorphism
        val islem = Islemler()

            println(islem.carpma())
            println(islem.carpma(2,3))
            println(islem.carpma(2,3,4))


//        Dinamik Polymorphism

        val barley = Kopek()

        println(barley.sesCikar())
        println(barley.kopekFonksiyonu())

        ////////////////////////////////// Abstraction & Interface //////////////////////////////////////////////////////

        kullanici.insanFonksiyonu()
        var gitar = Gitar()
        gitar.marka = "gitar markasi"
        gitar.elektro = true

        gitar.bilgi()
        println(gitar.oda)

        ////////////////////////////////// Lambda Expressions //////////////////////////////////////////////////////


       val  yazdigimiYazdirLambda = {verilenString : String -> println(verilenString)}
        yazdigimiYazdirLambda("test lambda")

        var carpmaIslemiLambda = {a : Int, b : Int  -> println(a * b)}

        carpmaIslemiLambda(2,3)

        val carpma2 : (Int, Int) -> Int = {a,b -> a *b}
        println(carpma2(2,3))

    }

    fun yazdigimiYazdir(string: String){
        println(string)
    }
}