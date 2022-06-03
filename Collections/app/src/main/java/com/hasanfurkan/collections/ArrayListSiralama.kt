package com.hasanfurkan.collections

fun main() {
    val k1 = Kisiler(1,"Ahmet")
    val k2 = Kisiler(2,"Zeynep")
    val k3 = Kisiler(3,"Berna")

    val kisilerList = ArrayList<Kisiler>()

    kisilerList.add(k1)
    kisilerList.add(k2)
    kisilerList.add(k3)

    println("Once")

    for (k in kisilerList){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Sayisal Kucukten Buyuge")

    val siralamaList1 = kisilerList.sortedWith(compareBy{ it.kisiNo })

    for (k in siralamaList1){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Sayisal Buyukten Kucuge")

    val siralamaList2 = kisilerList.sortedWith(compareByDescending { it.kisiNo })

    for (k in siralamaList2){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Harf olarak siralama")

    val siralamaList3 = kisilerList.sortedWith(compareByDescending { it.kisiAd })

    for (k in siralamaList3){
        println("${k.kisiNo} - ${k.kisiAd}")
    }
}