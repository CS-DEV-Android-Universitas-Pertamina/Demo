package com.csdev.week5.LFO

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.csdev.week5.R

class Lfo2 : AppCompatActivity() {
    lateinit var button1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lfo2)
        button1 = findViewById(R.id.button5)
        button1.setOnClickListener {
            Toast.makeText(this@Lfo2,"Move to LFO", Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(
                this@Lfo2,
                Lfo3::class.java
            )
            startActivity(moveIntent)
        }
    }
}