package com.example.bioinformatics_flashcard;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class flashcard_intro extends AppCompatActivity {

    private TextView question;

    private AppCompatButton option_1, option_2, option_3, option_4;

    private AppCompatButton next_button;

    private List<QuestionsList> questionsLists;

    private int currentQuestionPosition = 0;

    private String selectedOptionByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard_intro);

        // get the id for the question and options
        question = findViewById(R.id.question_intro_1);

        option_1 = findViewById(R.id.option_1);
        option_2 = findViewById(R.id.option_2);
        option_3 = findViewById(R.id.option_3);
        option_4 = findViewById(R.id.option_4);

        // get the id for the next button
        next_button = findViewById(R.id.next_button);

        // questionsLists is to get the questions from the QuestionsBank
        questionsLists = QuestionsBank.getQuestions();

        question.setText(questionsLists.get(0).getQuestion());
        option_1.setText(questionsLists.get(0).getOption_1());
        option_2.setText(questionsLists.get(0).getOption_2());
        option_3.setText(questionsLists.get(0).getOption_3());
        option_4.setText(questionsLists.get(0).getOption_4());

        // setOnClickListener method for every options
        option_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option_1.getText().toString();

                    option_1.setBackgroundResource(R.drawable.round_back_red10);
                    option_1.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option_2.getText().toString();

                    option_2.setBackgroundResource(R.drawable.round_back_red10);
                    option_2.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option_3.getText().toString();

                    option_3.setBackgroundResource(R.drawable.round_back_red10);
                    option_3.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option_4.getText().toString();

                    option_4.setBackgroundResource(R.drawable.round_back_red10);
                    option_4.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(flashcard_intro.this,"Please select an option", Toast.LENGTH_SHORT).show();
                }
                else{
                    changeNextQuestion();
                }
            }
        });
    }

    // next question method
    @SuppressLint("SetTextI18n")
    private void changeNextQuestion() {
        currentQuestionPosition++;

        if ((currentQuestionPosition + 1) == questionsLists.size()) {
            next_button.setText("Submit Quiz");
        }

        if (currentQuestionPosition < questionsLists.size()) {
            selectedOptionByUser = "";

            option_1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option_1.setTextColor(Color.parseColor("#1F6BB8"));

            option_2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option_2.setTextColor(Color.parseColor("#1F6BB8"));

            option_3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option_3.setTextColor(Color.parseColor("#1F6BB8"));

            option_4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option_4.setTextColor(Color.parseColor("#1F6BB8"));

            question.setText(questionsLists.get(currentQuestionPosition).getQuestion());
            option_1.setText(questionsLists.get(currentQuestionPosition).getOption_1());
            option_2.setText(questionsLists.get(currentQuestionPosition).getOption_2());
            option_3.setText(questionsLists.get(currentQuestionPosition).getOption_3());
            option_4.setText(questionsLists.get(currentQuestionPosition).getOption_4());
        } else {

            Intent intent = new Intent(this, intro_quiz_results.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getInCorrectAnswers());
            startActivity(intent);

            finish();
        }
    }

    // method to count all of the correct answers
    private int getCorrectAnswers(){

        int correctAnswers = 0;

        for(int i=0; i<questionsLists.size();i++){

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if(getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }

        return correctAnswers;
    }

    // method to count all of the incorrect answers
    private int getInCorrectAnswers(){

        int correctAnswers = 0;

        for(int i=0; i<questionsLists.size();i++){

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if(!getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }

        return correctAnswers;
    }

    // reveal answer method for the correct answers: set the button background as green
    private void revealAnswer(){
        final String getAnswer = questionsLists.get(currentQuestionPosition).getAnswer();

        if(option_1.getText().toString().equals(getAnswer)){
            option_1.setBackgroundResource(R.drawable.round_back_green10);
            option_1.setTextColor(Color.WHITE);
        }
        else if(option_2.getText().toString().equals(getAnswer)){
            option_2.setBackgroundResource(R.drawable.round_back_green10);
            option_2.setTextColor(Color.WHITE);
        }
        else if(option_3.getText().toString().equals(getAnswer)){
            option_3.setBackgroundResource(R.drawable.round_back_green10);
            option_3.setTextColor(Color.WHITE);
        }
        else if(option_4.getText().toString().equals(getAnswer)){
            option_4.setBackgroundResource(R.drawable.round_back_green10);
            option_4.setTextColor(Color.WHITE);
        }
    }
}