package com.hasanfurkan.nesnetabanliprogramlama

class Odev4 {

    fun odev4(kelime: String, harf: Char) : Int{
        var sonuc = 0

        for (i in kelime){
            if(i == harf){
                sonuc++
            }
        }
        return sonuc

    }
}