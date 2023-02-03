package com.ly.ch03

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.ly.ch01.R

class SecondActivity : BaseActivity() {

    private val tag = "allen"

    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, SecondActivity::class.java).apply {
                putExtra("param1", data1)
                putExtra("param2", data2)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(tag, "SecondActivity task id is $taskId")

        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.btn2).setOnClickListener {
//            val intent = Intent()
//            intent.putExtra("data_return", "Hello FirstActivity.")
//            setResult(RESULT_OK, intent)
//            finish()

            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "SecondActivity == onDestroy")
    }
}