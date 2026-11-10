package com.example.app_life_cycle

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_widgets : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_widgets)

        val btnGoHomeTowidget = findViewById<Button>(R.id.widgetToHome)
        btnGoHomeTowidget.setOnClickListener {
            goHome()
        }

        val checkPeper = findViewById<CheckBox>(R.id.checkPeperon)
        val checkSalsiccia = findViewById<CheckBox>(R.id.checkSalsiccia)
        val checkAnanas = findViewById<CheckBox>(R.id.checkAnanas)
        val checkPiselli = findViewById<CheckBox>(R.id.checkPisell)
        val checkPatate = findViewById<CheckBox>(R.id.checkPatate)

        checkPeper.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked == true) {
                Toast.makeText(this, "Peperoni aggiunto", Toast.LENGTH_SHORT).show()
            }
        }

        checkSalsiccia.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked == true) {
                Toast.makeText(this, "Salsiccia aggiunto", Toast.LENGTH_SHORT).show()
            }
        }

        checkAnanas.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked == true) {
                Toast.makeText(this, "AVAIA SMETTILA", Toast.LENGTH_SHORT).show()
                checkAnanas.setChecked(false)
            }
        }

        checkPiselli.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked == true) {
                Toast.makeText(this, "Piselli aggiunto", Toast.LENGTH_SHORT).show()
            }
        }

        checkPatate.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked == true) {
                Toast.makeText(this, "Patate aggiunto", Toast.LENGTH_SHORT).show()
            }
        }


        val radioGrup = findViewById<RadioGroup>(R.id.radioGroup1)
        radioGrup.setOnCheckedChangeListener { group, idchecked ->
        /*
            val radioBtnForGlutenFree = findViewById<RadioButton>(idchecked)
            Toast.makeText(this, "Gluten Free: ${radioBtnForGlutenFree.text}", Toast.LENGTH_SHORT).show()
        }
        Oppure ancora meglio cercando gli id */
            when (idchecked){
                R.id.yesGlutenFree -> {
                    Toast.makeText(this, "Pasta da pizza senza Glutine", Toast.LENGTH_SHORT).show()
                }
                R.id.noGlutenFree -> {
                    Toast.makeText(this, "Pasta da pizza normale", Toast.LENGTH_SHORT).show()
                }
            }
        }


        val spinner = findViewById<Spinner>(R.id.spinner)
        //array Adapter
        val calzoneOrPizzaSpinner = arrayOf("Seleziona Pizza or Calzone","Calzone","Pizza")
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,calzoneOrPizzaSpinner)
        adapter.setDropDownViewResource(R.layout.spinner_item)
        spinner.adapter = adapter
        if (spinner.selectedItemPosition == 0){
            Toast.makeText(this, "Seleziona Pizza or Calzone", Toast.LENGTH_SHORT).show()
        }else{
            val scelta = spinner.selectedItem.toString()
        }

    }





    fun goHome(){
        val home = Intent(this, MainActivity::class.java)
        startActivity(home)

    }

}