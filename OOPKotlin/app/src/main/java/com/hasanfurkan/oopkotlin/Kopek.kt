package com.hasanfurkan.oopkotlin

class Kopek : Hayvan() {

   fun kopekFonksiyonu() {
       super.sesCikar()
   }

    override fun sesCikar(){
        println("kopek sinifi")
    }
}