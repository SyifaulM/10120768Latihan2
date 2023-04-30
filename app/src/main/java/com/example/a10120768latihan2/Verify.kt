package com.example.a10120768latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Verify : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        val buttonClick = findViewById<Button>(R.id.btnSend)
        buttonClick.setOnClickListener {
            val intent = Intent(this, User_Home::class.java)
            startActivity(intent)
        }
    }
}