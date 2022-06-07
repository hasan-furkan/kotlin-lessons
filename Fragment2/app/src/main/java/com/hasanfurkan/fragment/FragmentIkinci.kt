package com.hasanfurkan.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hasanfurkan.fragment.databinding.FragmentikinciBinding

class FragmentIkinci: Fragment() {

    private lateinit var tasarim : FragmentikinciBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

         tasarim = FragmentikinciBinding.inflate(inflater, container, false)

        tasarim.buttonYap.setOnClickListener {
            tasarim.textViewCikti.text = "Merhaba"
        }

        return tasarim.root
    }
}