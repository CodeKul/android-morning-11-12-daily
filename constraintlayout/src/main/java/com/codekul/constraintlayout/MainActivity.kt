package com.codekul.constraintlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cal = findViewById<CalendarView>(R.id.cal)
        val txtAg = findViewById<TextView>(R.id.txtAg)

        cal.setOnDateChangeListener { _, year, month, dayOfMonth ->
            txtAg.text = ageObj.calAge(year, month, dayOfMonth).toString()
        }
    }
}
