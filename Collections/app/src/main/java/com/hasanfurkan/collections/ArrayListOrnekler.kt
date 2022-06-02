package com.hasanfurkan.collections

fun main() {
    val liste = ArrayList<String>()

    val liste2 : ArrayList<Int> = ArrayList<Int>()

    val meyveler = ArrayList<String>()

    meyveler.add("Cilek")
    meyveler.add("Muz")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")
    meyveler.add("Elma")

    println(meyveler.toString())

    val str = meyveler.get(2)
    println(str)

    val str1 = meyveler[2]
    println(str1)

    meyveler.add("Mandalina")
    println(meyveler.toString())

    meyveler[2] = "Ananas"
    println(meyveler.toString())

    meyveler.add(3,"Portakal")
    println(meyveler.toString())


}