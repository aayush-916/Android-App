package com.example.codeme

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val back1 = findViewById<ImageView>(R.id.back1)
        val lang = findViewById<TextView>(R.id.c)
        val dsa = findViewById<TextView>(R.id.cpp)
        val web = findViewById<TextView>(R.id.webD)
        val dataAn = findViewById<TextView>(R.id.dataAn)
        val appD = findViewById<TextView>(R.id.appD)
        val ai = findViewById<TextView>(R.id.ai)
        val blockChain = findViewById<TextView>(R.id.blockChain)
        back1.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        lang.setOnClickListener {
            val intent = Intent(this,MainActivityLang::class.java)
            startActivity(intent)
        }
        dsa.setOnClickListener {
            val intent = Intent(this,MainActivitydsa::class.java)
            startActivity(intent)
        }

        web.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agq5TrH9XLIKQvv0iaF2X3w&si=AahpgAGtOoaawvfE")
            startActivity(intent)
        }
        dataAn.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLxzTa0VPR9ryvGSuCm4RS8aeAvOLXz9XM&si=6rR1Ytwo76KLfop7")
            startActivity(intent)
        }
        appD.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLUhfM8afLE_NQbVaoIEhceR9npbY57Pdg&si=P3ySLVU-6AqKjvVK")
            startActivity(intent)
        }
        ai.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/live/kLqAGklbmq8?si=exh9AevFLFhoOtb6")
            startActivity(intent)
        }
        blockChain.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLgPmWS2dQHW-BRQCQCNYgmHUfCN115pn0&si=4LtEjsuH_BlR46ic")
            startActivity(intent)
        }


    }
}