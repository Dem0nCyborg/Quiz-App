package com.chandan.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btn_start :Button
    private lateinit var et_name : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start = findViewById<Button>(R.id.btn_start)
        et_name = findViewById(R.id.ed_name)

        btn_start.setOnClickListener {
            if (et_name.text.isNotEmpty()){
                startActivity(Intent(this,QuizQuestions::class.java))
            }
        }

    }
}