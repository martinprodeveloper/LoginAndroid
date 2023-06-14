package com.example.loginandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textViewRegister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewRegister = findViewById(R.id.tv_register)

        textViewRegister.setOnClickListener {
            Toast.makeText(this, "Register Clicked", Toast.LENGTH_LONG).show()
            register()
        }
    }

    private fun register() {
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
}