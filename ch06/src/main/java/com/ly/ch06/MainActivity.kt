package com.ly.ch06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent("com.ly.ch06.MY_BROADCAST")
            intent.setPackage(packageName)
            sendOrderedBroadcast(intent, null)
        }

        findViewById<Button>(R.id.forceOffline).setOnClickListener {
            val intent = Intent("com.ly.ch06.FORCE_OFFLINE")
            sendBroadcast(intent)
        }
    }
}