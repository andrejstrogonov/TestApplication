package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val submibutton: Button = findViewById(R.id.submit_button)
        submibutton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
        }
    }
}
