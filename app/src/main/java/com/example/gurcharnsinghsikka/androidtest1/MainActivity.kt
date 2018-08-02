package com.example.gurcharnsinghsikka.androidtest1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator)

        val addButton = findViewById<View>(R.id.addButton) as Button

        addButton.setOnClickListener {
            val firstNumEditText = findViewById<View>(R.id.firstNumEditText) as EditText
            val secondNumEditText = findViewById<View>(R.id.firstNumEditText2) as EditText
            val resultTextView = findViewById<View>(R.id.resultTextView) as TextView

            val num1 = Integer.parseInt(firstNumEditText.text.toString())
            val num2 = Integer.parseInt(secondNumEditText.text.toString())
            val result = num1 + num2
            resultTextView.text = result.toString()
        }
    }
}
