package com.example.app_life_cycle

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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

    /**
     * Questo metodo viene chiamato quando l'attività diventa visibile all'utente
     * è il punto di partenza delle animazioni di entrata o compiti legati all'interfaccia utente
     */
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart() is Called 2Activity",Toast.LENGTH_SHORT).show()
    }



    /**
     * Questo metodo viene chiamato quando l'attività è in primo piano e
     * pronta per l'interazione con l'utente
     * -- da qui si dovrebbe partire con i componenti come Sensori o Aggiornamenti della Posizione Rotazione --
     */
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume() is Called 2Activity",Toast.LENGTH_SHORT).show()
    }


    /**
     * Questo metodo viene richiamato quando l'attività perde il focus e si mette in background
     * per avviare un altra activity o il dispositivo è in modalità addTask/multifinestra
     */
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause() is Called 2Activity",Toast.LENGTH_SHORT).show()

    }


    /**
     * Questo metodo viene chiamato quando l'attività perde il focus e si mette in background
     *
     */
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop() is Called 2Activity",Toast.LENGTH_SHORT).show()

    }


    /**
     * Questo metodo viene richiamato dopo onStop() o quando perde il focus e va in backGround
     * e seguita da onResume()
     */
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart() is Called 2Activity",Toast.LENGTH_SHORT).show()

    }


    /**
     * Questo metodo viene chiamato quando l'attività viene distrutta e l'app chiusa
     */
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy() is Called 2Activity",Toast.LENGTH_SHORT).show()


    }
}