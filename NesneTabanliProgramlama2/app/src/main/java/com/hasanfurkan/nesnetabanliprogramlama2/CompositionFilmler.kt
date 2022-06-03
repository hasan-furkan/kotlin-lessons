package com.hasanfurkan.nesnetabanliprogramlama2

fun main() {
    val k1 = Kategoriler(1, "dram")
    val k2 = Kategoriler(2,"komedi")

    val y1 = Yonetmenler(1,"Nuri Bilge Ceylan")
    val y2 = Yonetmenler(2, "Quentin Tarantino")

    val f1 = Filmler(1, "Django", 2013,k1,y1)
    println(f1.filmId)
    println(f1.filmAd)
    println(f1.filmYil)
    println(f1.kategori.kategoriId)
    println(f1.kategori.kategoriAd)
    println(f1.yonetmen.yonetmenId)
    println(f1.yonetmen.yonetmenAd)


}