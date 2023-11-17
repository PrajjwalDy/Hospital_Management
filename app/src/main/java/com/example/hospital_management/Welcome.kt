package com.example.hospital_management

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val getstarted = findViewById<Button>(R.id.getstarted)
       getstarted.setOnClickListener {
           startActivity(Intent(this, Login::class.java))
           finish()
       }
    }
}