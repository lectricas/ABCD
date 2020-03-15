package com.lectricas.abcdactivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.nextActivity

class B : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextActivity.setOnClickListener {
            startActivity(Intent(this@B, C::class.java))
        }

        nextActivity.text = this.localClassName
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
