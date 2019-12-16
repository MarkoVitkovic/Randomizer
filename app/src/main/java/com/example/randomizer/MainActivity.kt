package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val switch=findViewById<Switch>(R.id.switch3)
        val goButton = findViewById<Button>(R.id.goButton)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)
        val editText = findViewById<EditText>(R.id.editTexts)


        goButton.setOnClickListener {
            val txt = editText.text.toString().toInt()
            val rand = java.util.Random().nextInt(txt)+1
            textViewResult.text=rand.toString()

        }
    }
}
