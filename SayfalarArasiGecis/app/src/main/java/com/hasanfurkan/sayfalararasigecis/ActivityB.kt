package com.hasanfurkan.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanfurkan.sayfalararasigecis.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var tasarim : ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityBBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGoToC.setOnClickListener{
            val yeniIntent = Intent(this@ActivityB, ActivityC::class.java)
            startActivity(yeniIntent)
        }
    }

    override fun onBackPressed() {
        val yeniIntent = Intent(Intent.ACTION_MAIN)

        yeniIntent.addCategory(Intent.CATEGORY_HOME)
        yeniIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        startActivity(yeniIntent)
    }


}