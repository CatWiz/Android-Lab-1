package com.example.testapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.myTextView)
        textView.text = getString(R.string.button_press_count, counter)
    }

    fun buttonOnClick(view: View) {
        val textView = findViewById<TextView>(R.id.myTextView)
        textView.text = getString(R.string.button_press_count, ++counter)
    }
}