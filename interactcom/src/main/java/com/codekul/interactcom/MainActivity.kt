package com.codekul.interactcom

import android.app.Activity
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

            startActivityForResult(int, REQ_DASH )
            //startActivity(int)
//            finish()
        }
    }

    companion object {

        const val KEY_NAME = "my_name"
        const val REQ_DASH = 4568
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_DASH) {

            if(resultCode == Activity.RESULT_OK) {
                val processedData = data?.extras?.getString(DashActivity.KEY_RES)
                etTx.setText(processedData)
            }
        }
    }
}
