package com.example.hospital_management

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val profile = findViewById<ImageView>(R.id.searchIcon)
        profile.setOnClickListener {
            val Intent = Intent(this,Profileview::class.java)
            startActivity(intent)
        }
    }



}
