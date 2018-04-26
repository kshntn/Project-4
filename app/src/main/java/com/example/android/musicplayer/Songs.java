package com.example.android.musicplayer;

public class Songs {
    private String songName;
    private int imageResourceId;
    private String artist;
    private int releaseYear;
    private String genre;

    public Songs(String vsongName, int vimageResourceId, String vartist, int vreleaseYear, String vgenre) {
        songName = vsongName;
        imageResourceId = vimageResourceId;
        artist = vartist;
        releaseYear = vreleaseYear;
        genre = vgenre;
    }

    public String getSongName() {
        return songName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getArtist() {
        return artist;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }
}