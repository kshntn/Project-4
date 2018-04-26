package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    int image;
    String songName;
    String artist;
    String genre;
    int ReleaseYear;
    ImageView art;
    TextView song;
    TextView artistName;
    TextView release;
    TextView genres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        songName = getIntent().getStringExtra("song");
        artist = getIntent().getStringExtra("artist");
        image = getIntent().getIntExtra("image", 0);
        genre = getIntent().getStringExtra("genre");
        ReleaseYear = getIntent().getIntExtra("release", 0);

        art = findViewById(R.id.imageDetails);
        art.setImageResource(image);

        song = findViewById(R.id.name);
        song.setText(songName);

        artistName = findViewById(R.id.artist);
        artistName.setText(artist);

        release = findViewById(R.id.releaseYear);
        release.setText(String.valueOf(ReleaseYear));

        genres = findViewById(R.id.genre);
        genres.setText(genre);


    }


}
