package com.example.app_life_cycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity_cycleOfLifeAppInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cycle_of_life_app_info)
        enableEdgeToEdge()


        val btnHome = findViewById<Button>(R.id.goHomeFromLifeappinfo)
        btnHome.setOnClickListener {
           goHome()
        }
    }


    fun goHome(){
        val int = Intent(this, MainActivity::class.java)
        startActivity(int)
    }


}