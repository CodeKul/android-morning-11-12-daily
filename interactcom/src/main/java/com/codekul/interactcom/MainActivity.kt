package com.codekul.interactcom

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNxt.setOnClickListener {

            val int = Intent(
                this@MainActivity,
                DashActivity::class.java
            )

            val bnd = Bundle()
            bnd.putString(KEY_NAME, etTx.text.toString())

            int.putExtras(bnd)

            startActivity(int)
//            finish()
        }
    }

    companion object {

        const val KEY_NAME = "my_name"
    }
}
