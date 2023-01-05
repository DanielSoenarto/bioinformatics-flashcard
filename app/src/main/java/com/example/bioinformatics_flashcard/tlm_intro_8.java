package com.example.bioinformatics_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tlm_intro_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlm_intro8);
    }
    public void launch_TLM_7(View v){
        Intent i = new Intent(this, tlm_intro_7.class);
        startActivity(i);
    }

    public void launch_TLM_9(View a){
        Intent i = new Intent(this, tlm_intro_9.class);
        startActivity(i);
    }
}