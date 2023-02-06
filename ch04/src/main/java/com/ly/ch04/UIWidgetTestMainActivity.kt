package com.ly.ch04

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class UIWidgetTestMainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button: Button
    lateinit var editText: EditText
    lateinit var imageView: ImageView
    lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ui_widget_test)
        supportActionBar?.hide()

        button = findViewById(R.id.button)
        editText = findViewById(R.id.edit_text)
        imageView = findViewById(R.id.image_view)
        progressBar = findViewById(R.id.progress_bar)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                AlertDialog.Builder(this).apply {
                    setTitle("This is a dialog.")
                    setMessage("Something important.")
                    setCancelable(false)
                    setPositiveButton("Ok") { dialog, which -> }
                    setNegativeButton("Cancel") { dialog, which -> }
                    show()
                }

//                progressBar.progress = progressBar.progress + 10

//                if (progressBar.visibility == View.VISIBLE) {
//                    progressBar.visibility = View.GONE
//                } else {
//                    progressBar.visibility = View.VISIBLE
//                }

//                imageView.setImageResource(R.mipmap.ic_launch)

//                val inputText = editText.text.toString()
//                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
            }
        }
    }
}