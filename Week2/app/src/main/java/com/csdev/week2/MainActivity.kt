package com.csdev.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var week2 = Week2()
        week2.main1()
    }

    fun run() {
        val garfield =
                Cat("Garfield", 22.0, 39.0, 2.0)
        garfield.eat()
        garfield.playing()
    }

    fun main() {
        val garfield = Cat()
        //setter
        garfield.name = "Garfield"
        //getter
        val catName = garfield.name
        Log.d("result :",catName)
    }


}