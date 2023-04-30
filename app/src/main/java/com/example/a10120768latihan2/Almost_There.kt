package com.example.a10120768latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Almost_There : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)

        val buttonClick = findViewById<Button>(R.id.btnVerify)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Verify::class.java)
            startActivity(intent)
        }
    }
}