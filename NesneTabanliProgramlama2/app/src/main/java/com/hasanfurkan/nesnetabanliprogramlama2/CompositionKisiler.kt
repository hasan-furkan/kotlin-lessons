package com.hasanfurkan.nesnetabanliprogramlama2

fun main() {
    val adres = Adres("Bursa", "Osmangazi")
    val kisi = Kisiler1("Ahmet", 18, adres)
    println(kisi.ad)
    println(kisi.yas)
    println(kisi.adres.il)
    println(kisi.adres.ilce)
}
