package com.example.rko102a28_ca_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val editText = findViewById<EditText>(R.id.titleEditText)
        val radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val submitButton = findViewById<Button>(R.id.buttonSubmit)
    }


    fun radio_button_click(view: View){
        val radio: RadioButton = findViewById(R.id.radioButton1)
        Toast.makeText(applicationContext,"You chose: ${radio.text}",
            Toast.LENGTH_SHORT).show()
    }

    fun buttonFunction(view: View) {
        Toast.makeText(applicationContext, "Your response has been saved along with feedback. Thankyou!!", Toast.LENGTH_SHORT).show()
        val check: CheckBox = findViewById(R.id.checkBox1)
        var radio : RadioButton = findViewById(R.id.radioButton1)
        var editText = findViewById<EditText>(R.id.titleEditText)
        check.isChecked = false
        radio.isChecked = false
        editText.setText("")

    }

    fun check_box_click(view: View){
        val check: CheckBox = findViewById(R.id.checkBox1)
        if(check.isChecked){
            Toast.makeText(applicationContext,"You selected: ${check.text}",
                Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext, "You unselected: ${check.text}",
                Toast.LENGTH_SHORT).show()
        }

    }
}