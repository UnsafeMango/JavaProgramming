package com.company;

public class Song {
    private String title;
    private double songDuration;

    public Song(String title, double songDuration) {
        this.title = title;
        this.songDuration = songDuration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.songDuration;
    }
}
