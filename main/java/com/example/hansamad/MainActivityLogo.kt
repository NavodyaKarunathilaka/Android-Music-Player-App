package com.example.hansamad

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class MainActivityLogo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        // Optional: Add fade-in animation for the logo and app name
        val logoImage = findViewById<ImageView>(R.id.logoImage)
        val appName = findViewById<TextView>(R.id.MUSICHUB)

        logoImage.alpha = 0f
        logoImage.animate().setDuration(1000).alpha(1f)

        appName.alpha = 0f
        appName.animate().setDuration(1000).alpha(1f)

        // Delay and navigate to the main screen
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java)) // Correct activity to navigate to
            finish()
        }, 3000) // 3-second delay
    }
}
