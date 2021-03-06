package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Intent songNameActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button english = findViewById(R.id.English);
        Button hindi = findViewById(R.id.Hindi);
        Button tamil = findViewById(R.id.Tamil);
        english.setOnClickListener(this);
        hindi.setOnClickListener(this);
        tamil.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.English:
                songNameActivity = new Intent(MainActivity.this, SongsActivity.class);
                songNameActivity.putExtra(getString(R.string.language), getString(R.string.english));
                startActivity(songNameActivity);
                break;
            case R.id.Hindi:
                songNameActivity = new Intent(MainActivity.this, SongsActivity.class);
                songNameActivity.putExtra(getString(R.string.language), getString(R.string.hindi));
                startActivity(songNameActivity);
                break;
            case R.id.Tamil:
                songNameActivity = new Intent(MainActivity.this, SongsActivity.class);
                songNameActivity.putExtra(getString(R.string.language), getString(R.string.tamil));
                startActivity(songNameActivity);
                break;
        }
    }
}
