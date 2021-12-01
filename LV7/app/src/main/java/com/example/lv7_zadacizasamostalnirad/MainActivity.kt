package com.example.lv7_zadacizasamostalnirad

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_radio)


        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
        val radioButton4 = findViewById<RadioButton>(R.id.radioButton4)


        val forward = findViewById<Button>(R.id.button_forward)
        forward.setOnClickListener{
           if(radioGroup.getCheckedRadioButtonId() == -1){
                Toast.makeText(this, "You have to pick one", Toast.LENGTH_LONG).show()
           }
           else {
               var text = ""
               if(radioButton1.isChecked())
               {
                   text = radioButton1.getText().toString()
               }
               else if(radioButton2.isChecked())
               {
                   text = radioButton2.getText().toString()
               }
               else if(radioButton3.isChecked())
               {
                   text = radioButton3.getText().toString()
               }
               else if(radioButton4.isChecked())
               {
                   text = radioButton4.getText().toString()
               }

               val secondFragment = SecondFragment()

               val fragmentTransaction: FragmentTransaction? = supportFragmentManager?.beginTransaction()
               fragmentTransaction?.replace(R.layout.radio_fragment, secondFragment)
               fragmentTransaction?.commit()

           }

        }


    }






}

