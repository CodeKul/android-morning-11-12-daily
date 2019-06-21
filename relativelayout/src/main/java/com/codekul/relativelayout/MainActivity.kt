package com.codekul.relativelayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.codekul.mylib.Car

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.basic_wa)

        val cr = Car()
    }
}
