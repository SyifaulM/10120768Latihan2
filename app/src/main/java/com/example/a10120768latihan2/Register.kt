package com.example.a10120768latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val buttonClick = findViewById<Button>(R.id.buttonRegister)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Almost_There::class.java)
            startActivity(intent)
        }
    }
}