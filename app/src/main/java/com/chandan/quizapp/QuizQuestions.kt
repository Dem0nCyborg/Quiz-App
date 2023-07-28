package com.chandan.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.chandan.quizapp.databinding.ActivityQuizQuestionsBinding
import java.text.FieldPosition

class QuizQuestions : AppCompatActivity(),OnClickListener {

    private lateinit var binding: ActivityQuizQuestionsBinding

    private lateinit var mquestionList : ArrayList<Question>
    private  var mcurrentPosition = 1
    private var correctAns = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mquestionList= Constant.QuestionList()
        Log.i("The no.of ques are:\t","${mquestionList.size}")

        for (i in mquestionList)
            Log.e("The questions are",i.question)/* Here "i" refers to the quelist and the members available within it
                                                         and the Log.e will display the msg as an error and in red */


        binding.optOne.setOnClickListener(this)
        binding.optTwo.setOnClickListener(this)
        binding.optThree.setOnClickListener(this)
        binding.optFour.setOnClickListener(this)


        getQuestion()





    }

    private fun getQuestion() {
        val question: Question = mquestionList[mcurrentPosition - 1]
        binding.pgbar.progress = mcurrentPosition

        binding.flgImg.setImageResource(question.img)

        binding.tvQuestion.text = question.question
        binding.tvPgrss.text = "$mcurrentPosition/${binding.pgbar.max}"

        binding.optOne.text = question.quesOne
        binding.optTwo.text = question.quesTwo
        binding.optThree.text = question.quesThree
        binding.optFour.text = question.quesFour

        if (mcurrentPosition == mquestionList.size){
            binding.btnSubmit.text = "SUBMIT"
        }else{
            binding.btnSubmit.text = "NEXT"
        }

    }

    private fun onDefaultView(){
        val option = ArrayList<TextView>()

        option.add(0,binding.optOne)
        option.add(1,binding.optTwo)
        option.add(2,binding.optThree)
        option.add(3,binding.optFour)

        for (i in option) {
            i.setTextColor(Color.parseColor("#7A8089"))
            i.setTypeface(Typeface.DEFAULT)
            i.background = ContextCompat.getDrawable(this,R.drawable.bg_ccorrect)
        }

    }

    private fun onSelectedOption(view: TextView,SelectedOptNum : Int){
        onDefaultView()
        val selectedoptnum = SelectedOptNum
        view.setTextColor(Color.parseColor("#363A43"))
        view.setTypeface(view.typeface,Typeface.BOLD)
        view.background = ContextCompat.getDrawable(
            this,R.drawable.tv_bg
        )

    }


    override fun onClick(view: View?) {
        when(view){
             binding.optOne -> {
                 onSelectedOption(binding.optOne,1)
             }

            binding.optTwo -> {
                onSelectedOption(binding.optTwo,2)
            }

            binding.optThree -> {
                onSelectedOption(binding.optThree,3)
            }

            binding.optFour -> {
                onSelectedOption(binding.optFour,4)
            }

        }
    }
}