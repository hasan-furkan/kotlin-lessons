package com.hasanfurkan.oopkotlin

class Gitar : Ensturman, Dekorasyon {

    var marka : String? = null
    var elektro: Boolean? = null

    override var oda: String
        get() = "Salon"
        set(value) {}

}