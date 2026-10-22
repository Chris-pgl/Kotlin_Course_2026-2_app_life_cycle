package com.example.app_life_cycle

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.net.toUri


//App creata per capire meglio il ciclo di vita dell'applicazione
class MainActivity : ComponentActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView() è per il layout tradizionale con xml
        setContentView(  R.layout.activity_main )

        //setContent{}
        //è per jetCompose


        // Qui inizializza la UI e le variabili
        Toast.makeText(this, "OnCreate() is Called",Toast.LENGTH_SHORT).show()

        val titolo = findViewById<TextView>(R.id.txtTitolo)
        val btnGoToSecond = findViewById<Button>(R.id.btnGoToSecond)


        /**
         * Intent - permette comunicazioni tra componenti differenti nell'app
         *
         * Tipi di Intent:
         *  Espliciti Intent
         *  Impliciti Intent
         */

        /**
         * Espliciti Intent
         * vengono utilizzati per un componente specifico, specificando il target
         */
        btnGoToSecond.setOnClickListener {
            goToSecondActivity()
        }


        val googleBtn = findViewById<Button>(R.id.btnGoogle)
        googleBtn.setOnClickListener {
            openWebGoogle()
        }


        val luckyBtn = findViewById<Button>(R.id.btnLucky)
        luckyBtn.setOnClickListener {
            goToLuckyGame()
        }




    }




    /**
     * Questo metodo viene chiamato quando l'attività diventa visibile all'utente
     * è il punto di partenza delle animazioni di entrata o compiti legati all'interfaccia utente
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
     * per avviare un altra activity o il dispositivo è in modalità addTask/multifinestra
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
     * Questo metodo viene richiamato dopo onStop() o quando perde il focus e va in backGround
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
     * Quindi se l'utente apre l'app
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

    //--------------------------------------------------



    /**
     * Intent - permette comunicazioni tra componenti differenti nell'app
     *
     * Tipi di Intent:
     *  Espliciti Intent
     *  Impliciti Intent
     */


    /**
     * Espliciti Intent
     * vengono utilizzati per un componente specifico, specificando il target
     */
    fun goToSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun openWebGoogle(){
        val webGoogle = "https://www.google.com".toUri()
        val intentW = Intent(Intent.ACTION_VIEW, webGoogle)
        startActivity(intentW)
    }

    fun goToLuckyGame(){
        val int = Intent(this, LuckyNumActivity::class.java)
        startActivity(int)
    }

    /**
     * Impliciti Intent..
     */


}




