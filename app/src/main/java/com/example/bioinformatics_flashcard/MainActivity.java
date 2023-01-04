package com.example.bioinformatics_flashcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // create variables
    private CardView intro, roadmap, genomics, metagenomics, metabolomics, proteomics, transcriptomics, epigenetics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // getting the object id
        intro = (CardView) findViewById(R.id.intro);
        roadmap = (CardView) findViewById(R.id.roadmap);
        genomics = (CardView) findViewById(R.id.genomics);
        metagenomics = (CardView) findViewById(R.id.metagenomics);
        metabolomics = (CardView) findViewById(R.id.metabolomics);
        proteomics = (CardView) findViewById(R.id.proteomics);
        transcriptomics = (CardView) findViewById(R.id.transcriptomics);
        epigenetics = (CardView) findViewById(R.id.epigenetics);

        // setting the onClickListener
        intro.setOnClickListener((View.OnClickListener)this);
        roadmap.setOnClickListener((View.OnClickListener)this);
        genomics.setOnClickListener((View.OnClickListener)this);
        metagenomics.setOnClickListener((View.OnClickListener)this);
        metabolomics.setOnClickListener((View.OnClickListener)this);
        proteomics.setOnClickListener((View.OnClickListener)this);
        transcriptomics.setOnClickListener((View.OnClickListener)this);
        epigenetics.setOnClickListener((View.OnClickListener)this);

    }

    @Override
    public void onClick(View v){
        Intent i;
        switch ( (v.getId())){
            case R.id.intro: i = new Intent(this,intro.class); startActivity(i); break;
            case R.id.roadmap: i = new Intent(this,roadmap.class); startActivity(i); break;
            case R.id.genomics: i = new Intent(this,genomics.class); startActivity(i); break;
            case R.id.metagenomics: i = new Intent(this,metagenomics.class); startActivity(i); break;
            case R.id.metabolomics: i = new Intent(this,metabolomics.class); startActivity(i); break;
            case R.id.proteomics: i = new Intent(this,proteomics.class); startActivity(i); break;
            case R.id.transcriptomics: i = new Intent(this,transcriptomics.class); startActivity(i); break;
            case R.id.epigenetics: i = new Intent(this,epigenetics.class); startActivity(i); break;

        }
    }
}