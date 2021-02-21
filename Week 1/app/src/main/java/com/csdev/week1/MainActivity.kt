package com.csdev.week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var week1 = Week1()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        week1.controlFlow()
        week1.controlFlow2()
        week1.example()
        week1.example2()
        week1.example3()
        week1.main()
        week1.main1()
        week1.main2()
        week1.main3()
        week1.setUser("Alzahid", 32)
        week1.setUser1("Budi", 18)
        week1.setUser3("Agnes", 10)
    }
}