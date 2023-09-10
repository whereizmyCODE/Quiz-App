package com.example.quizapp


import android.content.Intent
import android.graphics.Color

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class Quizquestion : AppCompatActivity(), View.OnClickListener {

    private var currentposition: Int = 1
    private var Questions: ArrayList<Question>? = null
    private var selectedop: Int = 0
    lateinit var ques1: TextView
    lateinit var optionone: TextView
    lateinit var optiontwo: TextView
    lateinit var optionthree: TextView
    lateinit var optionfour: TextView
    lateinit var button2: Button
    private var mCorrectAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizquestion)
        Questions=constant.getquestion()
        ques1 = findViewById(R.id.ques1)
        optionone = findViewById(R.id.optionone)
        optiontwo = findViewById(R.id.optiontwo)
        optionthree = findViewById(R.id.optionthree)
        optionfour = findViewById(R.id.optionfour)
        button2 = findViewById(R.id.button2)

        setquestions()


        optionone.setOnClickListener(this)
        optiontwo.setOnClickListener(this)
        optionthree.setOnClickListener(this)
        optionfour.setOnClickListener(this)
        button2.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.optionone -> {

                selectedoption(optionone, 1)

            }

            R.id.optiontwo -> {

                selectedoption(optiontwo, 2)

            }

            R.id.optionthree -> {

                selectedoption(optionthree, 3)

            }

            R.id.optionfour -> {

                selectedoption(optionfour, 4)
            }

            R.id.button2 ->{
                if (selectedop == 0 ) {

                    currentposition++

                    when {
                        currentposition <= Questions!!.size -> {
                            setquestions()
                        }
                        else -> {

                            val intent = Intent(this, MainActivity2::class.java)
                            intent.putExtra(constant.correctans, mCorrectAnswers)

                            startActivity(intent)
                            finish()
                        }
                    }
                }
                    else {

                    val question = Questions?.get(currentposition - 1)
                    if (question!!.correctanswer == selectedop)
                        mCorrectAnswers++


                    if (currentposition == Questions!!.size) {
                        button2.text = "FINISH"
                    } else {
                        button2.text = "GO TO NEXT QUESTION"
                    }
                    selectedop = 0
                }

            }
        }
    }
   private fun setquestions() {
       val question = Questions!!.get(currentposition - 1)
       defaultview()

       if (currentposition == Questions!!.size) {
           button2.text = "FINISH"
       } else {
           button2.text="Submit"
       }
       ques1.text = question.question
       optionone.text = question.optionone
       optiontwo.text = question.optiontwo
       optionthree.text = question.optionthree
       optionfour.text = question.optionfour


   }

    private fun selectedoption(opview: TextView, defaultselectedop: Int) {
        defaultview()
        selectedop = defaultselectedop
        opview.setTextColor(Color.parseColor("#7A8089"))
        opview.typeface = Typeface.DEFAULT
        opview.background=ContextCompat.getDrawable(
            this,
            R.drawable.border_option)}

    private  fun defaultview(){
       val options =ArrayList<TextView>()
       options.add(0, optionone)
        options.add(1,optiontwo)
        options.add(2, optionthree)
        options.add(3, optionfour)
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.option1)}
    }












}



