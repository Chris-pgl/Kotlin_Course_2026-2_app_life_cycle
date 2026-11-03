package com.example.app_life_cycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LuckyNumActivity : AppCompatActivity() {
    //lateinit significa che istanzierò dopo questa variabile ( nell'onCreate)
    lateinit var editluckynameq: EditText
    lateinit var startGame: Button
    lateinit var txt: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lucky_num)



         editluckynameq = findViewById<EditText>(R.id.editluckyname)
         startGame = findViewById<Button>(R.id.buttonStart);
         txt = findViewById<TextView>(R.id.textViewHomeGame);



        startGame.setOnClickListener{
           var userName = editluckynameq.text.toString().trim()

           //controllo se il nome è vuoto
           if (userName.isEmpty()){
               editluckynameq.error = "Please Enter your name!"
               return@setOnClickListener
           }

            //genero numero fortunato
            val luckyNumber = (1..100).random()

            //scegliamo quale activity aprire
            val nextActivity = if (luckyNumber % 2 != 0){
                SecondActivity::class.java
            }else{
                ThirdActivityChange::class.java
            }

            //preparo il passaggio dati
            val intent = Intent(this, nextActivity)
            intent.putExtra("USER_NAME",userName)
            intent.putExtra("LUCKY_NUMBER",luckyNumber)

            startActivity(intent)

        }


    }
}