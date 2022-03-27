package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginbutton: Button = findViewById(R.id.login_button)
        loginbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
        }
        val signupbutton: Button = findViewById(R.id.signup_button)
        signupbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
        }

    }
}