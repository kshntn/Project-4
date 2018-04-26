package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    int image;
    String name;
    ImageView art;
    TextView artistName;
    TextView release;
    TextView genres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        name = getIntent().getStringExtra("song");
        image = getIntent().getIntExtra("image",0);
        art=findViewById(R.id.imageDetails);
        art.setImageResource(image);
        artistName=findViewById(R.id.artist);
        artistName.setText(name);
        release=findViewById(R.id.releaseYear);
        release.setText("1999");
        genres=findViewById(R.id.genre);
        genres.setText("pop");


        }



    }
