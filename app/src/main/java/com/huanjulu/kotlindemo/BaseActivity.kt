package com.huanjulu.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by huanjulu on 16/8/25.
 */
abstract class BaseActivity : AppCompatActivity() {


    abstract val mContentLayoutResouredId: Int



    companion object { //这部分代码你可以理解为有点类似JAVA中的Static，是可以直接通过类名调用

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onCreate(savedInstanceState)

        if (mContentLayoutResouredId != 0) setContentView(mContentLayoutResouredId) else creatContentView()

        if (savedInstanceState != null) handleSavedInstanceState(savedInstanceState)

        if (intent.extras != null) handleIntentBundleExtrax(intent.extras)

        setUp()

    }

    override fun onResume() {
        super<AppCompatActivity>.onResume()
    }


    override fun onPause() {
        super<AppCompatActivity>.onPause()
    }


    override fun onDestroy() {
        super<AppCompatActivity>.onDestroy()
    }


    open fun creatContentView(): View {
        throw UnsupportedOperationException("sorry , your layoutviewId ==0 , createContentView() must be implemented by subclasS")
    }

    open fun handleIntentBundleExtrax(bundle: Bundle) {

    }

    open fun handleSavedInstanceState(savedInstanceState: Bundle?) {

    }

    open fun setUp() {

    }

    open fun handleIntentExtrax(key: Any): String? {
        if (key is String) return intent.getStringExtra(key)
        return null
1
    }
}
