package com.example.bioinformatics_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tlm_intro_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlm_intro2);
    }

    public void launch_TLM_1(View v){
        Intent i = new Intent(this, tlm_intro.class);
        startActivity(i);
    }

    public void launch_TLM_3(View a){
        Intent i = new Intent(this, tlm_intro_3.class);
        startActivity(i);
    }
}