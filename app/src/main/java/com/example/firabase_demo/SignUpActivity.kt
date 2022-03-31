package com.example.firabase_demo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    var et_fullName: EditText? = null
    var et_email: EditText? = null
    var et_password: EditText? = null
    var et_cpassword: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        intViews()
    }

    private fun intViews() {
        et_fullName = findViewById(R.id.et_fullName)
        et_email = findViewById(R.id.et_email)
        et_password = findViewById(R.id.et_password)
        et_cpassword = findViewById(R.id.et_cpassword)

        val b_signUp = findViewById<Button>(R.id.btn_signup)
        val tv_signIn = findViewById<TextView>(R.id.tv_signin)

        b_signUp.setOnClickListener {
            finish()
        }

        tv_signIn.setOnClickListener {
            finish()
        }
    }
}