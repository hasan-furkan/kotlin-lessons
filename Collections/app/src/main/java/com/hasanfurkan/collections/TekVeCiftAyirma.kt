package com.hasanfurkan.collections

fun main() {
    val sayilar = ArrayList<Int>()
    sayilar.add(1)
    sayilar.add(23)
    sayilar.add(32)
    sayilar.add(47)
    sayilar.add(59)
    sayilar.add(50)
    sayilar.add(100)
    sayilar.add(18)
    sayilar.add(54)

    val tekSayilar = ArrayList<Int>()
    val ciftSayilar = ArrayList<Int>()

    for (s in sayilar){
       val sonuc = s % 2
        if(sonuc == 0){
            ciftSayilar.add(s)
        }else{
            tekSayilar.add(s)
        }
    }
    println("tekler")
    for(t in tekSayilar){
        println(t)
    }

    println("ciftler")
    for(c in ciftSayilar){
        println(c)
    }
}