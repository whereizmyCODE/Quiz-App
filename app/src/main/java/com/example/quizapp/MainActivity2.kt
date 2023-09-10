package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var scored: TextView
    lateinit var button3:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        scored=findViewById(R.id.score)
        button3=findViewById(R.id.button3)

        val result3 = intent.getIntExtra(constant.correctans, 0)
        scored.text = "Your Score is $result3"

        button3.setOnClickListener {

            startActivity(Intent(this,MainActivity::class.java))

        }


    }
}