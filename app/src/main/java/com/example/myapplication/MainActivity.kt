package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textCounter: TextView
    private lateinit var buttonPlus: Button
    private lateinit var buttonMinus: Button

    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textCounter = findViewById(R.id.textCounter)
        buttonPlus = findViewById(R.id.buttonPlus)
        buttonMinus = findViewById(R.id.buttonMinus)

        textCounter.text = counter.toString()

        buttonPlus.setOnClickListener {
            counter++
            textCounter.text = counter.toString()
        }

        buttonMinus.setOnClickListener {
            counter--
            textCounter.text = counter.toString()
        }
    }
}
