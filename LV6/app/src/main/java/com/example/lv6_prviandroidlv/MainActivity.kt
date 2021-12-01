package com.example.lv6_prviandroidlv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val text1 = findViewById<TextView>(R.id.text1)
    val text2 = findViewById<TextView>(R.id.text2)
    val imePrezime = findViewById<EditText>(R.id.imePrezime)
    val opis = findViewById<EditText>(R.id.opis)
    val unesi = findViewById<Button>(R.id.unesi)

    val izracunaj = findViewById<Button>(R.id.izracunaj)
    val visina = findViewById<EditText>(R.id.visina)
    val tezina = findViewById<EditText>(R.id.tezina)


    unesi.setOnClickListener {
        text1.setText(imePrezime.toString())
        text2.setText(opis.toString())
    }

    izracunaj.setOnClickListener {
        val bmi = calculateBMIIndex(visina.text.toString().toFloat(), tezina.text.toString().toFloat())
        Toast.makeText(this, bmi.toString(),
            Toast.LENGTH_LONG).show()
    }

}

fun calculateBMIIndex(height: Float, mass: Float) : Float {
    return mass / (height * height)
}
