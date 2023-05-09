package com.example.mychatapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnSign = findViewById<TextView>(R.id.sign_up)
        val btnFor = findViewById<TextView>(R.id.textView3)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnFor.setOnClickListener {
            startActivity(Intent(this,ForgotActivity::class.java))
        }

        btnSign.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }

        btnLogin.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}