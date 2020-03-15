package com.lectricas.abcdactivity

import android.os.Handler
import android.os.Looper
import timber.log.Timber

class MyThread : Thread() {

    lateinit var hander: Handler

    override fun run() {

        Looper.prepare()
        hander = Handler()
        Looper.loop()

        Timber.d("EndRun")
    }
}