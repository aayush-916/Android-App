package com.example.codeme

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_c)
        val back1 = findViewById<ImageView>(R.id.back1)
        back1.setOnClickListener {
            val intent = Intent(this,MainActivityLang::class.java)
            startActivity(intent)
            finish()
        }
        val video1 = findViewById<TextView>(R.id.video1)
        val video2 = findViewById<TextView>(R.id.video2)
        val notes = findViewById<TextView>(R.id.notes)
        video1.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLDDXuRcB-QG5fVqVOdN4XW2yUPMQfWKIU&si=gER4BYYClw_yavD6")
            startActivity(intent)
        }
        video2.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtu.be/irqbmMNs2Bo?si=6IkiqHuNqHSzlyYC")
            startActivity(intent)
        }
        notes.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://cwh-full-next-space.fra1.cdn.digitaloceanspaces.com/notes/C_Complete_Notes.pdf")
            startActivity(intent)
        }
    }
}