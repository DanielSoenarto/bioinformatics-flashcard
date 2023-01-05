package com.example.bioinformatics_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tlm_intro_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlm_intro7);
    }
    public void launch_TLM_6(View v){
        Intent i = new Intent(this, tlm_intro_6.class);
        startActivity(i);
    }

    public void launch_TLM_8(View a){
        Intent i = new Intent(this, tlm_intro_8.class);
        startActivity(i);
    }
}