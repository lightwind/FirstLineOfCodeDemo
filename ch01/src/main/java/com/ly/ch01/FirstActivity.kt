package com.ly.ch01

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val data = "Hello SecondActivity!"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("extra_data", data)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == RESULT_OK) {
                val returnedData = data?.getStringExtra("data_return")
                Log.d("allen", "returned data is $returnedData")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_add -> Toast.makeText(this, "Click Add.", Toast.LENGTH_SHORT).show()
            R.id.item_remove -> Toast.makeText(this, "Click Remove.", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}