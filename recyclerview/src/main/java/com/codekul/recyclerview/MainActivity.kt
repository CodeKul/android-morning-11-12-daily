package com.codekul.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()

    }

    private fun initRecyclerView() {
        val et = findViewById<EditText>(R.id.editText)

        /*val myAdapter = MyAdapter(
            this,
            recyclerData() , fun( pos : Int, data : MyData) {
                Log.i("@codekul", "In Main Activity $pos => $data")
                et.setText(data.text)
            }
        )*/

        val myAdapter = MyAdapter(
            this,
            recyclerData()
        ) { pos, dataM ->
            et.setText(dataM.text)
        }

        val viewManager = LinearLayoutManager(this)
        val recVw = findViewById<RecyclerView>(R.id.recVw)
        recVw.apply {

            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = myAdapter
        }

        hi(40, fun(){

        })

        hi(10, {

        }) // last parameter is function

        hi(10) {

        }
    }

    private fun recyclerData(): ArrayList<MyData> {
        val dataSet = ArrayList<MyData>()
        dataSet.add(
            MyData(
                R.drawable.ic_mic_black_24dp,
                "Android"
            )
        )
        dataSet.add(
            MyData(
                R.mipmap.ic_launcher,
                "Apple"
            )
        )
        dataSet.add(
            MyData(
                R.mipmap.ic_launcher,
                "Samsung"
            )
        )
        dataSet.add(
            MyData(
                R.mipmap.ic_launcher,
                "Windows"
            )
        )
        dataSet.add(
            MyData(
                R.mipmap.ic_launcher,
                "Rim"
            )
        )
        return dataSet
    }

    private fun hi(  num : Int, fn : () -> Unit) {

    }
}


