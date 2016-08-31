package com.huanjulu.kotlindemo

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater

/**
 * Created by huanjulu on 16/8/25.
 */

class MainActivity : BaseActivity() {
    override val mContentLayoutResouredId: Int = R.layout.activity_main

    val context = this

    val list = mutableListOf("Android", "Binder", "Asynctask", "OOM")
    override fun setUp() {
        super.setUp()

        var recyView = findViewById(R.id.id_recyclerview) as RecyclerView
        var mHotNewsDataAdapter = MainAdapter(LayoutInflater.from(this))
        recyView!!.layoutManager = LinearLayoutManager(context)
        recyView!!.adapter = mHotNewsDataAdapter

    }

}
