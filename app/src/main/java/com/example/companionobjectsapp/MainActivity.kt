package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val time = BackgroundControl()
        val background= findViewById<LinearLayout>(R.id.llBackground)
        val etInput= findViewById<EditText>(R.id.etText)
        val btChange= findViewById<Button>(R.id.btChange)

        btChange.setOnClickListener{

            when(etInput.text.toString().toLowerCase()) {
                "day" -> {
                    time.changeBackground(BackgroundControl.day,background)
                    findViewById<TextView>(R.id.tvPrompt).setTextColor(Color.WHITE)
                    etInput.setTextColor(Color.WHITE)
                }
                "night" -> {
                    time.changeBackground(BackgroundControl.night,background)
                    findViewById<TextView>(R.id.tvPrompt).setTextColor(Color.WHITE)
                    etInput.setTextColor(Color.WHITE)
                }
                else
                -> Toast.makeText(this, "Please enter day or night", Toast.LENGTH_SHORT).show()
            }
        }
    }
}