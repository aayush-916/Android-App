package com.example.codeme

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivityCpp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cpp)
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
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL&si=yHn7PN4qAOCUKtZD")
            startActivity(intent)
        }

        notes.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://api.codewithharry.com/media/blogFiles/cpp-cheatsheet/C_Cheatsheet_CodeWithHarry.pdf")
            startActivity(intent)
        }
    }
}