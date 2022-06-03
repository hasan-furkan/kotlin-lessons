package com.hasanfurkan.collections

fun main() {
    val u1 = Urun(1,"saat", 130.0)
    val u2 = Urun(2,"TV", 1750.0)
    val u3 = Urun(2,"Bilgisayar", 960.0)

    val urunler = ArrayList<Urun>()

    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for(urun in urunler){
        println("&&&&&")
        println("Urun no : ${urun.urunNo}")
        println("Urun no : ${urun.urunAd}")
        println("Urun no : ${urun.urunFiyat}")
    }
}
