package com.hasanfurkan.nesnetabanliprogramlama2

class Mudur: Personel() {
    fun iseAl(p:Personel){
        p.iseAlindi()
    }

    fun terfiEttir(p:Personel){

        if(p is Ogretmen){
            p.maas()
        }else{
            println("isci terfi alamaz")
        }

    }
}