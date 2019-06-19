package com.codekul.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsNm = findViewById<EditText>(R.id.etUsNm)

        val etPass = findViewById<EditText>(R.id.etPass)

        val btLgn = findViewById<Button>(R.id.btLgn)

        val txSt = findViewById<TextView>(R.id.txSt)

        btLgn.setOnClickListener {
            if(etUsNm.text.toString() == "android" && etPass.text.toString()=="codekul") {
                txSt.text = "Login Success"
            }else {
                txSt.text = "Login Fail"
            }
        }
    }
}
