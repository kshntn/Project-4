package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ArrayList<Songs> Song = new ArrayList<>();
        Song.add(new Songs("Shape Of You", R.drawable.shape_of_you));
        Song.add(new Songs("Hello From The Other Side", R.drawable.hello));
        Song.add(new Songs("Lovers on the Sun", R.drawable.david_guetta));
        SongAdapter itemadapter = new SongAdapter(this, Song);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemadapter);
    }
}
