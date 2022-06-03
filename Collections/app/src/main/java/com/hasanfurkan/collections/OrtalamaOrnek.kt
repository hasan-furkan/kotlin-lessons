package com.hasanfurkan.collections

fun main() {
    val sayilar = ArrayList<Int>()

    sayilar.add(30)
    sayilar.add(40)
    sayilar.add(50)
    sayilar.add(70)
    sayilar.add(100)
    sayilar.add(60)

    var sonuc = 0

    for(s in sayilar){
        sonuc += s
    }
    println(sonuc / sayilar.size)
}