package com.hasanfurkan.nesnetabanliprogramlama

class Otobus (var kapasite: Int, var nereden: String, var nereye: String, var mevcutYolcu: Int) {

    fun yolcuAL(yolcu: Int) {
        mevcutYolcu = mevcutYolcu + yolcu
    }

    fun yolcuIndir(yolcu: Int) {
        mevcutYolcu = mevcutYolcu - yolcu
    }

    fun bilgiAl() {
        println("kapasite : $kapasite")
        println("nereden : $nereden")
        println("nereye : $nereye")
        println("mevcutYolcu : $mevcutYolcu")
    }

}