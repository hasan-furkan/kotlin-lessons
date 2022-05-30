package com.hasanfurkan.nesnetabanliprogramlama

class Odev6 {

    fun odev6(gunSayisi : Int) : Int{
        val calismaSaat = gunSayisi * 8

        var maas = 0

        if(calismaSaat > 160) {
            val mesaiFazlasi = calismaSaat - 160
            maas  = 160 * 10 + mesaiFazlasi * 20
        }else {
            maas = calismaSaat * 10
        }

        return maas
    }
}