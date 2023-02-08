package com.ly.ch06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.login).setOnClickListener {
            val account = findViewById<EditText>(R.id.accountEdit).text.toString()
            val password = findViewById<EditText>(R.id.passwordEdit).text.toString()

            if (account == "1" && password == "1") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "account or password is invalid.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}