package com.csdev.week5.LFO

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.csdev.week5.R

class Lfo3 : AppCompatActivity() {
    lateinit var button1 : Button
    lateinit var button2 : Button
    lateinit var button3 : Button
    lateinit var button4 : Button
    private val phoneNumber = "081210841382"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lfo3)
        button1 = findViewById(R.id.button6)
        button2 = findViewById(R.id.button7)
        button3 = findViewById(R.id.button8)
        button1.setOnClickListener {
            val dialPhoneIntent = Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:$phoneNumber")
            )
            startActivity(dialPhoneIntent)
        }
        button3.setOnClickListener {
            val uri = Uri.parse("smsto:$phoneNumber")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "The SMS text")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:37.7749,-122.4194")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        button4.setOnClickListener{
            val url = "http://www.google.com"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        }
    }
}