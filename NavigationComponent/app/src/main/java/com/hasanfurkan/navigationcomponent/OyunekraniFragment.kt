package com.hasanfurkan.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.hasanfurkan.navigationcomponent.databinding.FragmentOyunekraniBinding

class OyunekraniFragment : Fragment() {

    private lateinit var tasarim : FragmentOyunekraniBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentOyunekraniBinding.inflate(layoutInflater, container, false)

        val bundle : OyunekraniFragmentArgs by navArgs()

        val gelenAd = bundle.ad
        val gelenBoy = bundle.boy
        val gelenYas = bundle.yas
        val gelenBekar = bundle.bekarMi
        val gelenNesne = bundle.nesne

        Log.e("Gelen ad", gelenAd)
        Log.e("Gelen boy", gelenBoy.toString())
        Log.e("Gelen yas", gelenYas.toString())
        Log.e("Gelen bekar", gelenBekar.toString())
        Log.e("Gelen kisi no", gelenNesne.kisi_no.toString())
        Log.e("Gelen kisi isim", gelenNesne.kisi_ad)

        tasarim.buttonBitir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sonucEkraninaGenis)
        }

        return tasarim.root
    }
}