package com.example.vaio.cardview;

public class Song {
    private String Title;
    private String Artist;
    private int Year;

    public Song(String title, String artist, int year) {
        Title = title;
        Artist = artist;
        Year = year;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
}
