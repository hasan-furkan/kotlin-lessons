package com.hasanfurkan.collections2

fun main() {
    val o1 = Ogrenci(1,"ahmet", "11F")
    val o2 = Ogrenci(2,"zeynep", "10R")
    val o3 = Ogrenci(3,"Ceyda", "12A")

    val ogrenciler = HashMap<Int, Ogrenci>()

    ogrenciler.put(o1.no, o1)
    ogrenciler.put(o2.no, o2)
    ogrenciler.put(o3.no, o3)

    for((k,v)in ogrenciler){
        println("*******")

        println("Ogrenci No : $k")
        println("Ogrenci Ad : ${v.ad}")
        println("Ogrenci Sinif : ${v.sinif}")
    }
}