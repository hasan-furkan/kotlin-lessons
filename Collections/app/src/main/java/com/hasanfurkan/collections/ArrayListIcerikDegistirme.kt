package com.hasanfurkan.collections

fun main() {
    val sayilar = ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(4)
    sayilar.add(5)

    for((i,s) in sayilar.withIndex()){
        val sonuc = s * 2
        sayilar[i] = sonuc
    }

    for (s in sayilar){
        println(s)
    }
}