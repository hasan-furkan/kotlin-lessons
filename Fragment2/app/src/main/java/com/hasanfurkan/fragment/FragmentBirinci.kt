package com.hasanfurkan.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.hasanfurkan.fragment.databinding.FragmentbirinciBinding

class FragmentBirinci: Fragment() {
    private lateinit var tasarim : FragmentbirinciBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentbirinciBinding.inflate(inflater, container, false)
        tasarim.buttonTikla.setOnClickListener {
            Toast.makeText(activity, "Merhaba", Toast.LENGTH_SHORT).show()
        }
        return tasarim.root
    }
}