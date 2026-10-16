package com.example.app_life_cycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app_life_cycle.ui.theme.App_life_cycleTheme


//App creata per capire meglio il ciclo di vita dell'applicazione
class MainActivity : ComponentActivity() {


    //Quando l'applicazione viene creata
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Toast.makeText(this, "onCreate() is Called", Toast.LENGTH_SHORT).show()

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



