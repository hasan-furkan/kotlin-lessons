package com.hasanfurkan.togglebuttonandswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hasanfurkan.togglebuttonandswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                Log.e("switch acik", isChecked.toString())
            }else{
                Log.e("switch kapali", isChecked.toString())
            }
        }

        tasarim.toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                Log.e("toggle acik", isChecked.toString())
            }else{
                Log.e("toggle kapali", isChecked.toString())
            }
        }

        tasarim.button.setOnClickListener {
            val switchDurum = tasarim.switch1.isChecked
            val toggleDurum = tasarim.toggleButton.isChecked
            Log.e("switch durum", switchDurum.toString())
            Log.e("toggle durum", toggleDurum.toString())
        }
    }
}