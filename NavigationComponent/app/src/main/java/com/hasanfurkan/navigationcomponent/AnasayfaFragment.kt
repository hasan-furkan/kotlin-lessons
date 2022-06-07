package com.hasanfurkan.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hasanfurkan.navigationcomponent.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim : FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(layoutInflater, container, false)
        val kisi = Kisiler(18, "Mehmet")

        tasarim.buttonBasla.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.oyunEkraninaGecis("ahmet", 18, 1.79f, true, kisi)
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }
}
