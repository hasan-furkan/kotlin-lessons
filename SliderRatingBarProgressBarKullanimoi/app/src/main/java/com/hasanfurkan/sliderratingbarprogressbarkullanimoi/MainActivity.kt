package com.hasanfurkan.sliderratingbarprogressbarkullanimoi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import com.hasanfurkan.sliderratingbarprogressbarkullanimoi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonBasla.setOnClickListener {
            tasarim.progressBar.visibility = View.VISIBLE
        }
        tasarim.buttonDur.setOnClickListener {
            tasarim.progressBar.visibility = View.INVISIBLE
        }

        tasarim.slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tasarim.textViewSonuc.text = "Sonuc: $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        tasarim.buttonGoster.setOnClickListener {
            val gelenIlerleme = tasarim.slider.progress
            val gelenOylama = tasarim.ratingBar.rating

            Log.e("Gelen ilerleme", gelenIlerleme.toString())
            Log.e("gelen oylamma", gelenOylama.toString())
        }
    }
}