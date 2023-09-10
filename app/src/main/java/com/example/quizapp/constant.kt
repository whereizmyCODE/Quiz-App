package com.example.quizapp


object constant {
 const val correctans:String ="correct"


    fun getquestion(): ArrayList<Question>{
        val Question = ArrayList<Question>()

        //1

        val ques1 =Question(1 , "What is the capital of Germany?",
            "Berlin",
            "Hamburg",
            "München",
            "Köln",
            1)
        Question.add(ques1)

        //2

        val ques2 =Question(2 , "How many time zones are there in Russia?",
            "11",
            "10",
            "1",
            "3",
            1

        )
        Question.add(ques2)

        //3

        val ques3 =Question(3 , "What country has the most islands in the world??",
            "Greenland",
            "Crotia",
            "China",
            "Sweden",
            4

        )
        Question.add(ques3)

        //4
        val ques4 =Question(4 , "Name the largest (not highest) mountain range in the world",
            "Himalayas",
            "Andes",
            "Kanchenjunga",
            "Rocky",
            2

        )
        Question.add(ques4)

        //5

        val ques5 =Question(5, "Who invented the World Wide Web",
            "Charles Babbage",
            "Tim Cook",
            "Tim Berners Lee",
            "Albert Einstein",
            3

        )
        Question.add(ques5)



        return Question

    }
}