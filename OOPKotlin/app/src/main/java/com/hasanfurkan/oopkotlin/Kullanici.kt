package com.hasanfurkan.oopkotlin

class Kullanici : Insan {

    var isim : String? = null
    var yas: Int? = null

    constructor(isim: String, yas: Int) {
        this.isim = isim
        this.yas = yas
//        println("constructor cagirildi")
    }

    init{
//        println("init cagirildi")
    }

}