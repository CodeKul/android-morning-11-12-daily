package com.codekul.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(
    private val context : Context,
    private val dataSet : ArrayList<MyData>
) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): MyViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.my_item,viewGroup, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int  = dataSet.size

    override fun onBindViewHolder(vh: MyViewHolder, pos: Int) {

        vh.text().text = dataSet[pos].text
        vh.img().setImageResource(dataSet[pos].img)
    }

    class MyViewHolder(
        private val view : View
    ) : RecyclerView.ViewHolder(view) {

        fun text() = view.findViewById<TextView>(R.id.txtVw)

        fun img() = view.findViewById<ImageView>(R.id.imgVw)
    }
}