package com.codekul.interactcom

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dash.*

class DashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash)

        val mnm = intent.extras?.getString(MainActivity.KEY_NAME)

        txtRs.text = mnm

        btBk.setOnClickListener {
            val resInt = Intent()

            val bnd = Bundle()
            bnd.putString(KEY_RES, doProcessing())
            resInt.putExtras(bnd)

            setResult(Activity.RESULT_OK, resInt)
            finish()
        }
    }

    fun doProcessing() = txtRs.text.toString().toUpperCase()

    companion object {
        const val KEY_RES = "result_data"
    }
}
