package com.hasanfurkan.oopkotlin

open class Sanatci(isim: String, yas: Int, meslek: String) {
    var isim: String? = isim
        private set
        get

    private var meslek : String? = meslek

    var yas: Int? = yas
        private set
    get
}