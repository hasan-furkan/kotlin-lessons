package com.hasanfurkan.collections

fun main() {
    val meyveler = ArrayList<String>()

    meyveler.add("Cilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    for (meyve in meyveler){
        println("sonuc : $meyve")
    }

    for((index, meyve) in meyveler.withIndex()){
        println("sonuc: $index : $meyve")
    }
}