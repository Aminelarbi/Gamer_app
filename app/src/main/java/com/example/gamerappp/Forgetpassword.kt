package com.example.gamerappp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Forgetpassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgetpassword)

        val paragraphTextView = findViewById<ImageView>(R.id.navigationIcon)
        paragraphTextView.setOnClickListener {

            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }
        val sms = findViewById<Button>(R.id.Sendsms)
        sms.setOnClickListener {

            val intent = Intent(this, OtpV::class.java)
            startActivity(intent)

        }


    }
}