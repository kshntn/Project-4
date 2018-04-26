package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    String Language;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Language = getIntent().getStringExtra("lang");
        final ArrayList<Songs> Song = new ArrayList<>();
        if(Language.equals("English") ){
            Song.add(new Songs("Shape Of You", R.drawable.shape_of_you, "Ed Sheeran", 2017, "Pop"));
//        Song.add(new Songs("Hello From The Other Side", R.drawable.hello));
//        Song.add(new Songs("Lovers on the Sun", R.drawable.david_guetta));
        }
        if(Language.equals("Tamil")){
            Song.add(new Songs("Pistah", R.drawable.pistah, "Shabareesh Varma", 2013, " indian pop"));
        }
        SongAdapter itemadapter = new SongAdapter(this, Song);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemadapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Songs selectedSong =(Songs) parent.getItemAtPosition(position);
                Intent details = new Intent(SongsActivity.this, DetailsActivity.class);
                String song = selectedSong.getSongName();
                int image=selectedSong.getImageResourceId();
                String artist=selectedSong.getArtist();
                int release=selectedSong.getReleaseYear();
                String genre=selectedSong.getGenre();
                details.putExtra("song",song);
                details.putExtra("image",image);
                details.putExtra("artist",artist);
                details.putExtra("release",release);
                details.putExtra("genre",genre);
                startActivity(details);
            }
        });
    }
}
