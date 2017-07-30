package com.example.nitishkumar.currencyconverter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class emptyState : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty_state)
        val empty = findViewById(R.id.empty_view) as TextView
        empty.text = "Application needs to connect to the internet to initialize for the first time"
    }
}
