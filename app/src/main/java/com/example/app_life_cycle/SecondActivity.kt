package com.example.app_life_cycle

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}