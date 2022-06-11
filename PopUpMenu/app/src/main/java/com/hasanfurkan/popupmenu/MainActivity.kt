package com.hasanfurkan.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAc.setOnClickListener {
            val popup = PopupMenu(this@MainActivity,buttonAc )
            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.action_sil -> {
                        Toast.makeText(this@MainActivity, "sil butonu", Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.action_duzenle -> {
                        Toast.makeText(this@MainActivity, "duzenle butonu", Toast.LENGTH_LONG).show()
                        true
                    }
                    else -> false
                }
            }

            popup.show()
        }
    }
}