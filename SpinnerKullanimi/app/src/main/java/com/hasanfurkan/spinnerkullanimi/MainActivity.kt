package com.hasanfurkan.spinnerkullanimi

import android.content.AbstractThreadedSyncAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val ulkeler = ArrayList<String>()
    private lateinit var veriAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ulkeler.add("Turkiye")
        ulkeler.add("Almanya")
        ulkeler.add("Japonya")
        ulkeler.add("CIn")
        ulkeler.add("Japonya")
        ulkeler.add("Portekiz")
        ulkeler.add("Ispanya")

        veriAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, ulkeler)

        spinner.adapter = veriAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity, "Secilen ulke : ${ulkeler[position]}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "Ulke : ${ulkeler[spinner.selectedItemPosition]}", Toast.LENGTH_SHORT).show()
        }
    }
}