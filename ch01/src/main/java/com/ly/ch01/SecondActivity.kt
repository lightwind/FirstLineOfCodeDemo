package com.ly.ch01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.btn2).setOnClickListener {
            val intent = Intent()
            intent.putExtra("data_return", "Hello FirstActivity.")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}