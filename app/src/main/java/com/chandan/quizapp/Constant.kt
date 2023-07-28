package com.chandan.quizapp

object Constant {

    fun QuestionList () : ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
            "Which Country Flag Is This ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia","Africa","None of the Above",
            1
        )
        questionList.add(que1)

        val que2 = Question(1,
            "Which Country Flag Is This ?",
            R.drawable.ic_flag_of_australia,
            "Argentina","Australia","Africa","None of the Above",
            2
        )
        questionList.add(que2)

        val que3 = Question(1,
            "Which Country Flag Is This ?",
            R.drawable.ic_flag_of_belgium,
            "Argentina","Australia","Africa","Belgium",
            1
        )
        questionList.add(que3)

        val que4 = Question(1,
            "Which Country Flag Is This ?",
            R.drawable.ic_flag_of_brazil,
            "Argentina","Australia","Brazil","None of the Above",
            1
        )
        questionList.add(que4)


        return questionList
    }

}