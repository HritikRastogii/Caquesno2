package com.example.caquesno2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 = findViewById<Button>(R.id.btn1)
        val confirm = findViewById<CheckBox>(R.id.checkb1)
        val male = findViewById<RadioButton>(R.id.rad2)
        val female = findViewById<RadioButton>(R.id.rad1)
        b1.setOnClickListener {

            Toast.makeText(this, "Your Response Is Submitted", Toast.LENGTH_LONG).show()
        }
        confirm.setOnClickListener {

            Toast.makeText(this, "You Agreed To Terms and Conditions", Toast.LENGTH_LONG).show()
        }
        male.setOnClickListener {

            Toast.makeText(this, "You Have Selected Gender As Male", Toast.LENGTH_LONG).show()
        }
        female.setOnClickListener {

            Toast.makeText(this, "You Have Selected Gender As Female", Toast.LENGTH_LONG).show()
        }

    }
}