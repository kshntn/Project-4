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
        if (Language.equals("English")) {
            setTitle("English Songs");
            Song.add(new Songs("Shape Of You", R.drawable.shape_of_you, "Ed Sheeran", 2017, "Pop"));
            Song.add(new Songs("Hello", R.drawable.hello, "Adele", 2015, "Soul"));
            Song.add(new Songs("Lovers on the Sun", R.drawable.david_guetta, "David Guetta", 2014, "Country"));
        } else if (Language.equals("Hindi")) {
            setTitle("Hindi Songs");
            Song.add(new Songs("Manwa Laage", R.drawable.manwalaage, "Arijit Singh, Shreya Ghoshal", 2014, "Filmi"));
            Song.add(new Songs("Kala Chashma", R.drawable.kala_chasma, "Neha Kakkar, Badshah, Amar Arshi", 2016, "Filmy"));
        } else if (Language.equals("Tamil")) {
            setTitle("Tamil Songs");
            Song.add(new Songs("Nenjukkul Peidhidum", R.drawable.nenjukkul_peidhidum, "Hariharan", 2008, "SoundTrack"));
            Song.add(new Songs("Maacho", R.drawable.macho, "Sid Sriram, Shweta Mohan", 2017, "Filmy"));
            Song.add(new Songs("Halena", R.drawable.irumugan, "Abhay Jodhpurkar, Christopher Stanley", 2016, "Filmy"));
        }
        SongAdapter itemadapter = new SongAdapter(this, Song);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemadapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Songs selectedSong = (Songs) parent.getItemAtPosition(position);
                Intent details = new Intent(SongsActivity.this, DetailsActivity.class);
                String song = selectedSong.getSongName();
                int image = selectedSong.getImageResourceId();
                String artist = selectedSong.getArtist();
                int release = selectedSong.getReleaseYear();
                String genre = selectedSong.getGenre();
                details.putExtra("song", song);
                details.putExtra("image", image);
                details.putExtra("artist", artist);
                details.putExtra("release", release);
                details.putExtra("genre", genre);
                startActivity(details);
            }
        });
    }
}
