package com.csdev.week5.BarVolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.csdev.week5.R

class BarVolume : AppCompatActivity() {
    companion object{
        val STATE_RESULT = "Result"
    }
    lateinit var calc : Button
    lateinit var inputWidth : EditText
    lateinit var inputHeight : EditText
    lateinit var inputLength : EditText
    lateinit var result : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_volume)


        calc = findViewById(R.id.calc)
        inputWidth = findViewById(R.id.width)
        inputHeight = findViewById(R.id.height)
        inputLength = findViewById(R.id.length)
        result = findViewById(R.id.textView4)
        if (savedInstanceState != null) {
            val resultState = savedInstanceState.getString(STATE_RESULT)
            result.text = resultState
        }
        calc.setOnClickListener{
            result.text = runCalc().toString()
        }

    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, result.text.toString())
    }


    private fun runCalc(): Double {
        val inputLength = inputLength.text.toString().toDouble()
        val inputWidth = inputWidth.text.toString().toDouble()
        val inputHeight = inputHeight.text.toString().toDouble()
        return inputLength * inputWidth * inputHeight
    }
}