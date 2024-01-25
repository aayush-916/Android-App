package com.example.codeme

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivitydsa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitydsa)
        val back1 = findViewById<ImageView>(R.id.back1)
        val video1 = findViewById<TextView>(R.id.video1)
        val video2 = findViewById<TextView>(R.id.video2)
        val video3 = findViewById<TextView>(R.id.notes)
        back1.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        video1.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9ahIappRPN0MCAgtOu3lQjQi&si=hYuR4VP-oh4E6VCO")
            startActivity(intent)
        }
        video2.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&si=4QKPPsQz_SvTFkYo")
            startActivity(intent)
        }
        video3.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtube.com/playlist?list=PLxgZQoSe9cg0df_GxVjz3DD_Gck5tMXAd&si=6xjWpJM6UaT6AuVM")
            startActivity(intent)
        }
    }
}