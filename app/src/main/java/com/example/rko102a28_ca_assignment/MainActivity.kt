package com.example.rko102a28_ca_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val editText = findViewById<EditText>(R.id.titleEditText)
        val radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val submitButton = findViewById<Button>(R.id.buttonSubmit)
        

    }
}