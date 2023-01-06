package com.example.bioinformatics_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class intro_quiz_results extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_quiz_results);

        final TextView correctAnswer = findViewById(R.id.correct_answers);
        final TextView incorrectAnswer = findViewById(R.id.incorrect_answers);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        correctAnswer.setText("Correct Answers: " + String.valueOf(getCorrectAnswers));
        incorrectAnswer.setText("Incorrect Answers: " + String.valueOf(getIncorrectAnswers));

    }

    public void launch_intro_home(View v){
        Intent i = new Intent(this, intro.class);
        startActivity(i);
    }
}