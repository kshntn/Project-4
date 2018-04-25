package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final ArrayList<Songs> Song = new ArrayList<>();
        Song.add(new Songs("Shape Of You", R.drawable.shape_of_you,"Ed Sheeran",2017,"Pop"));
//        Song.add(new Songs("Hello From The Other Side", R.drawable.hello));
//        Song.add(new Songs("Lovers on the Sun", R.drawable.david_guetta));
        SongAdapter itemadapter = new SongAdapter(this, Song);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemadapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Songs name =(Songs) parent.getItemAtPosition(position);
                Intent details = new Intent(EnglishActivity.this, DetailsActivity.class);
                details.putExtra("song",name);
                startActivity(details);
            }
        });
    }
}
