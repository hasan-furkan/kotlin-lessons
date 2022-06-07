package com.hasanfurkan.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val fm = supportFragmentManager
        val ft = fm.beginTransaction()

        ft.add(R.id.fragment_tutucu1, FragmentBirinci())
        ft.add(R.id.fragment_tutucu2, FragmentIkinci())

        ft.commit()
    }
}