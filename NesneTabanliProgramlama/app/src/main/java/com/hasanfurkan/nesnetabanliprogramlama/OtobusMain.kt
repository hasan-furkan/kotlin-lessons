package com.hasanfurkan.nesnetabanliprogramlama

fun main(){
    val kamilKoc = Otobus(56, "ankaradan", "istanbula", 45)


    
    kamilKoc.bilgiAl()
    kamilKoc.kapasite = 100
    kamilKoc.bilgiAl()

    kamilKoc.yolcuAL(20)

    kamilKoc.bilgiAl()

    kamilKoc.yolcuIndir(50)
    kamilKoc.bilgiAl()
}