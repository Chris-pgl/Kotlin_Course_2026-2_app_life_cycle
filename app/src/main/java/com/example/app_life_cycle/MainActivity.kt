package com.example.app_life_cycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge



//App creata per capire meglio il ciclo di vita dell'applicazione
class MainActivity : ComponentActivity() {


    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

           R.xml.activityain

        }


    }

    //Quando l'applicazione viene creata
    override fun onStart() {
        super.onStart()
    }

    //Quando l'applicazione viene ripresa
    override fun onResume() {
        super.onResume()
    }


    //Quando l'applicazione viene interrotta
    override fun onStop() {
        super.onStop()
    }


}



