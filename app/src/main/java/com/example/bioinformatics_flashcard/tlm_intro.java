package com.example.bioinformatics_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tlm_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlm_intro);
    }

    public void launch_TLM_2(View v){
        Intent i = new Intent(this, tlm_intro_2.class);
        startActivity(i);
    }
}