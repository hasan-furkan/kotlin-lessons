package com.hasanfurkan.nesnetabanliprogramlama

class Odev3 {
    fun odev3( faktoriyel : Int) : Long {
        var sonuc : Long = 1

        for (i in sonuc..faktoriyel){
            sonuc *= i.toLong()
        }

        return sonuc

    }
}