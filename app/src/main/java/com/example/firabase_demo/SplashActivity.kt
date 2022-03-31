package com.example.firabase_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.WindowManager

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)
        intViews()
    }

    private fun intViews() {
        countDownTimer()
    }

    private fun countDownTimer() {
        val timer = object : CountDownTimer(2000,2000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                openSignActivity()
            }
        }
        timer.start()
    }

    private fun openSignActivity() {
        val intent = Intent(this, SignInActivity::class.java);
        startActivity(intent)
        finish()
    }
}