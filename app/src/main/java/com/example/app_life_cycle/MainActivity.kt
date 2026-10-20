package com.example.app_life_cycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge



//App creata per capire meglio il ciclo di vita dell'applicazione
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { R.xml.activityain }


        // Qui inizializza la UI e le variabili
        Toast.makeText(this, "OnCreate() is Called",Toast.LENGTH_SHORT).show()


    }






    /**
     * Questo metodo viene chiamato quando l'attività diventa visibile all'utente
     * E' il punto di partenza delle animazioni di entrata o compiti legati all'interfaccia utente
     */
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart() is Called",Toast.LENGTH_SHORT).show()
    }



    /**
     * Questo metodo viene chiamato quando l'attività è in primo piano e
     * pronta per l'interazione con l'utente
     * -- da qui si dovrebbe partire con i componenti come Sensori o Aggiornamenti della Posizione Rotazione --
     */
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume() is Called",Toast.LENGTH_SHORT).show()
    }


    //Quando l'applicazione viene interrotta
    override fun onStop() {
        super.onStop()
    }




    //Quando l'applicazione viene distrutta
    override fun onDestroy() {
        super.onDestroy()
    }

    //Quando l'applicazione viene interrotta
    override fun onPause() {
        super.onPause()
    }


}




