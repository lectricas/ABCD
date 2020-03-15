package com.lectricas.abcdactivity

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.Handler.Callback
import android.os.IBinder
import android.os.Message

class MyService: Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        val handler = Handler(object: Callback{
            override fun handleMessage(msg: Message?): Boolean {
                return true
            }
        })
        handler.postDelayed(object: Runnable {
            override fun run() {
            }
        }, 1000)
    }
}