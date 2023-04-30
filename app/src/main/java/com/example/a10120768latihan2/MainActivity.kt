package com.example.a10120768latihan2

// Tanggal Pengerjaan : 26 April 2023
// NIM  : 10120768
// Nama : Syifaul Mukminin
// Kelas: IF9

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnReg = findViewById<TextView>(R.id.btnRegister)
        btnReg.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}