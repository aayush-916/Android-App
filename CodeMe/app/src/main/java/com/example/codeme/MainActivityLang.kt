package com.example.codeme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivityLang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lang)
        val back1 = findViewById<ImageView>(R.id.back1)
        val c = findViewById<TextView>(R.id.c)
        val cpp = findViewById<TextView>(R.id.cpp)
        val python = findViewById<TextView>(R.id.webD)
        val java = findViewById<TextView>(R.id.dataAn)
        val javaScr = findViewById<TextView>(R.id.appD)
        val html = findViewById<TextView>(R.id.ai)
        val css = findViewById<TextView>(R.id.blockChain)
        val sql = findViewById<TextView>(R.id.video1)


        back1.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        c.setOnClickListener {
            val intent = Intent(this,MainActivityC::class.java)
            startActivity(intent)
        }
        cpp.setOnClickListener {
            val intent = Intent(this,MainActivityCpp::class.java)
            startActivity(intent)
        }
        python.setOnClickListener {
            val intent = Intent(this,MainActivitypython::class.java)
            startActivity(intent)
        }
        java.setOnClickListener {
            val intent = Intent(this,MainActivityJava::class.java)
            startActivity(intent)
        }
        javaScr.setOnClickListener {
            val intent = Intent(this,MainActivityJavaScr::class.java)
            startActivity(intent)
        }
        html.setOnClickListener {
            val intent = Intent(this,MainActivityHtml::class.java)
            startActivity(intent)
        }
        css.setOnClickListener {
            val intent = Intent(this,MainActivityCss::class.java)
            startActivity(intent)
        }
        sql.setOnClickListener {
            val intent = Intent(this,MainActivitysql::class.java)
            startActivity(intent)
        }
    }
}