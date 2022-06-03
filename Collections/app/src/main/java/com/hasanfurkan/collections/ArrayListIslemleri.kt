package com.hasanfurkan.collections

fun main() {
    val meyveler = ArrayList<String>()

    meyveler.add("Cilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")
    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.size)
    println(meyveler.first())
    println(meyveler.last())

    println(meyveler.contains("Kiraz"))

    println(meyveler.sort())
    println(meyveler.toString())

    println(meyveler.reverse())
    println(meyveler.toString())

    meyveler.removeAt(3)
    println(meyveler.toString())

    meyveler.remove("Kivi")
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())

}