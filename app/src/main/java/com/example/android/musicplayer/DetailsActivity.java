package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        if (getIntent().getExtras() != null) {
            songName = getIntent().getStringExtra(getString(R.string.song));
            artist = getIntent().getStringExtra(getString(R.string.artist));
            image = getIntent().getIntExtra(getString(R.string.image), 0);
            genre = getIntent().getStringExtra(getString(R.string.genre));
            ReleaseYear = getIntent().getIntExtra(getString(R.string.release), 0);
        } else {
            songName = "";
            artist = "";
            image = 0;
            genre = "";
            ReleaseYear = 0;
        }
        Toast.makeText(this, "Now Playing: " + songName, Toast.LENGTH_SHORT).show();
        art = findViewById(R.id.imageDetails);
        art.setImageResource(image);

        song = findViewById(R.id.name);
        song.setText(songName);


        artistName = findViewById(R.id.artist);
        artistName.setText(getString(R.string.artistDisplay) + " " + artist);

        release = findViewById(R.id.releaseYear);
        release.setText("(" + String.valueOf(ReleaseYear) + ")");

        genres = findViewById(R.id.genre);
        genres.setText(getString(R.string.genreDisplay) + " " + genre);

    }

    public void play(View v) {
        if (flag == 0) {
            ImageView playButton = findViewById(R.id.play);
            playButton.setImageResource(R.drawable.ic_play_arrow);
            flag = 1;
        } else if (flag == 1) {
            ImageView playButton = findViewById(R.id.play);
            playButton.setImageResource(R.drawable.ic_pause);
            flag = 0;
            Toast.makeText(this, getString(R.string.nowPlayingDisplay) + " " + songName, Toast.LENGTH_SHORT).show();
        }
    }


}
