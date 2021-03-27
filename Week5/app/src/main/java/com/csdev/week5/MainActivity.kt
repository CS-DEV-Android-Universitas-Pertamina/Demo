package com.csdev.week5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.csdev.week5.BarVolume.BarVolume
import com.csdev.week5.Fragment.FragmentActivity
import com.csdev.week5.LFO.Lfo1
import com.csdev.week5.List.ActivityListView
import com.csdev.week5.List.ActivityRecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var button1 : Button
    lateinit var button2 : Button
    lateinit var button3 : Button
    lateinit var button4 : Button
    lateinit var button5 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button10)

        button1.setOnClickListener {
            Toast.makeText(this@MainActivity,"Move to LFO",Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(
                this@MainActivity,
                Lfo1::class.java
            )
            startActivity(moveIntent)
        }
        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity,"Move to Bar Volume",Toast.LENGTH_SHORT).show()
                val moveIntent = Intent(
                    this@MainActivity, BarVolume::class.java
                )
                startActivity(moveIntent)
            }
        })
        button3.setOnClickListener {
            Toast.makeText(this@MainActivity,"Move to ListView",Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(
                this@MainActivity,
                ActivityListView::class.java
            )
            startActivity(moveIntent)
        }
        button5.setOnClickListener {
            Toast.makeText(this@MainActivity,"Move to RecyclerView",Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(
                this@MainActivity,
                ActivityRecyclerView::class.java
            )
            startActivity(moveIntent)
        }
        button4.setOnClickListener {
            Toast.makeText(this@MainActivity,"Move to Fragment",Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(
                this@MainActivity,
                FragmentActivity::class.java
            )
            startActivity(moveIntent)
        }
    }
}