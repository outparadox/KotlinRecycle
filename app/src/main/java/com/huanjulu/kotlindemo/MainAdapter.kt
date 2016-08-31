package com.huanjulu.kotlindemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by huanjulu on 16/8/25.
 */


class MainAdapter constructor(val inflater: LayoutInflater) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {


    val list = mutableListOf("Android", "Binder", "Asynctask", "OOM")


    fun onRefresh(listData: MutableList<String>) {
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainViewHolder {
        return MainViewHolder(inflater.inflate(R.layout.item_content, parent, false))

    }

    override fun onBindViewHolder(holder: MainViewHolder?, position: Int) {

        holder!!.onSetData(list!!.get(position))

    }

    override fun getItemCount(): Int = list?.count() ?: 0


    class MainViewHolder(val item: View) : RecyclerView.ViewHolder(item) {


        val content: TextView = item.findViewById(R.id.content_tv) as TextView

        fun onSetData(string: String?): Unit {

            content.text = string
        }


    }

}