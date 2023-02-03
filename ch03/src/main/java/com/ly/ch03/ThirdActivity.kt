package com.ly.ch03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ly.ch01.R

class ThirdActivity : BaseActivity() {

    private val tag = "allen"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(tag, "ThirdActivity task id is $taskId")

        setContentView(R.layout.activity_third)
    }
}