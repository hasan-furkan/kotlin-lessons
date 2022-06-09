package com.hasanfurkan.timedatepickerkullanimi

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextSaat.setOnClickListener{
            val calendar = Calendar.getInstance()


            val saat = calendar.get(Calendar.HOUR_OF_DAY)
            val dakika = calendar.get(Calendar.MINUTE)

            val timePicker = TimePickerDialog(this@MainActivity, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                editTextSaat.setText("$hourOfDay : $minute")
            }, saat, dakika, true)

            timePicker.setTitle("Saat Seciniz")
            timePicker.setButton(DialogInterface.BUTTON_POSITIVE, "AYARLA", timePicker)
            timePicker.setButton(DialogInterface.BUTTON_NEGATIVE, "IPTAL ET", timePicker)

            timePicker.show()
        }

        editTarih.setOnClickListener {

            val calendar = Calendar.getInstance()

            val yil = calendar.get(Calendar.YEAR)
            val ay = calendar.get(Calendar.MONTH)
            val gun = calendar.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(this@MainActivity, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

                editTarih.setText("$dayOfMonth/${month +1}/$year")



            },yil, ay, gun, )
            datePicker.setTitle("Tarih Seciniz")
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE, "AYARLA", datePicker)
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE, "IPTAL ET", datePicker)
            datePicker.show()
        }
    }
}