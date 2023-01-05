package com.example.bioinformatics_flashcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class intro extends AppCompatActivity implements View.OnClickListener {

    // create variables
    private CardView tlm_intro, flashcard;
    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        // getting the object id
        tlm_intro = (CardView) findViewById(R.id.tlm_intro);
        flashcard = (CardView) findViewById(R.id.flashcard_intro);

        // setting the onClickListener
        tlm_intro.setOnClickListener((View.OnClickListener) this);
        flashcard.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch ((v.getId())) {
            case R.id.tlm_intro:
                i = new Intent(this, com.example.bioinformatics_flashcard.tlm_intro.class);
                startActivity(i);
                break;
            case R.id.flashcard_intro:
                i = new Intent(this, flashcard_intro.class);
                startActivity(i);
                break;
        }
    }
}