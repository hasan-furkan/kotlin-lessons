package com.hasanfurkan.collections2

fun main() {
    val o1 = Ogrenci(1, "ahmet", "11F")
    val o2 = Ogrenci(2, "zeynep", "10R")
    val o3 = Ogrenci(3, "Ceyda", "9Z")
    val o4 = Ogrenci(4,"Ece", "12a")

    val ogrenciler = HashSet<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)

    for (o in ogrenciler) {
        println("Ogrenci No: ${o.no}")
        println("Ogrenci Ad: ${o.ad}")
        println("Ogrenci Sinif: ${o.sinif}")
    }
}