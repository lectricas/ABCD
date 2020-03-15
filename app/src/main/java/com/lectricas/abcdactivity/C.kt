package com.lectricas.abcdactivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.nextActivity

class C : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivity.setOnClickListener {
            startActivity(Intent(this@C, A::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            })
        }

        nextActivity.text = this.localClassName
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
