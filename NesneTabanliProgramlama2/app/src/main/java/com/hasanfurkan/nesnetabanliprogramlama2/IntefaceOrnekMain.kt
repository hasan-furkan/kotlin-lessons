package com.hasanfurkan.nesnetabanliprogramlama2

fun main() {
    val aslan = Aslan()
    val amasyaElmasi: Elma = AmasyaElmasi()
    val elma = Elma()
    val tavuk : Eateble = Tavuk()

    val nesneler = arrayOf(aslan, amasyaElmasi, elma, tavuk)

    for(nesne in nesneler){
        if(nesne is Eateble){
            nesne.howToEat()
        }
        if(nesne is Squeezable){
            nesne.howToSqueeze()
        }
    }
}