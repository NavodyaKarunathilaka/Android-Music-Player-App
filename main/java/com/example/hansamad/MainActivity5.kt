package com.example.hansamad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val btnbutton5 = findViewById<ImageView>(R.id.btnbutton5)
        btnbutton5.setOnClickListener {
            val intent = Intent (this,MainActivity3::class.java)
            startActivity(intent)
        }

        val imageView30 = findViewById<ImageView>(R.id.imageView30)
        imageView30.setOnClickListener {
            val intent = Intent (this,MainActivity6::class.java)
            startActivity(intent)
        }
    }
}