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
//        english.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent songNameActivity = new Intent(MainActivity.this, SongsActivity.class);
//                startActivity(songNameActivity);
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.English:
                songNameActivity = new Intent(MainActivity.this, SongsActivity.class);
                songNameActivity.putExtra("lang","English");
                startActivity(songNameActivity);
                break;
            case R.id.Hindi:
                songNameActivity = new Intent(MainActivity.this, SongsActivity.class);
                songNameActivity.putExtra("lang","Hindi");
                startActivity(songNameActivity);
                break;
            case R.id.Tamil:
                songNameActivity = new Intent(MainActivity.this, SongsActivity.class);
                songNameActivity.putExtra("lang","Tamil");
                startActivity(songNameActivity);
                break;
        }
    }
}
