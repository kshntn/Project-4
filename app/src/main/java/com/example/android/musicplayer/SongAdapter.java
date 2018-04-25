package com.example.android.musicplayer;

import android.app.Activity;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs> {
    public SongAdapter(Activity context, ArrayList<Songs> Song) {
        super(context, 0, Song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_list, parent, false);
        }
        Songs currentWord = getItem(position);
        TextView Song_Name = ListItemView.findViewById(R.id.songName);
        Song_Name.setText(currentWord.getSongName());
        ImageView Image = ListItemView.findViewById(R.id.image);
        Image.setImageResource(currentWord.getImageResourceId());

        return ListItemView;

    }
}
