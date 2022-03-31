package com.example.firabase_demo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    var et_email: EditText? = null
    var et_password: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        intViews()
    }

    private fun intViews() {
        et_email = findViewById(R.id.et_email)
        et_password = findViewById(R.id.et_password)
        var b_signin = findViewById<Button>(R.id.btn_signIn)
        var tv_signUp = findViewById<TextView>(R.id.tv_signup)

        b_signin.setOnClickListener {
            openHomeActivity()
        }

        tv_signUp.setOnClickListener {
            openSignUpActivity()
        }
    }

    private fun openSignUpActivity() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    private fun openHomeActivity() {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}