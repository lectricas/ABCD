package com.lectricas.abcdactivity

import android.os.Bundle
import android.os.SystemClock
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.run2
import kotlinx.android.synthetic.main.activity_main.startThread
import timber.log.Timber
import kotlin.Long.Companion

class A : AppCompatActivity() {

    lateinit var thread: MyThread

    private val list = mutableListOf<Long>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thread = MyThread();
        startThread.setOnClickListener {
            thread.start()
        }

        val num = (application as App).getInt()

        run2.setOnClickListener {
            thread.hander.post(object: Runnable {
                override fun run() {
                    for (i in (0..1000)) {
                        for(j in 0..500) {
                            list.add(Long.MAX_VALUE)
                        }
                        SystemClock.sleep(1000)
                        Timber.d("tick $num $i")

                    }

                }
            })
        }
//        Logger.d("onCreate ${taskId}")



//        nextActivity.text = this.localClassName
//
//        nextActivity.setOnClickListener {
//            TestRun().run()
//            TestThread().start()
//        }
    }

//    override fun onNewIntent(intent: Intent?) {
//        super.onNewIntent(intent)
//        Logger.d("onNewIntent ${taskId}")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Logger.d("onDestory ${taskId}")
//    }
//
//    override fun onStart() {
//        super.onStart()
//        Logger.d("onStart ${taskId}")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Logger.d("onStop ${taskId}")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Logger.d("onPause ${taskId}")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Logger.d("onResume ${taskId}")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Logger.d("onRestart ${taskId}")
//    }
}
