package com.example.android.musicplayer;

public class Songs {
    private String songName;
    private int imageResourceId;

    public Songs(String vsongName, int vimageResourceId) {
        songName = vsongName;
        imageResourceId = vimageResourceId;
    }

    public String getSongName() {
        return songName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}