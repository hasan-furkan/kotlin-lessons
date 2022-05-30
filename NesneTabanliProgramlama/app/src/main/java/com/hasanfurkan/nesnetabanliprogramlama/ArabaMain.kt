package com.hasanfurkan.nesnetabanliprogramlama

fun main(){

    var bmw = Araba("kirmizi", 70, true)
    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()

    bmw.hizlan(100)
    bmw.hizlan(30)
    bmw.bilgiAl()

    bmw.yavasla(50)

    bmw.bilgiAl()

    var sahin = Araba("sari", 100, false)

    sahin.bilgiAl()

    sahin.hizlan(100)
    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
}