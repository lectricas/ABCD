package com.lectricas.abcdactivity

import android.app.Application
import timber.log.Timber

class App: Application() {

    var i = 0

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

    fun getInt(): Int {
        i++
       return i
    }
}