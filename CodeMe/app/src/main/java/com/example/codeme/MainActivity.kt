package com.example.codeme

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val inst1 = findViewById<ImageView>(R.id.insta1)
        val inst2 = findViewById<TextView>(R.id.insta2)
        inst1.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://instagram.com/mr_aayush_._?igshid=MzNlNGNkZWQ4Mg==")
            startActivity(intent)
        }
        inst2.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://instagram.com/mr_aayush_._?igshid=MzNlNGNkZWQ4Mg==")
            startActivity(intent)
        }

        btn.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


    }




}