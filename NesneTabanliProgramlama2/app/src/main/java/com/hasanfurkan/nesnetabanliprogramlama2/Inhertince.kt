package com.hasanfurkan.nesnetabanliprogramlama2

fun main() {
    val araba = Araba("kirmizi", "otomatik", "sedan")

    println(araba.renk)
    println(araba.vites)
    println(araba.kasaTipi)

    val nissan = Nissan("kirmizi", "otomatik", "sedan", "micra")

    println(nissan.renk)
    println(nissan.model)
    println(nissan.kasaTipi)


}