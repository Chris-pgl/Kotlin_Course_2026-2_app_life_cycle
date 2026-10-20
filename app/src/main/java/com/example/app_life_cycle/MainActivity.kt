package com.example.app_life_cycle

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge



//App creata per capire meglio il ciclo di vita dell'applicazione
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(  R.layout.activity_main )


        // Qui inizializza la UI e le variabili
        Toast.makeText(this, "OnCreate() is Called",Toast.LENGTH_SHORT).show()

        val titolo = findViewById<TextView>(R.id.txtTitolo)

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


    /**
     * Questo metodo viene richiamato quando l'attività perde il focus e si mette in background
     * per avviare un altra activity o il dispositivo è in modalitàaddTask/multifinestra
     */
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause() is Called",Toast.LENGTH_SHORT).show()

    }


    /**
     * Questo metodo viene chiamato quando l'attività perde il focus e si mette in background
     *
     */
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop() is Called",Toast.LENGTH_SHORT).show()

    }


    /**
     * E' richianato dopo onStop() o quando perde il focus e va in backGround
     * e seguita da onResume()
     */
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart() is Called",Toast.LENGTH_SHORT).show()

    }


    /**
     * Questo metodo viene chiamato quando l'attività viene distrutta e l'app chiusa
     */
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy() is Called",Toast.LENGTH_SHORT).show()


    }

    /**
     * La logica segue:
     * onCreate() ->  l'Activity viene creata.
     * onStart() ->  l'Activity diventa visibile.
     * onResume() ->  l'Activity è in primo piano e interattiva.
     * onPause() ->  l'Activity perde lo stato di primo piano.
     * onStop() ->  l'Activity non è più visibile.
     * onRestart() ->  l'Activity sta tornando da uno stato Stopped.
     * onDestroy() ->  l'Activity sta per essere distrutta.
     */

    /**
     * quindi se l'utente apre l'app
     * onCreate() ->
     * onStart() ->
     * onResume() ->
     *
     * -- Se esce dall'app o lascia in backGround
     *
     * onPause() ->
     * onStop() ->
     *
     * -- Se l'utente torna nell'app e l'Activity esiste ancora
     *
     * onRestart() ->
     * onStart() ->
     * onResume() ->
     *
     * -- Se invece Android ha distrutto l'Activity mentre era in background
     *
     * onCreate() ->
     * onStart() ->
     * onResume() ->
     *
     * -- Quando l'activity viene distrutta
     *
     * onPausa() ->
     * onStop() ->
     * onDestroy()
     */


    /**
     *  Quando invece facciamo la Rotazione dello schermo:
     *
     *  onPausa()
     *  onStop()
     *  onDestroy()
     *
     * e inizia a ricrearla da on Start()
     *
     */


}




