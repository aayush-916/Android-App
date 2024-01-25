package com.example.codeme

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivityHtml : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_html)
        val back1 = findViewById<ImageView>(R.id.back1)
        back1.setOnClickListener {
            val intent = Intent(this,MainActivityLang::class.java)
            startActivity(intent)
            finish()
        }
        val video1 = findViewById<TextView>(R.id.video1)
        val notes = findViewById<TextView>(R.id.notes)
        video1.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtu.be/HcOc7P5BMi4?si=wJSfvtp7JD-o3ssZ")
            startActivity(intent)
        }

        notes.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://api.codewithharry.com/media/blogFiles/html-cheatsheet/HTML_Cheatsheet_CWH.pdf")
            startActivity(intent)
        }
    }
}