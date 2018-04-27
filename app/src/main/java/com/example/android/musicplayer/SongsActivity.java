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
        Language = getIntent().getStringExtra(getString(R.string.language));
        final ArrayList<Songs> Song = new ArrayList<>();
        if (Language.equals(getString(R.string.english))) {
            setTitle(getString(R.string.english_songs));
            Song.add(new Songs(getString(R.string.shape_of_you), R.drawable.shape_of_you, getString(R.string.ed_sheeran), 2017, getString(R.string.pop)));
            Song.add(new Songs(getString(R.string.hello), R.drawable.hello, getString(R.string.adele), 2015, getString(R.string.soul)));
            Song.add(new Songs(getString(R.string.lovers), R.drawable.david_guetta, getString(R.string.david), 2014, getString(R.string.country)));
        } else if (Language.equals(getString(R.string.hindi))) {
            setTitle(getString(R.string.hindi_songs));
            Song.add(new Songs(getString(R.string.manwaLaage), R.drawable.manwalaage, getString(R.string.arjit), 2014, getString(R.string.filmy)));
            Song.add(new Songs(getString(R.string.kala), R.drawable.kala_chasma, getString(R.string.neha), 2016, getString(R.string.filmy)));
        } else if (Language.equals(getString(R.string.tamil))) {
            setTitle(getString(R.string.tamil_songs));
            Song.add(new Songs(getString(R.string.nenjukul), R.drawable.nenjukkul_peidhidum, getString(R.string.hariharan), 2008, getString(R.string.soundtrack)));
            Song.add(new Songs(getString(R.string.maacho), R.drawable.macho, getString(R.string.sid), 2017, getString(R.string.filmy)));
            Song.add(new Songs(getString(R.string.halena), R.drawable.irumugan, getString(R.string.abhay), 2016, getString(R.string.filmy)));
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
                details.putExtra(getString(R.string.song), song);
                details.putExtra(getString(R.string.image), image);
                details.putExtra(getString(R.string.artist), artist);
                details.putExtra(getString(R.string.release), release);
                details.putExtra(getString(R.string.genre), genre);
                startActivity(details);
            }
        });
    }
}
