package com.raywenderlich.android.droidwiki.ui.common

import android.app.Activity
import android.os.Bundle
import com.raywenderlich.android.droidwiki.application.WikiApplication

abstract class WikiActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDepedencyInjection()
    }

    abstract fun initDepedencyInjection()
}