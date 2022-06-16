package com.hasanfurkan.toolbarmenuekleme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.title = "Toolbar Menu"

        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_bilgi -> {
                Toast.makeText(this@MainActivity, "Bilgi", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_ayarlar -> {
                Toast.makeText(this@MainActivity, "Ayarlar", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_ekle-> {
                Toast.makeText(this@MainActivity, "Ekle", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_cikis-> {
                Toast.makeText(this@MainActivity, "Cikis", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}