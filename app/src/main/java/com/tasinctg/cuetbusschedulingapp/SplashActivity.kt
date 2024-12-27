package com.tasinctg.cuetbusschedulingapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val fadeInText = findViewById<TextView>(R.id.splashText)

        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        fadeInText.startAnimation(fadeInAnimation)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3-second delay
    }
}
