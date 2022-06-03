package com.hasanfurkan.collections2

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val girdi = Scanner(System.`in`)

    val personeller = ArrayList<Personel>()

    for (i in 1..5){

        println("$i. Personel isim :")
        val isim = girdi.next()

        println("$i. Personel adres il :")
        val il = girdi.next()

        println("$i. Personel ilce :")
        val ilce = girdi.next()

        val adres = Adres(il, ilce)

        val personel = Personel(i,isim, adres)
        personeller.add(personel)
    }

    for (p in personeller) {
        println("********")

        println("Personel isim : ${p.isim}")
        println("Personel no : ${p.no}")
        println("Personel adres il : ${p.adres.il}")
        println("Personel adres ilce : ${p.adres.ilce}")
    }
}